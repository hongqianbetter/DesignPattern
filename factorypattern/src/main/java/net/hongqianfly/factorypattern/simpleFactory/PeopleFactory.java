package net.hongqianfly.factorypattern.simpleFactory;

/**
 * Created by HongQian.Wang on 2017/11/2.
 * 简单工厂模式（simple factory）是类的创建模式，又叫静态工厂方法（static factory method）模式。
 * 简单工厂模式就是由一个工厂类根据传入的参数决定创建哪一种的产品类。
 * 有4个角色
 * 工厂类角色：是具体产品类角色直接调用者。
 * 抽象产品角色：接口或抽象类，负责具体产品角色的定义，及与客户端的交互。
 * 具体产品角色：被工厂类创建的对象，也是客户端实际操作对象。
 * 客户端：调用工厂类产生实例，并调用实例的方法进行相应工作。
 */

public class PeopleFactory {
    public static final int TYPE_CHINESE = 0x0001;
    public static final int TYPE_AMERICAN = 0x0002;

    public static People create(int type) {
        if (type == TYPE_CHINESE) {

            return new Chinese();
        } else if (type == TYPE_AMERICAN) {
            return new American();
        }
        return null;
    }
}
