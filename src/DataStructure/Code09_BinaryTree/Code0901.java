package DataStructure.Code09_BinaryTree;

/**
 * @author yangqee
 * @date 2022/8/3 3:43 下午
 */
//树型DP解决二叉树问题-长期经验总结-讲清楚为主
public class Code0901 {
    //pre-in-last Order
    public static void pre(Node head){
        if (head == null)
            return;
        System.out.println(head.val);
        pre(head.left);
        pre(head.right);
    }
    //更重要的是递归序-其实每个节点都会走三次，只是打印它们每个节点第一次到达的情况
    //本质上是递归很强，递归可以让每个节点走经过三次，只是打印情况不同

    /*
    怎么用"非递归"方式实现先中后序遍历
    （1）任何递归函数都可以改成非递归
    （2）自己设计压栈来实现
     */
    public static void preNoRecursion(Node head){

    }


}
