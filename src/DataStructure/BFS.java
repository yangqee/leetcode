package DataStructure;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yangqee
 * @date 2022/7/30 10:12 下午
 */
//Definition for a binary tree node.
public class BFS {
    public void BFSWithQueue(TreeNode root) {
        Queue queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = (TreeNode) queue.poll();

            //在这里处理遍历到的TreeNode节点

            if (treeNode.left != null)
                queue.add(treeNode.left);
            if (treeNode.right != null)
                queue.add(treeNode.right);
        }
    }
}
