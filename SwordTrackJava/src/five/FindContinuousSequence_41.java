package five;

import java.util.ArrayList;

public class FindContinuousSequence_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= sum; i++) {
            for (int j = i + 1; j <= sum; j++) {
                int a = (i + j) * (j - i + 1);
                if (a == 2 * sum) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    for (int tmp = i; tmp <= j; tmp++) {
                        arrayList.add(tmp);
                    }
                    ans.add(arrayList);
                }
                if (a > 2 * sum) {
                    break;
                }
            }
        }
        return ans;

    }
}
