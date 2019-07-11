package three;

import java.util.Arrays;

public class VerifySquenceOfBST_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence==null||sequence.length<1) return false;
        if (sequence.length==1) return true;
        int len = sequence.length;
        int k = sequence[len-1];
        int i = 0;
        while (i<len-1&&sequence[i]<k) i++;
        int e = i;
        while (i<len-1&&sequence[i]>k) i++;
        return i==len-1&&
                (e <= 0 || VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, e)))
                &&
                (len - 1 <= e || VerifySquenceOfBST(Arrays.copyOfRange(sequence, e, len - 1)));

    }

    public static void main(String[] args) {
        System.out.println(new VerifySquenceOfBST_23().VerifySquenceOfBST(new int[]
                {2,1,7,11,9,6}));
    }
}
