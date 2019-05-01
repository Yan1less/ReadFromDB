package com.yan1less.readdb.pojo.E;


import lombok.Getter;
import lombok.Setter;


public class EFront {
    private EFront1 Volume;
    private EFront2 Volume_Snapshot;
    private EFront3 Volume_Storage;

    public EFront1 getVolume() {
        return Volume;
    }

    public void setVolume(EFront1 volume) {
        Volume = volume;
    }

    public EFront2 getVolume_Snapshot() {
        return Volume_Snapshot;
    }

    public void setVolume_Snapshot(EFront2 volume_Snapshot) {
        Volume_Snapshot = volume_Snapshot;
    }

    public EFront3 getVolume_Storage() {
        return Volume_Storage;
    }

    public void setVolume_Storage(EFront3 volume_Storage) {
        Volume_Storage = volume_Storage;
    }
}

