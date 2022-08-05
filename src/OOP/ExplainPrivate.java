package OOP;

/**
 * @author yangqee
 * @date 2022/8/2 5:11 下午
 */
public class ExplainPrivate {
    public static void main(String[] args) {
        Inner i = new Inner();
        i.hi();
    }

    // private方法:
    private static void hello() {
        System.out.println("private hello!");
    }

    // 静态内部类:
    static class Inner {
        public void hi() {
            ExplainPrivate.hello();
        }
    }

}
