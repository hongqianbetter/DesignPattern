package net.hongqianfly.proxypattern.staticProxy;

import net.hongqianfly.proxypattern.IuserDao;

/**
 * Created by HongQian.Wang on 2017/11/2.
 *
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 2.缺点:

 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接
 口增加方法,目标对象与代理对象都要维护.
 */
//            代理模式：对被代理的对象提供访问控制
//    通过上述的例子可以看出，代理模式和装饰模式非常类似，甚至代码都类似。二者最主要的区别是：
// 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
// 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
//代理类 静态代理
public class UserDaoProxy implements IuserDao {
    //接收保存目标对象
    private IuserDao userDao;

    //代理对象,把目标对象传给代理对象,建立代理关系
    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {   //代理和装饰这里不同其他都一样
        userDao.save(); //执行目标对象的方法

    }
}
