package com.yangqee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangqee
 * @date 2022/7/3 9:35 下午
 */
//leetcode54:Spiral Matrix
public class Array54 {
    public static List<Integer> spirayOrderPrint(int[][] matrix){
        int tx = 0;
        int ty = 0;
        int dx = matrix.length - 1;
        int dy = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();
        while (tx <= dx && ty <= dy){
            printEdge(matrix, tx++, ty++, dx--, dy--, res);
        }
        return res;
    }
    public static List<Integer> printEdge(int[][] m, int tx, int ty, int dx, int dy, List<Integer> res) {
//        1  2  3  4
//        5  6  7  8
//        9  10 11 12
//        //13 14 15 16
        if (tx == dx) {//if only 1 line
            for (int i = ty; i <= dy; i++) {
//                System.out.print(m[tx][i] + " ");
                res.add(m[tx][i]);
            }
        } else if (ty == dy) {
            for (int i = tx; i <= dx; i++) {
//                System.out.print(m[i][ty] + " ");
                res.add(m[i][ty]);
            }
        }else{
            int curx = tx;
            int cury = ty;
            while (cury != dy){
//                System.out.print(m[tx][cury] + " ");
                res.add(m[tx][cury]);
                cury++;
            }
            while (curx != dx){
//                System.out.print(m[curx][dy] + " ");
                res.add(m[curx][dy]);
                curx++;
            }
            while (cury != ty){
//                System.out.print(m[dx][cury] + " ");
                res.add(m[dx][cury]);
                cury--;
            }
            while (curx != tx){
//                System.out.print(m[curx][ty] + " ");
                res.add(m[curx][ty]);
                curx--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spirayOrderPrint(matrix));
    }
}
