package com.yan1less.readdb.pojo.B;

public class BSql {
    private String running_vms;
    private String memory_mb_used;
    private String local_gb_used;
    private String free_ram_mb;
    private String free_disk_gb;
    private String disk_available_least;

    public String getRunning_vms() {
        return running_vms;
    }

    public void setRunning_vms(String running_vms) {
        this.running_vms = running_vms;
    }

    public String getMemory_mb_used() {
        return memory_mb_used;
    }

    public void setMemory_mb_used(String memory_mb_used) {
        this.memory_mb_used = memory_mb_used;
    }

    public String getLocal_gb_used() {
        return local_gb_used;
    }

    public void setLocal_gb_used(String local_gb_used) {
        this.local_gb_used = local_gb_used;
    }

    public String getFree_ram_mb() {
        return free_ram_mb;
    }

    public void setFree_ram_mb(String free_ram_mb) {
        this.free_ram_mb = free_ram_mb;
    }

    public String getFree_disk_gb() {
        return free_disk_gb;
    }

    public void setFree_disk_gb(String free_disk_gb) {
        this.free_disk_gb = free_disk_gb;
    }

    public String getDisk_available_least() {
        return disk_available_least;
    }

    public void setDisk_available_least(String disk_available_least) {
        this.disk_available_least = disk_available_least;
    }
}
