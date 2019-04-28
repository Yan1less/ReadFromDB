package com.yan1less.readdb.mapper;

import com.yan1less.readdb.annotation.DataSource;
import com.yan1less.readdb.pojo.A.Aarea;
import com.yan1less.readdb.pojo.B.BSql;
import com.yan1less.readdb.pojo.D.DSql;
import com.yan1less.readdb.pojo.G.ipamallocations;
import com.yan1less.readdb.pojo.G.ipamsubnets;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MyMapper {
    @DataSource
    public List<Aarea> selectAarea();
    @DataSource
    List<BSql> selectBarea();
    @DataSource
    List<DSql> selectDarea();



    @DataSource("cinder")
    List<String> selectEVolume();
    @DataSource("cinder")
    List<String> selectEGigabytes();
    @DataSource("cinder")
    List<String> selectEVolumesnap();



    @DataSource("neutron")
    String selectFarea(String resource);

    @DataSource("neutron")
    List<ipamsubnets> selectGSubnets();

    @DataSource("neutron")
    List<ipamallocations> selectGAllocations();
}
