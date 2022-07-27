package com.yangqee;

/**
 * @author yangqee
 * @date 2022/6/20 2:24 上午
 */
public class Code02_BitwiseAndBitShiftOperators {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    /*
    leetcode67
     */
    public static String addBinary(String a, String b) {

        StringBuffer stringBuffer = new StringBuffer();

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int sign = 0;
        int aNum, bNum, num;
        while(aIndex >= 0 && bIndex >= 0) {
            aNum = a.charAt(aIndex--) - '0';
            bNum = b.charAt(bIndex--) - '0';

            num = sign + aNum + bNum;
            stringBuffer.append(num % 2);
            if(num / 2 == 1)
                sign = 1;
            else
                sign = 0;
        }

        while(aIndex >= 0) {
            aNum = a.charAt(aIndex--) - '0';
            num = aNum + sign;
            stringBuffer.append(num % 2);
            if(num / 2 == 1)
                sign = 1;
            else
                sign = 0;
        }

        while(bIndex >= 0) {
            bNum = b.charAt(bIndex--) - '0';
            num = bNum + sign;
            stringBuffer.append(num % 2);
            if(num / 2 == 1)
                sign = 1;
            else
                sign = 0;
        }

        if(sign == 1)
            stringBuffer.append('1');

        return stringBuffer.reverse().toString();
    }

    public static String addBinary2(String a, String b){
        StringBuffer stringBuffer = new StringBuffer();
        int sign = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        while( aIndex >= 0 || bIndex >= 0 || sign == 1) {
            sign += (aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0);
            sign += (bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0);
            stringBuffer.append(sign%2);
            sign /= 2;

        }
        return stringBuffer.reverse().toString();
    }

    //3.给定一个32位整数n，可以是0，有正负。返回该二进制数表达中1的个数。
    public static Integer count1(int n){//循环32次
        int res = 0;
        while (n!=0){
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
    public static Integer count2(int n){//循环只与1相关
        int res = 0;
        while (n!=0){       //n:      01000100  01000000
            n &= (n-1);     //n-1:    01000011  00111111
            res++;          //n&(n-1) 01000000  00000000
        }
        return res;
    }
    public static Integer count3(int n){//循环只与1相关
        int res = 0;
        while (n!=0){            //n:               01000100  01000000
            n -= n & (~n+1);     //n&(~n+1):        00000100  01000000
            res++;               //n -= n & (~n+1): 01000000  00000000
        }
        return res;
    }

    public static void main(String[] args){
        //3.
        int n = 3;
        Integer res = count2(n);
        print(n);
        System.out.println(res);
//        //1.exchange
//        int a = 4;// 100
//        int b = 3;// 011
//        print(a);
//        print(b);
//        a = a^b;
//        print(a);
//        b = a^b;
//        print(b);
//        a = a^b;
//        print(a);
//        System.out.println(a);
//        System.out.println(b);
        //2.
//        String res = addBinary("010","110");
//        System.out.println(res);
//        print(-3);

    }

    //2.maximum

}
