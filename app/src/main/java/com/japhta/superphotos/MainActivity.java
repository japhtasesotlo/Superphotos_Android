package com.japhta.superphotos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

import com.japhta.superphotos.Adapters.ImageListAdapter;
import com.japhta.superphotos.models.ApiResponse;
import com.japhta.superphotos.models.Photo;
import com.japhta.superphotos.network.ApiClient;
import com.japhta.superphotos.interfaces.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.japhta.superphotos.R.id.gridview;

public class MainActivity extends AppCompatActivity {

        public List<String>  imageUrls = new ArrayList<String>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final GridView gridView = (GridView) findViewById(gridview);


        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ApiResponse> call = apiService.getPopularPhotos(getString(R.string.consumer_key));
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse>call, Response<ApiResponse> response) {
                List<Photo> photos = response.body().getPhotos();

                for (Photo photo : photos) {

                    imageUrls.add(photo.getImage_url());
                }

                gridView.setAdapter(new ImageListAdapter(getApplicationContext(), imageUrls));
            }

            @Override
            public void onFailure(Call<ApiResponse>call, Throwable t) {
                Toast.makeText(getApplicationContext(), "No Images to load" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
