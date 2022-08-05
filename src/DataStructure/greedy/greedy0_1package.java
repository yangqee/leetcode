package DataStructure.greedy;
import java.util.Scanner;

/**
 * @author yangqee
 * @date 2022/8/3 10:16 下午
 */
public class greedy0_1package {
    public static void main(String args[]){
        int n,i,j;
        double C;
        System.out.println("请输入待选择的物品的个数：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("请输入背包容量：");
        C = scanner.nextDouble();
        double[] a = new double[n];    //物品重量数组
        double[] b = new double[n];    //物品价值数组
        double[] x = new double[n];
        for(i = 0; i < n; i++){
            a[i] = Math.floor(Math.random()*20);
        }
        for(i = 0; i < n; i++){
            b[i] = Math.floor(Math.random()*20);
        }
        System.out.println("随机产生的物品重量为：");
        for(i = 0; i < n; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        System.out.println("随机产生的物品价值为：");
        for(i = 0; i < n; i++){
            System.out.print(b[i]+"  ");
        }
        System.out.println();
        double value = Knapsack(a,b,x,C,n);
        System.out.println("最大价值为："+value);
    }
    static void sort(double[] a, double[] b, int n){
        double[] c = new double[n];
        for(int i = 1; i < n; i++){
            c[i] = b[i]/a[i];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(c[j] < c[j+1]){

                    double temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;

                    double temp2=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;

                    double temp3=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp3;
                }
            }
        }
    }
    static double Knapsack(double[] a, double[] b, double[] x, double C, int n){
        sort(a,b,n);
        int i;
        double total = 0;
        for (i = 0; i < n; i++) {
            if (a[i] <= C){//如果背包剩余的容量大于等于第i个物体的重量
                x[i] = 1;   //把第i个物体整个装进背包
                C = C - a[i];  //背包的剩余容量减少了第i个物体的重量
            }else {
                break;  //退出循环
            }
        }
        if (i < n){//判断是否第n个物体整个装进去背包里了,如果i<=n表示否定
            x[i] = C/a[i];
        }
        for(i = 0; i < n; i++){
            total = total+x[i]*b[i];
        }
        return total;
    }


}
