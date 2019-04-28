package com.yan1less.readdb.pojo.G;

public class GFrontall {
    private String name;
    private String belong_category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelong_category() {
        return belong_category;
    }

    public void setBelong_category(String belong_category) {
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
