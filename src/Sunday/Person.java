package Sunday;

/**
 * @author yangqee
 * @date 2022/8/7 7:44 下午
 */
class Person {
    private String name;
    private String name1;
    private String name2;

    public String getName() {
        return name;
    }

    public String getName1() {
        return name1+name2;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
}