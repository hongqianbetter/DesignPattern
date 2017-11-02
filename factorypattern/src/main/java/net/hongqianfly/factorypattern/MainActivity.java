package net.hongqianfly.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.hongqianfly.factorypattern.abstractFactory.FactoryBMW320;
import net.hongqianfly.factorypattern.factoryMethod.BikeFactory;
import net.hongqianfly.factorypattern.factoryMethod.Car;
import net.hongqianfly.factorypattern.factoryMethod.Factory;
import net.hongqianfly.factorypattern.simpleFactory.People;
import net.hongqianfly.factorypattern.simpleFactory.PeopleFactory;

//一、引言
//        1）还没有工厂时代：假如还没有工业革命，如果一个客户要一款宝马车,一般的做法是客户去创建一款宝马车，然后拿来用。
//        2）简单工厂模式：后来出现工业革命。用户不用去创建宝马车。因为客户有一个工厂来帮他创建宝马.想要什么车，这个工厂就可以建。比如想要320i系列车。工厂就创建这个系列的车。即工厂可以创建产品。
//        3）工厂方法模式时代：为了满足客户，宝马车系列越来越多，如320i，523i,30li等系列一个工厂无法创建所有的宝马系列。于是由单独分出来多个具体的工厂。每个具体工厂创建一种系列。即具体工厂类只能创建一个具体产品。但是宝马工厂还是个抽象。你需要指定某个具体的工厂才能生产车出来。
//        4）抽象工厂模式时代：随着客户的要求越来越高，宝马车必须配置空调。于是这个工厂开始生产宝马车和需要的空调。
//        最终是客户只要对宝马的销售员说：我要523i空调车，销售员就直接给他523i空调车了。而不用自己去创建523i空调车宝马车.
//        这就是工厂模式。

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //简单工厂模式
        People people = PeopleFactory.create(PeopleFactory.TYPE_AMERICAN);
        people.say();

        //抽象工厂模式
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createAircondition();
        factoryBMW320.createEngine();
        //工厂方法模式
        Factory bikeFactory = new BikeFactory();
        Car bike = bikeFactory.getCar();
        bike.gotoWork();

    }
}
