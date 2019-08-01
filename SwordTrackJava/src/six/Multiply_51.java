package six;

public class Multiply_51 {
    public int[] multiply(int[] A) {
        if (A == null || A.length < 1) {
            return new int[]{};
        }

        int[] S = new int[A.length];
        int[] E = new int[A.length];
        S[0] = 1;
        E[A.length - 1] = 1;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            count = count * A[i - 1];
            S[i] = count;
        }
        count = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            count = count * A[i + 1];
            E[i] = count;
        }
        int[] ans = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            ans[i] = S[i] * E[i];
        }
        return ans;
    }
}
