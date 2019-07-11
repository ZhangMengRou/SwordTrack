package four;

import tools.TreeNode;

public class IsBalanced_39 {
    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null) return true;
        TreeDepth(root);
        return flag == 0;
    }

    private int flag = 0;

    public int TreeDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        if (Math.abs(left - right) > 1) {
            flag = 1;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node5.left = node7;
        System.out.println(new IsBalanced_39().IsBalanced_Solution(node1));
    }
}
