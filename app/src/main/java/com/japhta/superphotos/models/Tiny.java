package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Tiny {

    @SerializedName("tiny")
    @Expose
    private String tiny;

    public String getTiny() {
        return tiny;
    }

    public void setTiny(String tiny) {
        this.tiny = tiny;
    }
}
