package net.hongqianfly.factorypattern.simpleFactory;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class American implements People {
    @Override
    public void say() {
        Log.e("msg","I am a American");
    }
}
