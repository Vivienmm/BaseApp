package com.chinaso.baselibrary.net;

import java.io.Serializable;

/**
 * @auther Su Yuewen
 * @time 2019/4/16 15:35.
 */

public abstract class BaseEntity implements Serializable {

    private String title;
    private String content;
    private String picUrl;
    private String  date;
    private String  source;

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content == null ? "" : content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicUrl() {
        return picUrl == null ? "" : picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getDate() {
        return date == null ? "" : date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source == null ? "" : source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "title"+title+"content"+content+"picUrl"+picUrl+"date"+date+"source"+source;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
