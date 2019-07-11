package four;

import java.util.ArrayList;

public class FindNumsAppearOnce_40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2) return;
        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            k = k ^ array[i];

        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int count = 0;
        while (k != 0) {
            if (k % 2 == 1) {
                break;
            }
            k = k / 2;
            count++;
        }
        int base = 1;
        while (count > 0) {
            base = base * 2;
            count--;
        }
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i] / base;
            tmp = tmp % 2;
            if (tmp == 0) {
                list1.add(array[i]);
            } else {
                list2.add(array[i]);
            }
        }
        k = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            k = k ^ list1.get(i);
        }
        num1[0] = k;
        k = list2.get(0);
        for (int i = 1; i < list2.size(); i++) {
            k = k ^ list2.get(i);
        }
        num2[0] = k;
        return;

    }

    public static void main(String[] args) {
        int[] t = {2,4,3,6,3,2,5,5};
        int[] n1 = new int[1];
        int[] n2 = new int[1];
        new FindNumsAppearOnce_40().FindNumsAppearOnce(t,n1,n2);
        System.out.println(n1[0]);
        System.out.println(n2[0]);
    }

}
