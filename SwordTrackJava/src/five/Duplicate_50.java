package five;

public class Duplicate_50 {

    public boolean duplicate(int numbers[], int length, int[] duplication) {

        if (numbers == null || length < 2 || numbers.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int k = numbers[i];
            if (k == i) {
                continue;
            }
            if (k >= length) {
                return false;
            }

            if (numbers[k] != k) {
                numbers[i] = numbers[k];
                numbers[k] = k;
            } else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] t = {2, 1, 3, 1, 4};
        System.out.println(new Duplicate_50().duplicate(t, 5, new int[]{0}));
    }
}
