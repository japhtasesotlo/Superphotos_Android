package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Image {

    @Expose
    private int size;

    @Expose
    private String url;

    @Expose
    private String https_url;

    @Expose
    private String format;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttps_url() {
        return https_url;
    }

    public void setHttps_url(String https_url) {
        this.https_url = https_url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
