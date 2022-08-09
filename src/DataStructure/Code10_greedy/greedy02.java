package DataStructure.Code10_greedy;

/**
 * @author yangqee
 * @date 2022/8/6 10:19 上午
 */
/*
（1）最自然智慧的算法
（2）用一种局部最功利的标准，总是做出在当前看来是最好的选择
（3）难点在于证明局部最功利的标准可以获得全局最优解
（4）对于贪心算法的学习主要以增加阅历和经验为主
 */
public class greedy02 {
    /*
    一个非常全面的贪心算法求解的题目：
    （1）给定一个由字符串组成的数组strs
        必须把所有的字符串拼接起来
        返回所有可能的拼接结果中，字典序最小的结果
     */
    /*
    两个字符串按照字典方式排序，大写大于小写
    abc bs
    abc abk
    ac b：如果两个字符串长度不一样，短的要补0（0的ASCII比a小），补到和前面一样长。
          再比较，ac < b0
    */

    /*
    java的String.compareTo就是在比较字典序
    如果第一个字符和参数的第一个字符不等，结束比较，返回第一个字符的ASCII码差值。
    如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至不等为止，返回该字符的ASCII码差值。
    如果两个字符串不一样长，可对应字符又完全一样，则返回两个字符串的长度差值。
    */

    public static void main(String[] args){
        String a = "abc";
        String b = "bcdfg";
        System.out.println(a.compareTo(b));

        String c = "abc";
        String d = "abedfg";
        System.out.println(c.compareTo(d));

        String e = "abc";
        String f = "abcdefg";
        System.out.println(e.compareTo(f));

        String g = "abcde";
        String h = "abcd";
        System.out.println(g.compareTo(h));
    }
    /*官方文档：
     *如果参数字符串等于此字符串，则返回值 0；
     *如果此字符串按字典顺序小于字符串参数，则*返回一个小于 0 的值；
     *如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值。

    public int compareTo(String anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        //取数组长度里面最小的
        int lim = Math.min(len1, len2);

        // 获得两个数组，这两个数组就是string的属性
        char v1[] = value;
        char v2[] = anotherString.value;

        int k = 0;
        while (k < lim) {
            //获取第K的字符，进行比较
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                //Java使用的是Unicode编码，因此返回这两个字符的Unicode差值。
                return c1 - c2;
            }
            k++;
        }

        //如果前lim个字符都相同，那么就返回长度差。
        return len1 - len2;
    }
     */

    /*
    开始做题(这题DP不如Greedy)
    [ac, bk, sc, ket]-> ac bk ket sc No
    Example：[ba, b] -> b ba 刚刚的贪心策略无效了

    x,y  （1）x字典序 <= y字典序， x前
         （2）否则， y前
         该方法上面已经证明错误

         （1）x.y <= y.x， x前
         （2）否则， y前
         怎么证明？

     */
}
