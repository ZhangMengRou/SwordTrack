package two;

import java.util.Arrays;

/*
https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class ReOrderArray_13 {
    public void reOrderArray(int[] array) {

        if (array == null || array.length < 2) return;
        reOrderArray(array, 0, array.length - 1);

    }

    public void reOrderArray(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        if (count == 0||count==right-left+1) {
            return;
        }
        reOrderArray(array, left, left + count - 1);
        reOrderArray(array, left + count, right);

        for (int i = left, j = left + count; i < left + count && j <= right; i++) {
            if (array[i] % 2 == 0) {
                if (array[j] % 2 != 1) {
                    j++;
                }
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

            }
        }

    }

    public static void main(String[] args) {
        int[] a = {11,11,11};
        new ReOrderArray_13().reOrderArray(a);
        System.out.println(Arrays.toString(a));
    }
}
