package OOP;

/**
 * @author yangqee
 * @date 2022/8/2 4:12 下午
 */

/*
 * 静态字段和静态方法
在一个class中定义的字段，我们称之为实例字段。
实例字段的特点是，每个实例都有独立的字段，各个实例的同名字段互不影响。

还有一种字段，是用static修饰的字段，称为静态字段：static field。

实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，
所有实例都会共享该字段。举个例子：

class Person {
    public String name;
    public int age;
    // 定义静态字段number:
    public static int number;
}
 */
class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}