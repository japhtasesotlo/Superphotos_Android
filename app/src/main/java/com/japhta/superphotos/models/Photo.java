package com.japhta.superphotos.models;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by Japhta on 8/30/2016.
 */
public class Photo {

    @Expose
    private int id;

    @Expose
    private int user_id;

    @Expose
    private String name;

    @Expose
    private String description;

    @Expose
    private String camera;

    @Expose
    private String lens;

    @Expose
    private String focal_length;

    @Expose
    private String iso;

    @Expose
    private String shutter_speed;

    @Expose
    private String aperture;

    @Expose
    private int times_viewed;

    @Expose
    private double rating;

    @Expose
    private int status;

    @Expose
    private String created_at;

    @Expose
    private int category;

    @Expose
    private float location;

    @Expose
    private float latitude;

    @Expose
    private float longitude;

    @Expose
    private String taken_at;

    @Expose
    private int hi_res_uploaded;

    @Expose
    private boolean for_sale;

    @Expose
    private int width;

    @Expose
    private int height;

    @Expose
    private int votes_count;

    @Expose
    private int favorites_count;

    @Expose
    private int comments_count;

    @Expose
    private boolean nsfw;

    @Expose
    private int sales_count;

    @Expose
    private String for_sale_date;

    @Expose
    private double highest_rating;

    @Expose
    private String highest_rating_date;


    @Expose
    private int license_type;

    @Expose
    private int converted;

    @Expose
    private int collections_count;

    @Expose
    private int crop_version;

    @Expose
    private boolean privacy;

    @Expose
    private boolean profile;

    @Expose
    public String image_url;

    @Expose
    private List<Image> images;

    @Expose
    private String url;

    @Expose
    private int positive_votes_count;

    @Expose
    private int converted_bits;

    @Expose
    private boolean watermark;

    @Expose
    private String image_format;

    @Expose
    private User user;

    @Expose
    private boolean licensing_requested;

    @Expose
    private boolean licensing_suggested;

    @Expose
    private boolean is_free_photo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getFocal_length() {
        return focal_length;
    }

    public void setFocal_length(String focal_length) {
        this.focal_length = focal_length;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getShutter_speed() {
        return shutter_speed;
    }

    public void setShutter_speed(String shutter_speed) {
        this.shutter_speed = shutter_speed;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public int getTimes_viewed() {
        return times_viewed;
    }

    public void setTimes_viewed(int times_viewed) {
        this.times_viewed = times_viewed;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public float getLocation() {
        return location;
    }

    public void setLocation(float location) {
        this.location = location;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getTaken_at() {
        return taken_at;
    }

    public void setTaken_at(String taken_at) {
        this.taken_at = taken_at;
    }

    public int getHi_res_uploaded() {
        return hi_res_uploaded;
    }

    public void setHi_res_uploaded(int hi_res_uploaded) {
        this.hi_res_uploaded = hi_res_uploaded;
    }

    public boolean getFor_sale(boolean for_sale)
    {
        return for_sale;
    }

    public void setFor_sale(boolean for_sale) {
        this.for_sale = for_sale;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVotes_count() {
        return votes_count;
    }

    public void setVotes_count(int votes_count) {
        this.votes_count = votes_count;
    }

    public int getFavorites_count() {
        return favorites_count;
    }

    public void setFavorites_count(int favorites_count) {
        this.favorites_count = favorites_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public boolean getNsfw(boolean nsfw) {
        return nsfw;
    }

    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
    }

    public int getSales_count() {
        return sales_count;
    }

    public void setSales_count(int sales_count) {
        this.sales_count = sales_count;
    }

    public String getFor_sale_date() {
        return for_sale_date;
    }

    public void setFor_sale_date(String for_sale_date) {
        this.for_sale_date = for_sale_date;
    }

    public double getHighest_rating() {
        return highest_rating;
    }

    public void setHighest_rating(double highest_rating) {
        this.highest_rating = highest_rating;
    }

    public String getHighest_rating_date() {
        return highest_rating_date;
    }

    public void setHighest_rating_date(String highest_rating_date) {
        this.highest_rating_date = highest_rating_date;
    }

    public int getLicense_type() {
        return license_type;
    }

    public void setLicense_type(int license_type) {
        this.license_type = license_type;
    }

    public int getConverted() {
        return converted;
    }

    public void setConverted(int converted) {
        this.converted = converted;
    }

    public int getCollections_count() {
        return collections_count;
    }

    public void setCollections_count(int collections_count) {
        this.collections_count = collections_count;
    }

    public int getCrop_version() {
        return crop_version;
    }

    public void setCrop_version(int crop_version) {
        this.crop_version = crop_version;
    }

    public boolean getPrivacy(boolean privacy) {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPositive_votes_count() {
        return positive_votes_count;
    }

    public void setPositive_votes_count(int positive_votes_count) {
        this.positive_votes_count = positive_votes_count;
    }

    public int getConverted_bits() {
        return converted_bits;
    }

    public void setConverted_bits(int converted_bits) {
        this.converted_bits = converted_bits;
    }

    public boolean getWatermark(boolean watermark)
    {
        return watermark;
    }

    public void setWatermark(boolean watermark) {
        this.watermark = watermark;
    }

    public String getImage_format() {
        return image_format;
    }

    public void setImage_format(String image_format) {
        this.image_format = image_format;
    }

    public void setLicensing_requested(boolean licensing_requested) {
        this.licensing_requested = licensing_requested;
    }

    public boolean getLicensing_suggested(boolean licensing_suggsted)
    {
        return  licensing_suggested;
    }

    public void setLicensing_suggested(boolean licensing_suggested) {
        this.licensing_suggested = licensing_suggested;
    }

    public boolean getIs_free_photo(boolean is_free_photo)
    {
        return is_free_photo;
    }

    public void setIs_free_photo(boolean is_free_photo) {
        this.is_free_photo = is_free_photo;
    }


}

