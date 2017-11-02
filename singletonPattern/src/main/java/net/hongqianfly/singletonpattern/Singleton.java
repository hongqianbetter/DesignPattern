package net.hongqianfly.singletonpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Singleton {

    private static Singleton instance = null;

    //构造方法私有化
    private Singleton() {

    }

    /**
     * 线程安全 加同步锁
     *
     * @return
     */
//    public synchronized static Singleton getInstance() {
//        if (instance == null) {
//            return new Singleton();
//        }
//        return instance;
//    }

    /**
     * 双重检查锁定
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
