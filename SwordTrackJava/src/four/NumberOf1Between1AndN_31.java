package four;

public class NumberOf1Between1AndN_31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 1) return 0;
        if (n < 10) return 1;
        return NumberOf1(n + "");

    }

    public int NumberOf1(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int len = s.length();
        int first = s.charAt(0) - '0';
        if (len == 1) {
            if (first == 0) return 0;
            return 1;
        }
        int firstOneNum = 0;
        if (first == 1) {
            firstOneNum = Integer.valueOf(s.substring(1, len)) + 1;
        } else {
            firstOneNum = Power10(len - 1);
        }
        int otherOneNum = first * (len - 1) * Power10(len - 2);

        int b = Integer.valueOf(s) % (first * Power10(len - 1));
        int leftNum = NumberOf1(b + "");
        return firstOneNum + otherOneNum + leftNum;

    }

    public int Power10(int n) {

        int k = 1;
        while (n > 0) {
            n--;
            k = k * 10;
        }
        return k;

    }


    public static void main(String[] args) {
        int k = new NumberOf1Between1AndN_31().NumberOf1Between1AndN_Solution(10000);
        System.out.println(k);
    }
}
