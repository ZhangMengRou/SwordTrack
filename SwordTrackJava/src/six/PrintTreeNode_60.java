package six;

import tools.TreeNode;

import java.util.ArrayList;

public class PrintTreeNode_60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<TreeNode>> tmp = new ArrayList<>();
        if (pRoot == null) return ans;
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(pRoot);
        tmp.add(treeNodes);
        for (int i = 0; i < tmp.size(); i++) {
            ArrayList<TreeNode> treeTmp = tmp.get(i);
            ArrayList<Integer> addTmp = new ArrayList<>();
            treeNodes = new ArrayList<>();
            for (TreeNode aTreeTmp : treeTmp) {
                addTmp.add(aTreeTmp.val);
            }
            ans.add(addTmp);
            for (TreeNode node : treeTmp) {
                if (node.left != null)
                    treeNodes.add(node.left);
                if (node.right != null)
                    treeNodes.add(node.right);
            }
            if (treeNodes.size() >= 1) {
                tmp.add(treeNodes);
            }
        }
        return ans;
    }
}
