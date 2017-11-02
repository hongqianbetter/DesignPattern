package net.hongqianfly.factorypattern.abstractFactory;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class EngineA implements Engine {
    public EngineA() {
        Log.e("msg","制造了Engine--A");
    }
}
