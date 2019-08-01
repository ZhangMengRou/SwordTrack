package five;

import java.util.HashSet;

public class IsContinuous_45 {
    public boolean isContinuous(int[] numbers) {

        if (numbers == null || numbers.length < 1) return false;
        if (numbers.length == 1) return true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
                continue;
            }
            if (set.contains(numbers[i]))
                return false;
            set.add(numbers[i]);
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        if (count == numbers.length) return true;

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] t = {0, 3, 2, 6, 4};
        System.out.println(new IsContinuous_45().isContinuous(t));
    }
}


