package com.yan1less.readdb.pojo.G;

import java.util.List;

/**
 * @Author Yan1less
 * @Date 2019/5/1 12:07
 * @Description TODO
 **/
public class GFront {
    private List<GFrontsub> subnets;
    private List<GFrontall> allocations;

    public List<GFrontsub> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<GFrontsub> subnets) {
        this.subnets = subnets;
    }

    public List<GFrontall> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<GFrontall> allocations) {
        this.allocations = allocations;
    }
}
