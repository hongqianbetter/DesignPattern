package net.hongqianfly.factorypattern.factoryMethod;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class CarFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bus();
    }
}
