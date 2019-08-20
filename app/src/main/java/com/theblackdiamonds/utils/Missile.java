package com.theblackdiamonds.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.theblackdiamonds.R;
import com.theblackdiamonds.views.GameView;

/**
 * Created by Kush Pandya on 8/20/2019.
 */
public class Missile {

    public Bitmap missile;
    public int x, y, mVelocity;

    public Missile(Context context) {
        missile = BitmapFactory.decodeResource(context.getResources(), R.drawable.missile);
        x = GameView.dWidth / 2 - getMissileWidth() / 2;
        y = GameView.dHeight - GameView.tankHeight - getMissileHeight() / 2;
        mVelocity = 50;
    }

    public int getMissileWidth() {
        return missile.getWidth();
    }

    public int getMissileHeight() {
        return missile.getHeight();
    }
}