package net.hongqianfly.factorypattern.abstractFactory;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class FactoryBMW320 implements AnstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
