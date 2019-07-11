package four;

import tools.TreeNode;

public class TreeDepth_38 {
    private int count = 0;
    private int max = 0;

    public int TreeDepth(TreeNode root) {

        if (root == null) return 0;
        count++;
        max = Math.max(count, max);
        TreeDepth(root.left);
        TreeDepth(root.right);
        count--;
        return max;
    }
}
