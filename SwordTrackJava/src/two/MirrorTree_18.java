package two;

import tools.TreeNode;

public class MirrorTree_18 {
    public void Mirror(TreeNode root) {
        if (root==null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
