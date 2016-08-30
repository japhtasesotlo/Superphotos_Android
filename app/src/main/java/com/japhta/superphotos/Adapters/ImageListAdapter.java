package com.japhta.superphotos.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.japhta.superphotos.helpers.SquareImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Japhta on 8/30/2016.
 */
public class ImageListAdapter extends BaseAdapter {
    private final Context context;
    private List<String> urls = new ArrayList<String>();

    public ImageListAdapter(Context context, List<String> urls) {
        this.context = context;
        this.urls = urls;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        SquareImageView view = (SquareImageView) convertView;
        if (view == null) {
            view = new SquareImageView(context);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        String url = getItem(position);
        Picasso.with(context)
                .load(url)
                .fit()
                .tag(context)
                .into(view);

        return view;
    }

    @Override public int getCount() {
        return urls.size();
    }

    @Override public String getItem(int position) {
        return urls.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }
}