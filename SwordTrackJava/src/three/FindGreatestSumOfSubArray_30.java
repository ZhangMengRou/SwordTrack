package three;

public class FindGreatestSumOfSubArray_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int ans = array[0];
        int c = array[0];
        for (int i = 1; i < array.length; i++) {
            c += array[i];
            ans = Math.max(c, ans);
            if (c < 0) {
                c = 0;
            }
        }
        return ans;
    }


}
