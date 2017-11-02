package net.hongqianfly.decoratepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
        // 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
        Human person = new Person();
        Decorator decorator = new Decorate1(person);
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
