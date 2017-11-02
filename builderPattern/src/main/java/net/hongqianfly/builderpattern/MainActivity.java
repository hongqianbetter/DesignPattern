package net.hongqianfly.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
 private  static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User.Builder("wang", "HONG")
                .address("beijing")
                .age(18)
                .phone("18001225869")
                .build();

        Builder macbookBuilder = new MacbookBuilder();

        Director director = new Director(macbookBuilder);
        director.construct("aspire","dell");
        Computer computer = macbookBuilder.create();
        Log.e(TAG,computer.toString());
    }
}
