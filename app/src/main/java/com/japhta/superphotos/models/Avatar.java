package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Avatar {

    @SerializedName("default")
    @Expose
    private Default aDefault;


    @SerializedName("large")
    @Expose
    private Large large;


    @SerializedName("small")
    @Expose
    private Small small;

    @SerializedName("tiny")
    @Expose
    private Tiny tiny;



    public Default getaDefault() {
        return aDefault;
    }

    public void setaDefault(Default aDefault) {
        this.aDefault = aDefault;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Tiny getTiny() {
        return tiny;
    }

    public void setTiny(Tiny tiny) {
        this.tiny = tiny;
    }
}
