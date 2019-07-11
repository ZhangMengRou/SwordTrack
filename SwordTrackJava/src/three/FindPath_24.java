package three;

import tools.TreeNode;

import java.util.ArrayList;

public class FindPath_24 {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        FindPath(root,target,list);
        return ans;
    }
    public void FindPath(TreeNode root, int target,ArrayList<Integer> list) {
        if (root==null) return;
        list.add(root.val);
        if (root.val==target&&root.left==null&&
                root.right==null){
            ans.add(new ArrayList<>(list));
        }else {
            target = target-root.val;
            FindPath(root.left,target,new ArrayList<>(list));
            FindPath(root.right,target,new ArrayList<>(list));
        }
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t4.left = t5;
        System.out.println(new FindPath_24().FindPath(t1,3));
    }
}
