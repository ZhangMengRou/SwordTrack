import tools.TreeNode;

public class KthNode_62 {
    /*
    {8,6,10,5,7,9,11},8
"null"
11
     */
    private static int k1;
    private static TreeNode ans = null;

    TreeNode KthNode(TreeNode pRoot, int k) {

        k1 = k;

        KthNode(pRoot);
        return ans;
    }

    void KthNode(TreeNode pRoot) {
        if (k1 == 0) return;
        if (pRoot == null) return;
        KthNode(pRoot.left);
        k1--;
        System.out.println(pRoot.val);
        if (k1 == 0) {
            ans = pRoot;
        }
        KthNode(pRoot.right);

    }

    public static void main(String[] args) {
        TreeNode t8 = new TreeNode(8);
        TreeNode t6 = new TreeNode(6);
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t11 = new TreeNode(11);

        t8.left = t6;
        t8.right = t10;
        t6.left = t5;
        t6.right = t7;
        t10.left = t9;
        t10.right = t11;
        System.out.println(new KthNode_62().KthNode(t8, 8));
    }
}
