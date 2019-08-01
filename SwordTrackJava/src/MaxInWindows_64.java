import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

/*
[10,14,12,11],1

对应输出应该为:

[10,14,12,11]

你的输出为:

[14,14,12]
 */
public class MaxInWindows_64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {

        if (size <= 0) {
        return new ArrayList<>();
        }
        if (size == 1) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int k : num) {
                arrayList.add(k);
            }
            return arrayList;
        }
        int left1 = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> maxIndex = new ArrayList<>();
        int i = 1;
        max.add(num[0]);
        maxIndex.add(0);
//        int leftIndex = 0;
//        int leftNext = 0;
        for (; i < num.length; i++) {
            if (maxIndex.get(0) < left1) {
                max.remove(0);
                maxIndex.remove(0);
            }
            if (max.size() == 0 || num[i] > max.get(0)) {
                maxIndex = new ArrayList<>();
                maxIndex.add(i);
                max = new ArrayList<>();
                max.add(num[i]);
            } else {
                for (int x = max.size() - 1; x >= 0; x--) {
                    if (max.get(x) <= num[i]) {
                        max.remove(x);
                        maxIndex.remove(x);
                    }
                }
                max.add(num[i]);
                maxIndex.add(i);
            }
            if (i >= size - 1) {
                left1++;
                ans.add(max.get(0));
            }
        }

        return ans;
    }
}
