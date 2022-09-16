package Sunday;

/**
 * @author yangqee
 * @date 2022/8/21 8:27 PM
 */
public class todo{
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Xiao Ming");
// TODO：给Person增加重载方法setName(String,String)：
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName1());
    }
}