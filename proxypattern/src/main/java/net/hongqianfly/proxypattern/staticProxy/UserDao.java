package net.hongqianfly.proxypattern.staticProxy;

import android.util.Log;

import net.hongqianfly.proxypattern.IuserDao;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class UserDao implements IuserDao {


    @Override
    public void save() {
        Log.e("msg","---已经保存数据---");
    }
}
