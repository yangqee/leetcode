package Sunday;

/**
 * @author yangqee
 * @date 2022/7/3 6:40 下午
 */
//public：访问修饰符
//static: 关键字
//void: 返回类型
//main: 方法名
//String： String类
//args：字符串数组
public class Java20220703 {

    public static void main(String[] args){
//        int n = 100; // 定义变量n，同时赋值为100
//        System.out.println("n = " + n); // 打印n的值
//
//        n = 200; // 变量n赋值为200
//        System.out.println("n = " + n); // 打印n的值
//
//        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
//        System.out.println("x = " + x); // 打印x的值
//
//        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
//        System.out.println("x = " + x); // 打印x的值
//        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？

        /**
         * 基本数据类型
         *         整数：byte short int(4byte=32bit) long
         *         浮点数类型：float double
         *         字符类型：char
         *         布尔类型：boolean
         */
        /**
         * 计算机内存的最小存储单元是字节（byte)，一个字节就是一个8位二进制数，即8个bit。
         * (1byte = 8bit)
         * 它的二进制表示范围从00000000~11111111，换算成十进制是0~255，换算成十六进制是00~ff。
         *
         * 1KB = 1024 byte;   1MB = 1024KB;   1GB  = 1024MB;  1TB = 1024GB
         *
         * 4T = 4 x 1024G
         *    = 4 x 1024 x 1024M
         *    = 4 x 1024 x 1024 x 1024K
         *    = 4 x 1024 x 1024 x 1024 x 1024
         *    = 4398046511104
         *
         *        ┌───┐
         *   byte │   │
         *        └───┘
         *        ┌───┬───┐
         *  short │   │   │
         *        └───┴───┘
         *        ┌───┬───┬───┬───┐
         *    int │   │   │   │   │
         *        └───┴───┴───┴───┘
         *        ┌───┬───┬───┬───┬───┬───┬───┬───┐
         *   long │   │   │   │   │   │   │   │   │
         *        └───┴───┴───┴───┴───┴───┴───┴───┘
         *        ┌───┬───┬───┬───┐
         *  float │   │   │   │   │
         *        └───┴───┴───┴───┘
         *        ┌───┬───┬───┬───┬───┬───┬───┬───┐
         * double │   │   │   │   │   │   │   │   │
         *        └───┴───┴───┴───┴───┴───┴───┴───┘
         *        ┌───┬───┐
         *   char │   │   │
         *        └───┴───┘
         * */

        /**
         *整型
         * 对于整型类型，Java只定义了带符号的整型，因此，最高位的bit表示符号位（0表示正数，1表示负数）。各种整型能表示的最大范围如下：
         *
         * byte：-128 ~ 127
         * short: -32768 ~ 32767
         * int: -2147483648 ~ 2147483647
         * long: -9223372036854775808 ~ 9223372036854775807
         */
        /*
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(l);
        //特别注意：同一个数的不同进制的表示是完全相同的，例如15=0xf＝0b1111

        //浮点型
        //浮点类型的数就是小数，因为小数用科学计数法表示的时候，
        // 小数点是可以“浮动”的，如1234.5可以表示成12.345x10^2，也可以表示成1.2345x103，所以称为浮点数。
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        //对于float类型，需要加上f后缀。
        //浮点数可表示的范围非常大，float类型可最大表示3.4x1038，
        // 而double类型可最大表示1.79x10308。

        //布尔类型
        //布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果：
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(isGreater);
        System.out.println(isAdult);
        //Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，
        //但是通常JVM内部会把boolean表示为4字节整数。

        //字符类型
        //字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
        char a = 'A';
        System.out.println(a);
        //注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        */

        //引用类型
        //除了上述基本类型的变量，剩下的都是引用类型。例如，引用类型最常用的就是String字符串：
        String s = "hello";
        //引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置，后续我们介绍类的概念时会详细讨论。


    }

}
