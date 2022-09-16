package Sunday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author yangqee
 * @date 2022/8/28 6:34 PM
 */
public class ex1 {
    public static void main(String[] args) throws ParseException {
//        System.out.println("请在下面输出字母或数字：");
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        char[] ch = str.toCharArray();
//        int shuzi = 0, zimu = 0;
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] >= '0' && ch[i] <= '9') {
//                shuzi++;
//            } else if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
//                zimu++;
//            }
//        }
//        System.out.println("字母有：" + zimu + "个");
//        System.out.println("数字有：" + shuzi + "个");
 /* 根据输入的年份、产品类型和随机数产生固定资产编号
        即：固定资产编号=年份+0+产品类型+3位随机数
        程序运行流程：请输入年份：……
        请选择产品类型（1. 台式机 2. 笔记本 3. 其他）：……
        生成3位随机数
                最后显示固定资产编号
        提示：3位随机数按如下方法产生：
        (int)(Math.random()*1000);*/

//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入年份：");
//            String year = sc.next();
//            System.out.println("请选择产品类型（1. 台式机 2. 笔记本 3. 其他）：");
//            String id = sc.next();
//            int i = (int) (Math.random()*900+100);// 0-899 100-999
//            System.out.println("产品编号为："+year+id+i);


        /**
         * 计算某年、某月、某日和某年、某月、某日之间的天数间隔和周数。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个日期");
        String str = sc.nextLine();
        System.out.println("输入第二个日期");
        String str1 = sc.nextLine();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sd.parse(str);
        Date d1 = sd.parse(str1);
        long l = 0;
        if (d.after(d1)) {
            l = d.getTime() - d1.getTime();
        } else {
            l = d1.getTime() - d.getTime();
        }
        long a = 1000 * 60 * 60 * 24;
        long day = l / a;
        long week = day / 7;
        System.out.println("两个日期相隔" + day + "天");
        System.out.println("两个日期相隔" + week + "周");
    }
}
