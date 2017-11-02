package net.hongqianfly.factorypattern.abstractFactory;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class AirconditionA implements Aircondition {
    public AirconditionA() {
        Log.e("msg","制造了Aircondition--A");
    }
}
