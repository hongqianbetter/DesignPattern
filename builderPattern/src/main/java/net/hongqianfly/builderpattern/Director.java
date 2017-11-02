package net.hongqianfly.builderpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class Director {
    Builder mBuilder=null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    //使用导演类的话只要传参数就行，然后用传入的builder创建产品。
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
