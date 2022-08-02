package DataStructure;

/**
 * @author yangqee
 * @date 2022/7/30 11:06 下午
 */
public class DFS
{
/**
 * 以二叉树为例使用栈实现DFS算法
 *
 * @author Forest
 * @date 2021年03月07日 14:50
 */
//
//    private List<Integer> list = new ArrayList<>();
//    public void dfs(BinaryTreeNode node) {
//        if (null == node) {
//            return;
//        }
//        Stack<BinaryTreeNode> stack = new Stack<>();
//        // 根节点压栈
//        stack.push(node);
//        while (!stack.isEmpty()) {
//            BinaryTreeNode pop = stack.pop();
//            // 逻辑处理
//            process(pop);
//
//
//            if (null != pop.getRight()) {
//                stack.push(pop.getRight());
//            }
//            if (null != pop.getLeft()) {
//                stack.push(pop.getLeft());
//            }
//        }
//    }
//
//    /**
//     * 逻辑处理
//     * 这里将节点值添加进List中，用来展示搜索顺序，在实际应用中可修改为相应的业务处理逻辑
//     *
//     * @param currentNode
//     * @return
//     * @author Forest
//     * @date 2021/3/7 下午3:23
//     */
//    private void process(BinaryTreeNode currentNode) {
//        // 这里将节点值添加进List中，用来展示搜索顺序，在实际应用中可修改为相应的业务处理逻辑
//        list.add(currentNode.getValue());
//    }
//
//    public static void main(String[] args) {
//        BinaryTreeNode node5 = new BinaryTreeNode();
//        node5.setValue(5);
//        BinaryTreeNode node6 = new BinaryTreeNode();
//        node6.setValue(6);
//        BinaryTreeNode node3 = new BinaryTreeNode(3, node5, node6);
//        BinaryTreeNode node2 = new BinaryTreeNode();
//        node2.setValue(2);
//        BinaryTreeNode node1= new BinaryTreeNode(1, node3, node2);
//        StackDFS dfs = new StackDFS();
//        dfs.dfs(node1);
//        System.out.println(dfs.list);
//    }


}
