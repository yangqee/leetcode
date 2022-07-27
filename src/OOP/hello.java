package OOP;

/**
 * @author yangqee
 * @date 2022/7/19 8:51 下午
 */
class Hello {
    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
    public static void main(String[] args){
        hello();
        hello("yangqee");
        hello("java",100);
    }
}