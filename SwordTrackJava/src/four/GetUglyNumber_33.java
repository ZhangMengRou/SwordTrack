package four;

public class GetUglyNumber_33 {
    // 2 3 5
    public int GetUglyNumber_Solution(int index) {
        if (index < 1) return 0;
        if (index == 1) return 1;

        int[] list = new int[index];
        list[0] = 1;
        int i = 1;
        int k2 = 0;
        int k3 = 0;
        int k5 = 0;
        while (i < index) {

            int nextMin = Math.min(list[k2] * 2, list[k3] * 3);

            nextMin = Math.min(nextMin, list[k5] * 5);
            list[i] = nextMin;

            if (list[k2] * 2 <= nextMin) {
                k2++;
                System.out.println(k2);
            }
            if (list[k3] * 3 <= nextMin) {
                k3++;
            }
            if (list[k5] * 5 <= nextMin) {
                k5++;
            }
            i++;

        }
        return list[index - 1];

    }

    public static void main(String[] args) {
        System.out.println(new GetUglyNumber_33().GetUglyNumber_Solution(6));
    }
}
