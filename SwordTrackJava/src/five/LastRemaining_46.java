package five;

public class LastRemaining_46 {
    public int LastRemaining_Solution(int n, int m) {

        if (n == 0 || m == 0) return -1;
        return LastRemainingIndex(n, m);

    }

    public int LastRemainingIndex(int n, int m) {
        if (n == 1) return 0;
        return (LastRemainingIndex(n - 1, m) + m) % n;
    }
    /*
     */
}
