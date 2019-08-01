import six.DeleteDuplication_56;
import tools.ListNode;
import tools.TreeNode;

import java.util.ArrayList;

public class SerializedBT_61 {
    String Serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder ans = new StringBuilder();
        ArrayList<ArrayList<TreeNode>> tmp = new ArrayList<>();
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        tmp.add(treeNodes);
        for (int i = 0; i < tmp.size(); i++) {
            ArrayList<TreeNode> treeTmp = tmp.get(i);
            StringBuilder addTmp = new StringBuilder();
            treeNodes = new ArrayList<>();
            for (TreeNode aTreeTmp : treeTmp) {
                if (aTreeTmp == null) {
                    ans.append("#,");

                } else {
                    ans.append(aTreeTmp.val + ",");

                }
            }

            for (TreeNode node : treeTmp) {
                if (node != null) {
                    treeNodes.add(node.left);
                    treeNodes.add(node.right);

                }

            }
            if (treeNodes.size() >= 1) {
                tmp.add(treeNodes);
            }
        }
        return ans.deleteCharAt(ans.length() - 1).toString();
    }

    static TreeNode Deserialize(String str) {

        if (str.equals("#")) return null;
        if (str.equals("")) return null;
        String[] nums = str.split(",");
        if (nums.length < 1) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(Integer.valueOf(nums[0]));
        }
        ArrayList<ArrayList<TreeNode>> tmp = new ArrayList<>();
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(new TreeNode(Integer.valueOf(nums[0])));
        tmp.add(treeNodes);
        int count = 1;
        int i = count * 2;
        for (int j = 1; j < nums.length; j++) {
            ArrayList<TreeNode> treeNodes1 = new ArrayList<>();
            i = count * 2;
            count = 0;
            for (; i > 0 && j < nums.length; i--) {
                treeNodes1.add(Deserialize(nums[j]));
                if (Deserialize(nums[j]) != null) count++;
                j++;
            }

            if (treeNodes1.size() > 0)
                tmp.add(treeNodes1);
            j--;


        }
        for (int k = 0; k < tmp.size() - 1; k++) {
            ArrayList<TreeNode> arrayList = tmp.get(k);
//            System.out.println(arrayList.size()+"arrayList");
            ArrayList<TreeNode> arrayListNext = tmp.get(k + 1);
//            System.out.println(arrayListNext.size()+"arrayListNext");
            int y = 0;
            for (int x = 0; x < arrayList.size(); x++) {
                if (arrayList.get(x) == null) {
                    y++;
                    continue;
                }
                if (arrayListNext.size() > 2 * (x - y) && arrayList.get(x) != null)
                    arrayList.get(x).left = arrayListNext.get(2 * (x - y));
                if (arrayListNext.size() > 2 * (x - y) + 1 && arrayList.get(x) != null)
                    arrayList.get(x).right = arrayListNext.get(2 * (x - y) + 1);

            }
        }
        return tmp.get(0).get(0);
    }

    public static void main(String[] args) {
        System.out.println(Deserialize("5,#,4,#,3,#,2"));
    }
}
