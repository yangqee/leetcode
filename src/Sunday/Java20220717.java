package Sunday;//不用抄写，这是你们自己的包，和老师不一样，不用改

import java.util.Random;
import java.util.Scanner;

/**
 * @author yangqee
 * @date 2022/7/17 7:34 下午
 */
public class Java20220717 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);

        int a=0;//用户成功次数
        int b=0;//平局场次
        int c=0;//电脑成功次数
        int k=5;
        do
        {
            Random random=new Random();
            int com=random.nextInt(3)+1;//电脑所给的随机数 1 剪刀 2 石头 3 布
            int n=in.nextInt();//用户输入
            if(n==1)//用户输入剪刀
            {
                if(com==1)
                {
                    System.out.println("平局");
                    b++;
                }
                if(com==2)
                {
                    System.out.println("你输了");
                    c++;
                }
                if(com==3)
                {
                    System.out.println("你赢了");
                    a++;
                }
            }
            else if(n==2)//用户输入石头
            {
                if(com==1)
                {
                    System.out.println("你赢了");
                    a++;
                }
                if(com==2)
                {
                    System.out.println("平局");
                    b++;
                }
                if(com==3)
                {
                    System.out.println("你输了");
                    c++;
                }
            }
            else if(n==3)//用户输入布
            {
                if(com==1)
                {
                    System.out.println("你输了");
                    c++;
                }
                if(com==2)
                {
                    System.out.println("你赢了");
                    a++;
                }
                if(com==3)
                {
                    System.out.println("平局");
                    b++;
                }
            }
            k--;
        }while(k>0);
        if(a>c)
            System.out.println("恭喜你，获得最终胜利");
        if(a<c)
            System.out.println("很遗憾，你输了");
        if(b==5)
            System.out.println("最终平局");
    }
}
