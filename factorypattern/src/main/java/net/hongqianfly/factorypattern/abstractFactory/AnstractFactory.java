package net.hongqianfly.factorypattern.abstractFactory;

/**
 * Created by HongQian.Wang on 2017/11/2.
 *  抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。比如
 *  宝马320系列使用空调型号A和发动机型号A，而宝马230系列使用空调型号B和发动机型号B，那么
 *  使用抽象工厂模式，在为320系列生产相关配件时，就无需制定配件的型号，它会自动根据车型生产对应的
 *  配件型号A。
 *  当每个抽象产品都有多于一个的具体子类的时候（空调有型号A和B两种，发动机也有型号A和B两种），工
 *  厂角色怎么知道实例化哪一个子类呢？比如每个抽象产品角色都有两个具体产品（产品空调有两个具体产品空调A和空
 *  调B）。抽象工厂模式提供两个具体工厂角色（宝马320系列工厂和宝马230系列工厂），分别对应于这两个具体
 *  产品角色，每一个具体工厂角色只负责某一个产品角色的实例化。每一个具体工厂类只负责创建抽象产品的某一个
 *  具体子类的实例。
 */

public interface AnstractFactory {
    public Engine createEngine();

    public Aircondition createAircondition();
}



