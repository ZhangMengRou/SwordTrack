package five;

import java.util.ArrayList;

public class FindNumbersWithSum_42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {

        for (int i = 0; i < array.length && array[i] / 2 <= sum; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[i] + array[mid] == sum) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(array[i]);
                    arrayList.add(array[mid]);
                    return arrayList;
                }
                if (array[i] + array[mid] > sum) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6};
        System.out.println(new FindNumbersWithSum_42().FindNumbersWithSum(t, 7));
    }
}
