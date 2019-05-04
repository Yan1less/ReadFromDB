package com.yan1less.readdb.pojo.G;

public class GFrontall {
    private String name;
    private Integer belong_category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBelong_category() {
        return belong_category;
    }

    public void setBelong_category(Integer belong_category) {
        this.belong_category = belong_category;
    }

    @Override
    public String toString() {
        return "GFrontall{" +
                "name='" + name + '\'' +
                ", belong_category='" + belong_category + '\'' +
                '}';
    }
}
