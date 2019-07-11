package three;

import tools.TreeNode;

import java.util.ArrayList;

public class PrintFromTopToBottom_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root==null) return ans;

        ArrayList<TreeNode> nodeQ = new ArrayList<>();
        nodeQ.add(root);
        while (nodeQ.size()>0){
            TreeNode node = nodeQ.get(0);
            ans.add(node.val);
            nodeQ.remove(0);
            if (node.left!=null){
                nodeQ.add(node.left);
            }
            if (node.right!=null) {
                nodeQ.add(node.right);
            }
        }
        return ans;
    }
}
