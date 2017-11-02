package net.hongqianfly.decoratepattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 * 装饰者与被装饰者拥有共同的超类
 */

//定义装饰者
public abstract class Decorator implements Human{

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
         human.wearClothes();
    }

    @Override
    public void walkToWhere() {
       human.walkToWhere();
    }
}
