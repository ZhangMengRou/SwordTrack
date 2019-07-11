package four;

public class PrintMinNumber_32 {
    public String PrintMinNumber(int[] numbers) {


        sQSort(numbers, 0, numbers.length - 1);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            ans.append(numbers[i]);
        }
        return ans.toString();
    }

    public void sQSort(int[] numbers, int left, int right) {
        if (left >= right) return;
        int nleft = left;
        int nright = right;
        int i = left;
        while (left < right) {
            while (compare(numbers[left], numbers[i]) < 0 && left < right) left++;
            while (compare(numbers[right], numbers[i]) >= 0 && left < right) right--;
            int tmp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = tmp;
        }
        int tmp = numbers[left];
        numbers[left] = numbers[i];
        numbers[i] = tmp;
        sQSort(numbers, nleft, left - 1);
        sQSort(numbers, left + 1, nright);
    }

    public int compare(int a, int b) {
        String ab = a + "" + b;
        String ba = b + "" + a;
        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) - ba.charAt(i) > 0) {
                return 1;
            }
            if (ab.charAt(i) - ba.charAt(i) < 0) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] t = {3, 1, 2, 3, 4, 11};
        System.out.println(new PrintMinNumber_32().PrintMinNumber(t));
    }
}
