package net.hongqianfly.singletonpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Singleton2 {


    private static final Singleton2 instance=new Singleton2();

    private Singleton2(){
    }

    /**
     * 饿汉式 天生线程安全
    * @return
     */
    public static Singleton2 getInstance(){
        return instance;
    }

}
