package OOP;

/**
 * @author yangqee
 * @date 2022/8/2 4:11 下午
 */
/*
对于静态字段，无论修改哪个实例的静态字段，效果都是一样的：
所有实例的静态字段都被修改了，原因是静态字段并不属于实例：
        ┌──────────────────┐
ming ──>│Person instance   │
        ├──────────────────┤
        │name = "Xiao Ming"│
        │age = 12          │
        │number ───────────┼──┐    ┌─────────────┐
        └──────────────────┘  │    │Person class │
                              │    ├─────────────┤
                              ├───>│number = 99  │
        ┌──────────────────┐  │    └─────────────┘
hong ──>│Person instance   │  │
        ├──────────────────┤  │
        │name = "Xiao Hong"│  │
        │age = 15          │  │
        │number ───────────┼──┘
        └──────────────────┘
虽然实例可以访问静态字段，但是它们指向的其实都是Person class的静态字段。
所以，所有实例共享一个静态字段。

因此，不推荐用实例变量.静态字段去访问静态字段，因为在Java程序中，实例对象并没有静态字段。
在代码中，实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为类名.
静态字段来访问静态对象。

推荐用类名来访问静态字段。
可以把静态字段理解为描述class本身的字段（非实例字段）。对于上面的代码，更好的写法是：

Person.number = 99;
System.out.println(Person.number);
 */
public class ExplainStatic {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
        System.out.println(hong.number);
    }
}
