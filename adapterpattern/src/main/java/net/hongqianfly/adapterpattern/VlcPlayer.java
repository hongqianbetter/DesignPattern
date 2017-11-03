package net.hongqianfly.adapterpattern;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/3.
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        Log.e("msg","播放vlc 视频:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
