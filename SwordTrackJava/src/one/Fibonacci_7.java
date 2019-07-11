package one;

/*
https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Fibonacci_7 {
    public int Fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int[] tmp = new int[n + 1];
        tmp[0] = 0;
        tmp[1] = 1;
        for (int i = 2; i <= n; i++) {
            tmp[i] = tmp[i - 1] + tmp[i - 2];
        }
        return tmp[n];

    }

    public static void main(String[] args) {

    }
}
