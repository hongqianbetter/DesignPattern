package net.hongqianfly.factorypattern.abstractFactory;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class FactoryBMW230 implements AnstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
