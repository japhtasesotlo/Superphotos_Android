package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Small {


    @SerializedName("small")
    @Expose
    private String https;

    public String getHttps() {
        return https;
    }

    public void setHttps(String https) {
        this.https = https;
    }
}
