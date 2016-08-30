package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by Japhta on 8/30/2016.
 */
public class User {

    @Expose
    private int id;

    @Expose
    private String username;

    @Expose
    private String firstname;

    @Expose
    private String lastname;

    @Expose
    private String city;

    @Expose
    private String country;

    @Expose
    private int usertype;

    @Expose
    private String fullname;

    @Expose
    private String userpic_url;

    @Expose
    private String userpic_https_url;

    @Expose
    private String cover_url;

    @Expose
    private int upgrade_status;

    @Expose
    private boolean store_on;

    @Expose
    private int affection;

    @Expose
    private Avatar avatars;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUserpic_url() {
        return userpic_url;
    }

    public void setUserpic_url(String userpic_url) {
        this.userpic_url = userpic_url;
    }

    public String getUserpic_https_url() {
        return userpic_https_url;
    }

    public void setUserpic_https_url(String userpic_https_url) {
        this.userpic_https_url = userpic_https_url;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public int getUpgrade_status() {
        return upgrade_status;
    }

    public void setUpgrade_status(int upgrade_status) {
        this.upgrade_status = upgrade_status;
    }

    public boolean getStore_on(boolean store_on) {
        return store_on;
    }

    public void setStore_on(boolean store_on) {
        this.store_on = store_on;
    }

    public int getAffection() {
        return affection;
    }

    public void setAffection(int affection) {
        this.affection = affection;
    }

    public Avatar getAvatars() {
        return avatars;
    }

    public void setAvatars(Avatar avatars) {
        this.avatars = avatars;
    }

    public boolean getLicensing_requested(boolean licensing_requested)
    {
        return  licensing_requested;
    }


}
