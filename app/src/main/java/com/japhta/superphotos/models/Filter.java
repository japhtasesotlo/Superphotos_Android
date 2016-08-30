package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;

/**
 * Created by Japhta on 8/29/2016.
 */
public class Filter {

    @Expose
    private boolean category;

    @Expose
    private boolean exclude;

    public boolean getCategory(boolean category) {
        return category;
    }

    public boolean getExclude(boolean exclude) {
        return exclude;
    }
}
