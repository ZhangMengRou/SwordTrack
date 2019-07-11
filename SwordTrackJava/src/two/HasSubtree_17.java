package two;

import tools.TreeNode;

public class HasSubtree_17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val == root2.val && check(root1, root2)) {
            return true;
        } else {
            return HasSubtree(root1.left, root2)
                    || HasSubtree(root1.right, root2);
        }
    }

    public boolean check(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            return check(root1.left, root2.left) &&
                    check(root1.right, root2.right);
        } else {
            return false;
        }
    }
}
