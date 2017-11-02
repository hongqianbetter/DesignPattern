package net.hongqianfly.factorypattern.factoryMethod;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Bus implements Car {
    @Override
    public void gotoWork() {
        Log.e("msg","坐公交去上班");
    }
}
