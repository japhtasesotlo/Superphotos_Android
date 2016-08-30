package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Large {

    @SerializedName("large")
    @Expose
    private String large;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}
