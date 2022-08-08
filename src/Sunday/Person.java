package Sunday;

/**
 * @author yangqee
 * @date 2022/8/7 7:44 下午
 */
public class Person {
    public String name;
    public int age;
    public static void main(String[] args){
        Person ming = new Person();
        ming.name = "Xiao Ming"; // 对字段name赋值
        ming.age = 12; // 对字段age赋值
        System.out.println(ming.name); // 访问字段name

        Person hong = new Person();
        hong.name = "Xiao Hong";
        hong.age = 15;
    }
}
