package com.yan1less.readdb.pojo.B;

public class BFront {
    private Integer Running_Instance;
    private Integer Enabled_Memory;
    private Integer Disk_Used;
    private Integer Disk_Available;
    private Integer Disk_Free;
    private Integer RAM_Free;


    public Integer getRunning_Instance() {
        return Running_Instance;
    }

    public void setRunning_Instance(Integer running_Instance) {
        Running_Instance = running_Instance;
    }

    public Integer getEnabled_Memory() {
        return Enabled_Memory;
    }

    public void setEnabled_Memory(Integer enabled_Memory) {
        Enabled_Memory = enabled_Memory;
    }

    public Integer getDisk_Used() {
        return Disk_Used;
    }

    public void setDisk_Used(Integer disk_Used) {
        Disk_Used = disk_Used;
    }

    public Integer getDisk_Available() {
        return Disk_Available;
    }

    public void setDisk_Available(Integer disk_Available) {
        Disk_Available = disk_Available;
    }

    public Integer getDisk_Free() {
        return Disk_Free;
    }

    public void setDisk_Free(Integer disk_Free) {
        Disk_Free = disk_Free;
    }

    public Integer getRAM_Free() {
        return RAM_Free;
    }

    public void setRAM_Free(Integer RAM_Free) {
        this.RAM_Free = RAM_Free;
    }
}
