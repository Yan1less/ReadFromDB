package com.yan1less.readdb.pojo.D;

public class DFront {

    private DFront1 Instance;
    private DFront2 VCPU;
    private DFront3 Memory;

    public DFront1 getInstance() {
        return Instance;
    }

    public void setInstance(DFront1 instance) {
        Instance = instance;
    }

    public DFront2 getVCPU() {
        return VCPU;
    }

    public void setVCPU(DFront2 VCPU) {
        this.VCPU = VCPU;
    }

    public DFront3 getMemory() {
        return Memory;
    }

    public void setMemory(DFront3 memory) {
        Memory = memory;
    }
}
