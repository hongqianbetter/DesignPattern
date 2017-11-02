package net.hongqianfly.proxypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.hongqianfly.proxypattern.dynaProxy.ProxyFactory;
import net.hongqianfly.proxypattern.staticProxy.UserDao;
import net.hongqianfly.proxypattern.staticProxy.UserDaoProxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();


        UserDao userDao2 = new UserDao();
        IuserDao  proxy = (IuserDao)new ProxyFactory(userDao2).getProxyInstance();
        proxy.save();//执行方法 代理对象
    }
}