package com.yan1less.readdb.pojo.A;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author Yan1less
 * @Date 2019/4/27 8:47
 * @Description TODO instance
 **/

public class Aarea {
    private String hostname;
    private String vcpus;
    private String root_gb;
    private String memory_mb;
    private String created_at;//用“当前时间- create_at时间”， 计算出天数，再变成“年，月，日”格式的数据


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public String getRoot_gb() {
        return root_gb;
    }

    public void setRoot_gb(String root_gb) {
        this.root_gb = root_gb;
    }

    public String getMemory_mb() {
        return memory_mb;
    }

    public void setMemory_mb(String memory_mb) {
        this.memory_mb = memory_mb;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
