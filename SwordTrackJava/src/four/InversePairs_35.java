package four;

import java.util.ArrayList;

public class InversePairs_35 {
    //    P%1000000007
    /*
    [364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575]
     */
    private int count = 0;

    public int InversePairs(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int[] copy = array;
        InversePairs(copy, 0, array.length - 1);
        return count;

    }

    public void InversePairs(int[] copy, int left, int right) {
        if (left >= right) return;
        int mid = (right + left) / 2;
        InversePairs(copy, left, mid);
        InversePairs(copy, mid + 1, right);
        int index1 = left;
        int index2 = mid + 1;
        ArrayList<Integer> list = new ArrayList();
        while (index1 <= mid && index2 <= right) {
            while (index1 <= mid && copy[index1] <= copy[index2]) {
                list.add(copy[index1]);
                index1++;
            }
            if (index1 <= mid + 1 && copy[index1] > copy[index2]) {
                list.add(copy[index2]);
                count = count + mid + 1 - index1;
                count = count % 1000000007;
                index2++;
            }
        }
        while (index1 <= mid) {
            list.add(copy[index1]);
            index1++;
        }
        while (index2 <= right) {
            list.add(copy[index2]);
            index2++;
        }

        for (int i = left, j = 0; i <= right; i++, j++) {
            copy[i] = list.get(j);
        }
    }

    public static void main(String[] args) {

        int[] t = {5, 4, 3, 2, 1};
        System.out.println(new InversePairs_35().InversePairs(t));
    }
}
