package com.yan1less.readdb.pojo.E;


import lombok.Getter;
import lombok.Setter;


public class EFront {
    private EFront1 front1;
    private EFront2 front2;
    private EFront3 front3;


    public EFront1 getFront1() {
        return front1;
    }

    public void setFront1(EFront1 front1) {
        this.front1 = front1;
    }

    public EFront2 getFront2() {
        return front2;
    }

    public void setFront2(EFront2 front2) {
        this.front2 = front2;
    }

    public EFront3 getFront3() {
        return front3;
    }

    public void setFront3(EFront3 front3) {
        this.front3 = front3;
    }
}

