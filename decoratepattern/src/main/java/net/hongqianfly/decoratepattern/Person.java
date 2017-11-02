package net.hongqianfly.decoratepattern;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Person implements Human {
    @Override
    public void wearClothes() {
        Log.e("msg","穿什么呢?");
    }

    @Override
    public void walkToWhere() {
        Log.e("msg","去哪里呢?");
    }
}
