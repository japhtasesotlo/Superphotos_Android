package com.japhta.superphotos.interfaces;

import com.japhta.superphotos.models.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Japhta on 8/30/2016.
 */
public interface ApiInterface {

    @GET("photos?consumer_key=Z3WYDPo1nchPa2mic5N6YA4IWN1W5irAA5VpzY1L")
    Call<ApiResponse> getPopularPhotos(@Query("api_key") String apiKey);
}

