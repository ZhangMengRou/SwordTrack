package one;

import tools.TreeNode;

import java.util.Arrays;

public class ReConstructBinaryTree_4 {
    //前{1,2,4,7,3,5,6,8}和中{4,7,2,1,5,3,8,6}，
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length || pre.length < 1) {
            return null;
        }

        int top = pre[0];
        int j = 0;
        while (in[j] != top) j++;
        TreeNode ans = new TreeNode(pre[0]);
        if (pre.length == 1) {
            return ans;
        }
        ans.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,j+1),
                Arrays.copyOfRange(in,0,j));
        ans.right = reConstructBinaryTree(Arrays.copyOfRange(pre,j+1,pre.length),
                Arrays.copyOfRange(in,j+1,in.length));
        return ans;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode node = new ReConstructBinaryTree_4().reConstructBinaryTree(pre,in);

    }
}
