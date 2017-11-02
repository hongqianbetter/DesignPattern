package net.hongqianfly.builderpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public abstract class Computer {
    /**
     * 主板
     */
    protected  String mBoard;
    /**
     * 显示器
     */
    protected  String mDisplay;
    /**
     * 系统
     */
    protected  String mOS;

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
