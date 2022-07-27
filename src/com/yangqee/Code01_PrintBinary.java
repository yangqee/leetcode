package com.yangqee;

import com.sun.jmx.snmp.SnmpUnsignedInt;

/**
 * @author yangqee
 * @date 2022/6/17 2:05 下午
 */
public class Code01_PrintBinary {
    public static void print(int num){
        for (int i = 31; i >= 0; i--){
            System.out.print((num & (1<<i)) == 0? "0": "1");
        }
        System.out.println();
        /*
         * int 32-bit; double 64-bit; ...
         * for example:
         *
         * 5:       0000 0000 0000 0000  0000 0000 0000 0101
         * 1:       0000 0000 0000 0000  0000 0000 0000 0001
         * 5 & 1：  0000 0000 0000 0000  0000 0000 0000 0001
         *
         * 1:       0000 0000 0000 0000  0000 0000 0000 0010
         * 1 << 31: 1000 0000 0000 0000  0000 0000 0000 0000
         *
         *
         *
         * ((num & (1<<i)) == 0? "0": "1"):
         *
         **/

    }

    public static void main(String[] args){
        //1.32-bit
        int num = 666;
        print(num);
        System.out.println(num);
        print(num << 1);
        System.out.println(num << 1);
        print(num << 2);
        System.out.println(num << 2);
        print(num << 3);
        System.out.println(num << 3);


        //2.The maximum value of a Java integer：More than two hundred million( 2^32-1 )
        //Signed Integer ( -2^31 ~  2^31-1 ) > Unsigned Integer
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        print(a);

        //3.negative：(1 00...)B
        // Complement Code -> Primitive Code: Inverse code+1
        print(-1);
        print(-2);

        //4.The minmum value of a Java integer
        // Complement Code -> Primitive Code: Inverse code+1
        int b = Integer.MIN_VALUE;
        System.out.println(b);
        print(b);

        print(-1);
        print(~(-1)+1);
        System.out.println(~(-1)+1);

        print(-2);
        print(~(-2)+1);
        System.out.println(~(-2)+1);

        print(1);
        print(~(1)+1);
        System.out.println(~(1)+1);

        print(356);
        print(~(356)+1);
        System.out.println(~(356)+1);


        //5.
        System.out.println(Integer.MAX_VALUE);
        print(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        print(Integer.MIN_VALUE);

        System.out.println(SnmpUnsignedInt.MAX_VALUE);

        //+-*/  -> B

        //7.test
        int c = 1234;
        int d = 56789;
        print(c);
        print(d);
        print(c | d);
        print(c & d);
        print(c ^ d);

        int e = -1024;
        print(e);
        print(e >> 1);//add sign bit
        print(e >>> 1);//ignore sign bit
        print(e >>> 2);//ignore sign bit
        print(e >>> 3);//ignore sign bit
        System.out.println();

        int j = 3;
        print(j);
        print(j >> 1);//add sign bit
        print(j >>> 1);//ignore sign bit
        int f = 5;  //0000 0101
        int g = -f;
        g = (~f + 1);
        System.out.println(f);
        System.out.println(g);
        print(f);
        print(~f);
        print(~f+1);
        System.out.println((~f+1));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(~(Integer.MIN_VALUE)+1);
        print(Integer.MIN_VALUE);
        print(~(Integer.MIN_VALUE)+1);

        System.out.println(0);
        System.out.println(~0+1);
        print(0);
        print(~0+1);
        int m = 4;
        int h = 3;
        print(m);
        print(h);
        m = m^h;
        print(m);
        h = m^h;
        print(h);
        m = m^h;
        print(m);
    }
}
