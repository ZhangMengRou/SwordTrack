package six;

import tools.TreeNode;

public class IsSymmetrical_58 {
    boolean isSymmetrical(TreeNode pRoot) {

        if (pRoot == null) return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return isSymmetrical(a.left, b.right) && isSymmetrical(a.right, b.left);


    }
}
