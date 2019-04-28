package com.yan1less.readdb.pojo.B;

public class BFront {
    private String Running_Instance;
    private String Enabled_Memory;
    private String Disk_Used;
    private String Disk_Available;
    private String Disk_Free;
    private String RAM_Free;


    @Override
    public String toString() {
        return "BFront{" +
                "Running_Instance='" + Running_Instance + '\'' +
                ", Enabled_Memory='" + Enabled_Memory + '\'' +
                ", Disk_Used='" + Disk_Used + '\'' +
                ", Disk_Available='" + Disk_Available + '\'' +
                ", Disk_Free='" + Disk_Free + '\'' +
                ", RAM_Free='" + RAM_Free + '\'' +
                '}';
    }

    public String getRunning_Instance() {
        return Running_Instance;
    }

    public void setRunning_Instance(String running_Instance) {
        Running_Instance = running_Instance;
    }

    public String getEnabled_Memory() {
        return Enabled_Memory;
    }

    public void setEnabled_Memory(String enabled_Memory) {
        Enabled_Memory = enabled_Memory;
    }

    public String getDisk_Used() {
        return Disk_Used;
    }

    public void setDisk_Used(String disk_Used) {
        Disk_Used = disk_Used;
    }

    public String getDisk_Available() {
        return Disk_Available;
    }

    public void setDisk_Available(String disk_Available) {
        Disk_Available = disk_Available;
    }

    public String getDisk_Free() {
        return Disk_Free;
    }

    public void setDisk_Free(String disk_Free) {
        Disk_Free = disk_Free;
    }

    public String getRAM_Free() {
        return RAM_Free;
    }

    public void setRAM_Free(String RAM_Free) {
        this.RAM_Free = RAM_Free;
    }
}
