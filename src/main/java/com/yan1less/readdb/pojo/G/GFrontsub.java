package com.yan1less.readdb.pojo.G;

public class GFrontsub {
    private String name;
    private Integer category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "GFrontsub{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
