package net.hongqianfly.builderpattern;

/**
 * Created by HongQian.Wang on 2017/11/2.
 * 模式定义
 * 造者模式(Builder Pattern)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *优点 和 缺点
 * 使用Builder模式必然会导致写两遍相关属性的代码和SETTER方法，看起来有点吃力不讨好。然而需要看到的是，
 * 客户端代码的可用性和可读性得到了大大提高。与此同时，构造函数的参数数量明显减少调用起来非常直观。
 * Builder方法另外一个优势在于，单个builder构建多个对象时Builder参数可在创建期间进行调整，还可以根据对象不
 * 同而进行改变。这就像我越来越推崇的以“不变”应“万变”。Builder模式特别适合那些属性个数很多的类，我认为没有必
 * 要给那些本不需要设置值传递参数（设置null）。
 * 使用Builder模式是肯定会增加代码量的。此外，尽管客户端的代码可读性明显改善，但随之而来的客户端代码变得更
 * 加冗长。我还是坚持这一观点：相比较参数数量的增加，相同类型的参数混在一起，可选参数的增加而言，改善代码可读性更有价值。
 *
 * User类的属性都是不可变的。所有的属性都添加了final修饰符，并且在构造方法中设置了值。并且，对外只提供getters方法。
 *
 * 由于Builder是非线程安全的，所以如果要在Builder内部类中检查一个参数的合法性，必需要在对象创建完成之后再检查。
 */

//无director的建造者模式

public class User {
    private final String firstName;  //必穿参数
    private final String lastName;   //必穿参数
    private final int age;           //可选参数
    private final String phone;      //可选参数
    private final String address;    //可选参数

    private User(Builder builder) {  //User类的构造方法是私有的。也就是说调用者不能直接创建User对象。
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        //Builder的内部类构造方法中只接收必传的参数，并且该必传的参数适用了final修饰符。

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {  //Builder模式使用了链式调用。可读性更佳
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }


}
