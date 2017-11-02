package net.hongqianfly.factorypattern.factoryMethod;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Bike implements Car {
    @Override
    public void gotoWork() {
        Log.e("msg","骑自行车去上班");
    }
}
