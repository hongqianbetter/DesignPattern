package net.hongqianfly.builderpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public abstract class Builder {
    public abstract Builder buildBoard(String board);
    public abstract Builder buildDisplay(String display);
    public abstract Builder buildOS();
    public abstract Computer create();

}
