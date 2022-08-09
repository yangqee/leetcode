package DataStructure.Code10_greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangqee
 * @date 2022/8/3 10:46 下午
 */
public class testList {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(50);
        list1.add(150);
        list1.add(250);
        list.add(list1);

        List<Integer> list2=new ArrayList<Integer>();
        list2.add(30);
        list2.add(190);
        list2.add(210);
        list.add(list2);

        List<Integer> list3=new ArrayList<Integer>();
        list3.add(80);
        list3.add(950);
        list3.add(150);
        list.add(list3);

        System.out.println();
    }
}
