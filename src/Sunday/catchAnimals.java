package Sunday;

/**
 * @author yangqee
 * @date 2022/7/3 8:06 下午
 */
public class catchAnimals {
    public static void main(String []args){
        //小游戏：抓小动物，如果碰到老虎，游戏结束；如果碰到老鹰，则躲起来抓下一个小动物，如果碰到其他的，抓起来。
        //1：老虎，2：老鹰，3兔子，4小猫，5小狗，6小鸟
        int count=0;
        while(true){
            int a=(int)(Math.random()*6);//随机返回一个1~6的整数。
            String animal ="";//对字符串animal先进行初始化。
            switch(a) {
                case 1:
                    animal="老虎";
                    break;
                case 2:
                    animal="老鹰";
                    break;
                case 3:
                    animal="小狗";
                    break;
                case 4:
                    animal="小猫";
                    break;
                case 5:
                    animal="小鸟";
                    break;
                case 6:
                    animal="小兔子";
                    break;
                default:
                    animal ="未知";
            }
            if(animal=="老虎"){
                System.out.println("老虎来啦，不玩了快跑！");
                break;
            }
            if(animal=="老鹰"){
                System.out.println("老鹰来了！躲起来等下一个动物出现");
                continue;
            }
            count++;//对循环的次数进行统计，注意这里统计的是完整循环的次数。
            System.out.println("抓到一只可爱的小动物："+animal);
        }
        System.out.println("一共抓了"+count+"只小动物！");
    }
}
