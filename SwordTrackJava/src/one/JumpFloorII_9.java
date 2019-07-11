package one;

/*
https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class JumpFloorII_9 {
    public int JumpFloorII(int target) {
        if (target<=0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        int[] tmp = new int[target+1];
        tmp[1] = 1;
        tmp[2] = 2;
        int count = 3;
        for (int i = 3;i<=target;i++){
            tmp[i] = count+1;
            count = count+tmp[i];
        }
        return tmp[target];
    }
}
