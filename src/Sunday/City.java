package Sunday;

/**
 * @author yangqee
 * @date 2022/8/21 6:50 PM
 */

class City {
    String name;
    double latitude;
    double longitude;
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}
