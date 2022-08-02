package OOP;

/**
 * @author yangqee
 * @date 2022/8/2 4:11 下午
 */
public class ExplainStatic {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }
}
