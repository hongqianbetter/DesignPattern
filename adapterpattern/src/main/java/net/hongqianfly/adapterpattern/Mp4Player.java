package net.hongqianfly.adapterpattern;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/3.
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        Log.e("msg","播放mp4 视频:" + fileName);
    }
}
