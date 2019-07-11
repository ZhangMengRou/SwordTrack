package one;

/*
https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class RectCover_10 {
    public int RectCover(int target) {
        if (target<=0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        int[] tmp = new int[target+1];
        tmp[1] = 1;
        tmp[2] = 2;
        for (int i = 3;i<=target;i++){
            tmp[i] = tmp[i-1]+tmp[i-2];
        }
        return tmp[target];
    }
}
