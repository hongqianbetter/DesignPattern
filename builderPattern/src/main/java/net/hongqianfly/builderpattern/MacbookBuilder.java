package net.hongqianfly.builderpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 */

public class MacbookBuilder extends Builder {

    private Computer mComputer=new Macbook();

    @Override
    public Builder buildBoard(String board) {
         mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setmOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
