package two;

/*
https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
/*
运算符“>>”执行算术右移，它使用最高位填充移位后左侧的空位。右移的结果为：每移一位，第一个操作数被2除一次，移动的次数由第二个操作数确定。

逻辑右移或叫无符号右移运算符“>>>“只对位进行操作，没有算术含义，它用0填充左侧的空位。
 */
public class NumberOf1_11 {
    public int NumberOf1(int n) {
        int ans = 0;
        for (int i =0;i<32;i++){
            int x = n&1;
            if (x==1){
                ans++;
            }
            n = n>>>1;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new NumberOf1_11().NumberOf1(0));
    }
}
