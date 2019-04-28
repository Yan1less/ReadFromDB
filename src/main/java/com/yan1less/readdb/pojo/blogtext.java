package com.yan1less.readdb.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @Author Yan1less
 * @Date 2019/4/24 17:29
 * @Description TODO
 **/

public class blogtext {
    private String textid;
    private String title;
    private String content;
    private String editdate;
    private String img;
    private String link;

    public String getTextid() {
        return textid;
    }

    public void setTextid(String textid) {
        this.textid = textid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEditdate() {
        return editdate;
    }

    public void setEditdate(String editdate) {
        this.editdate = editdate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
