package DataStructure;

/**
 * @author yangqee
 * @date 2022/6/20 9:04 上午
 */

//Left some questions unanswered
public class Code03_leetcode160 {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n >>> i & 1);
        }
        return res;

    }
    public static void main(String[] args){
        //2.
        Integer res = reverseBits(-3);
        System.out.println(res);

    }
}
