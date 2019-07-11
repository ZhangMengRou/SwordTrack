package three;

import java.util.ArrayList;

public class IsPopOrder_21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null
                || pushA.length != popA.length) {
            return false;
        }
        int len = pushA.length;
        int k = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < len; i++) {
            while (j < len && popA[i] != pushA[j]) {
                list.add(pushA[j]);
                j++;
                k++;
            }
            if (j < len && popA[i] == pushA[j]) {
                j++;
                continue;
            }
            if (k > 0 && popA[i] == list.get(k - 1)) {
                k--;
                list.remove(k);
            }
        }
        return list.size() == 0;
    }

    public static void main(String[] args) {
        boolean a = new IsPopOrder_21().IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
        System.out.println(a);
    }
}
