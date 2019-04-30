package com.yan1less.readdb.service;

import com.google.gson.Gson;
import com.yan1less.readdb.pojo.A.AFront;
import com.yan1less.readdb.pojo.A.Aarea;
import com.yan1less.readdb.pojo.A.AareaDeail;
import com.yan1less.readdb.mapper.MyMapper;
import com.yan1less.readdb.pojo.B.BFront;
import com.yan1less.readdb.pojo.B.BSql;
import com.yan1less.readdb.pojo.D.*;

import com.yan1less.readdb.pojo.E.EFront;
import com.yan1less.readdb.pojo.E.EFront1;
import com.yan1less.readdb.pojo.E.EFront2;
import com.yan1less.readdb.pojo.E.EFront3;
import com.yan1less.readdb.pojo.F.*;
import com.yan1less.readdb.pojo.G.GFrontall;
import com.yan1less.readdb.pojo.G.GFrontsub;
import com.yan1less.readdb.pojo.G.ipamallocations;
import com.yan1less.readdb.pojo.G.ipamsubnets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MyService {
    @Autowired
    private MyMapper mapper;


    private static Integer defaultsum = 1998;

    public AareaDeail selectAarea() {
        AareaDeail aareaDeail = new AareaDeail();
        List<Aarea> aareas = mapper.selectAarea();
        List<AFront> aFronts = new ArrayList<AFront>();
        //2019-02-19 06:28:55
//        long before = Timestamp.valueOf(before).getTime();
//        long after = Timestamp.valueOf(after).getTime();
//        long days = (after-before) / (1000 * 60 * 60 * 24);
//        long hours = ((after-before)-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = df.format(date);

        for (Aarea a :aareas){
            AFront aFront = new AFront();
            aFront.setInstance_Name(a.getHostname());
            aFront.setVCPU_Number(Integer.parseInt(a.getVcpus()));
            aFront.setDisk_Capacity(Integer.parseInt(a.getRoot_gb()));
            aFront.setMemory_Capacity(Integer.parseInt(a.getMemory_mb()));
            //用“当前时间- create_at时间”， 计算出天数，再变成“年，月，日”格式的数据
            long before = Timestamp.valueOf(a.getCreated_at()).getTime();
            long after = Timestamp.valueOf(now).getTime();
            long days = (after-before) / (1000 * 60 * 60 * 24);
            long hours = ((after-before)-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);

            aFront.setCreation_Time(days+" 天， "+hours + "小时");
            aFronts.add(aFront);
        }
        aareaDeail.setData(aFronts);
        return aareaDeail;
    }

    public BFront selectBarea() {
        List<BSql> bsqls = mapper.selectBarea();
        Integer Running_vms = 0,Memory_mb_used= 0,Local_gb_used= 0,Disk_available_least= 0,Free_ram_mb= 0,Free_disk_gb= 0;

        for(BSql bsql : bsqls){
            Running_vms += Integer.parseInt(bsql.getRunning_vms());
            Memory_mb_used += Integer.parseInt(bsql.getMemory_mb_used());
            Local_gb_used +=Integer.parseInt(bsql.getLocal_gb_used());
            Disk_available_least += Integer.parseInt(bsql.getDisk_available_least());
            Free_ram_mb += Integer.parseInt(bsql.getFree_ram_mb());
            Free_disk_gb += Integer.parseInt(bsql.getFree_disk_gb());
        }

        BFront bfront = new BFront();
        bfront.setRunning_Instance(Running_vms);
        bfront.setEnabled_Memory(Memory_mb_used);
        bfront.setDisk_Used(Local_gb_used);
        bfront.setDisk_Available(Disk_available_least);
        bfront.setDisk_Free(Free_ram_mb);
        bfront.setRAM_Free(Free_disk_gb);
        return bfront;
    }
    //返回带有对象名的json
    public String selectDarea() {
        List<DSql> dSqls = mapper.selectDarea();
        Integer Instance_Used=0,VCPU_Used=0,Memory_Used=0;

        for(DSql d: dSqls){
            Instance_Used += Integer.parseInt(d.getRunning_vms());
            VCPU_Used += Integer.parseInt(d.getVcpu_used());
            Memory_Used +=Integer.parseInt(d.getMemory_mb_used());
        }

        DFront1 dFront1 = new DFront1();
        dFront1.setInstance_Used(Instance_Used);
        dFront1.setInstance_Total(defaultsum);
        DFront2 dFront2 = new DFront2();
        dFront2.setVCPU_Used(VCPU_Used);
        dFront2.setVCPU_Total(defaultsum);
        DFront3 dFront3 = new DFront3();
        dFront3.setMemory_Used(Memory_Used);
        dFront3.setMemory_Total(defaultsum);

        DFront dFront = new DFront();


        dFront.setInstance(dFront1);
        dFront.setVCPU(dFront2);
        dFront.setMemory(dFront3);

        //gson测试
        Gson gson = new Gson();
        String a = gson.toJson(dFront1);
        String b = gson.toJson(dFront2);
        String c = gson.toJson(dFront3);

        return  "["+a+","+b+","+c+"]";
    }

    public String selectEarea() {
        EFront1 eFront1 = new EFront1();
        EFront2 eFront2 = new EFront2();
        EFront3 eFront3 = new EFront3();

        List<String> volume = mapper.selectEVolume();
        eFront1.setVolume_Used(
                Integer.parseInt(
                        String.valueOf(
                                volume.stream().mapToInt(string -> Integer.parseInt(string)).summaryStatistics().
                                        getSum()
                        )
                )
        );
        eFront1.setVolume_Total(defaultsum);

        List<String> volumesnap = mapper.selectEVolumesnap();
        eFront2.setVolume_Snapshot_Used(
                Integer.parseInt(
                        String.valueOf(
                                volumesnap.stream().mapToInt(string -> Integer.parseInt(string)).summaryStatistics().
                                        getSum()
                        )
                )
        );
        eFront2.setVolume_Snapshot_Total(defaultsum);


        List<String> gigabytes = mapper.selectEGigabytes();
        eFront3.setVolume_Storage_Used(
                Integer.parseInt(
                        String.valueOf(
                                gigabytes.stream().mapToInt(string -> Integer.parseInt(string)).summaryStatistics().
                                        getSum()
                        )
                )
        );
        eFront3.setVolume_Storage_Total(defaultsum);

        Gson gson = new Gson();
        return "["+gson.toJson(eFront1)+","+
                gson.toJson(eFront2)+","+gson.toJson(eFront3)+"]";

    }

    public String selectFarea() {
        FFloat fFloat = new FFloat();
        FInternet fInternet = new FInternet();
        FPort fPort = new FPort();
        FRouting fRouting = new FRouting();
        FSecurity fSecurity = new FSecurity();

        fFloat.setFloat_IP_Used(Integer.parseInt(mapper.selectFarea("floatingip")));
        fFloat.setFloat_IP_Total(defaultsum);
        fSecurity.setSecurity_Group_Used(Integer.parseInt(mapper.selectFarea("security_group")));
        fSecurity.setSecurity_Group_Total(defaultsum);
        fInternet.setInternet_Used(Integer.parseInt(mapper.selectFarea("network")));
        fInternet.setInternet_Total(defaultsum);
        fPort.setPort_Used(Integer.parseInt(mapper.selectFarea("port")));
        fPort.setPort_Total(defaultsum);
        fRouting.setRouting_Used(Integer.parseInt(mapper.selectFarea("router")));
        fRouting.setRouting_Total(defaultsum);

        Gson gson = new Gson();
        String result = "["+gson.toJson(fFloat)+","+
                gson.toJson(fSecurity)+","+
                gson.toJson(fInternet)+","+
                gson.toJson(fPort)+","+
                gson.toJson(fRouting)+"]";

        return result;
    }

    public String selectGarea() {
        List<ipamsubnets> list = mapper.selectGSubnets();
        List<GFrontsub> frontList = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            GFrontsub gFrontsub = new GFrontsub();
            gFrontsub.setName("路由"+(i+1));
            gFrontsub.setCategory(list.get(i).getId());
            frontList.add(gFrontsub);

        }
//        for(GFrontsub i:frontList){
//            System.out.println(i.toString());
//        }

        List<ipamallocations> list2 = mapper.selectGAllocations();
        List<GFrontall> frontlist2 = new ArrayList<>();

        for(ipamallocations l : list2){
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId().equals( l.getIpam_subnet_id())){
                    GFrontall gFrontall = new GFrontall();
                    gFrontall.setBelong_category(list.get(i).getId());
                    gFrontall.setName(l.getIp_address());
                    frontlist2.add(gFrontall);
                }
            }
        }

        StringBuffer result = new StringBuffer("[");
        Gson gson = new Gson();
        for(GFrontsub gs: frontList){
            result.append(gson.toJson(gs)+",");
        }

        for(GFrontall ga:frontlist2){
            result.append(gson.toJson(ga)+",");
        }
        result.append("]");


        return result.toString();
    }
}
