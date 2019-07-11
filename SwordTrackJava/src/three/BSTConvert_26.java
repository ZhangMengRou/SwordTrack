package three;

import tools.TreeNode;

public class BSTConvert_26 {
    private TreeNode tmp = null;

    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) return null;
        ConvertHelper(pRootOfTree);
        TreeNode ansNode = pRootOfTree;
        while (ansNode.left != null) {
            ansNode = ansNode.left;
        }
        return ansNode;
    }

    public void ConvertHelper(TreeNode pRootOfTree) {

        if (pRootOfTree == null) return;
        if (pRootOfTree.left != null) {
            Convert(pRootOfTree.left);
        }
        pRootOfTree.left = tmp;
        if (tmp != null) {
            tmp.right = pRootOfTree;
        }
        tmp = pRootOfTree;
        if (pRootOfTree.right != null) {
            Convert(pRootOfTree.right);
        }

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node2.left = node1;
        node2.right = node3;
        TreeNode ans = new BSTConvert_26().Convert(node2);

    }

}
