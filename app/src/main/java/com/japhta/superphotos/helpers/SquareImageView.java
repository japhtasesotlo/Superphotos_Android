package com.japhta.superphotos.helpers;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by Japhta on 8/30/2016.
 */
public class SquareImageView extends ImageView
{
    public SquareImageView(Context context) {
        super(context);
    }
    //three constructors

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}