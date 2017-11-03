package net.hongqianfly.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc","a.vlc");
        audioPlayer.play("mp4","b.mp4");
        audioPlayer.play("sss","c.xxx");


    }
}
