package six;

import tools.TreeNode;

import java.util.ArrayList;

public class PrintTreeNode_59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
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
            if (i % 2 == 0) {
                for (int j = 0; j < treeTmp.size(); j++) {
                    addTmp.add(treeTmp.get(j).val);
                }
            } else {
                for (int j = treeTmp.size() - 1; j >= 0; j--) {
                    addTmp.add(treeTmp.get(j).val);
                }
            }
            ans.add(addTmp);
            for (int j = 0; j < treeTmp.size(); j++) {
                TreeNode node = treeTmp.get(j);
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
