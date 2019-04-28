package com.yan1less.readdb.pojo.A;

public class AFront {
    private String Instance_Name;
    private String VCPU_Number;
    private String Disk_Capacity;
    private String Memory_Capacity;
    private String Creation_Time;


    public String getInstance_Name() {
        return Instance_Name;
    }

    public void setInstance_Name(String instance_Name) {
        Instance_Name = instance_Name;
    }

    public String getVCPU_Number() {
        return VCPU_Number;
    }

    public void setVCPU_Number(String VCPU_Number) {
        this.VCPU_Number = VCPU_Number;
    }

    public String getDisk_Capacity() {
        return Disk_Capacity;
    }

    public void setDisk_Capacity(String disk_Capacity) {
        Disk_Capacity = disk_Capacity;
    }

    public String getMemory_Capacity() {
        return Memory_Capacity;
    }

    public void setMemory_Capacity(String memory_Capacity) {
        Memory_Capacity = memory_Capacity;
    }

    public String getCreation_Time() {
        return Creation_Time;
    }

    public void setCreation_Time(String creation_Time) {
        Creation_Time = creation_Time;
    }
}


