package net.hongqianfly.adapterpattern;

import android.util.Log;

/**
 * Created by HongQian.Wang on 2017/11/3.
 */


public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
           if(audioType.equalsIgnoreCase("mp3")) {//原有的mediaplayer只能播放MP3格式的视频
               Log.e("msg:","play mp3 ,fileName:"+fileName);
           }else if(audioType.equalsIgnoreCase("vlc") ||
                   audioType.equalsIgnoreCase("mp4")) {
              mediaAdapter = new MediaAdapter(audioType);
              mediaAdapter.play(audioType,fileName);
           }else {
               Log.e("msg","invalid Media ."+audioType);
           }
    }
}
