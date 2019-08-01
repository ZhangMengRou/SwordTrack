package five;

public class Sum_47 {
    /*
     */
    public int Sum_Solution(int n) {
        int sum = 0;
        boolean t = n > 0 && (sum += n + Sum_Solution(n - 1)) > 0;
        return sum;
    }
}
