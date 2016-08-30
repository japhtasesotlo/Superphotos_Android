package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;
import com.japhta.superphotos.models.Filter;
import com.japhta.superphotos.models.Photo;

import java.util.List;

/**
 * Created by Japhta on 8/29/2016.
 */
public class ApiResponse {

    @Expose
    private int current_page;

    @Expose
    private int total_items;

    @Expose
    private List<Photo> photos;

    @Expose
    private Filter filters;

    @Expose
    private String feature;


    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Filter getFilters() {
        return filters;
    }

    public void setFilters(Filter filters) {
        this.filters = filters;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
