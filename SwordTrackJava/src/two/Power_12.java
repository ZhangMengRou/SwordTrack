package two;

public class Power_12 {
    public double Power(double base, int exponent) {

        if (exponent==0){
            return 1;
        }
        int mark = 0;
        int k = 0;
        int[] remainder = new int[33];
        if (exponent<0){
            mark = 1;
            exponent = -exponent;
        }
        while (exponent>0){
            remainder[k] = exponent%2;
            exponent = exponent>>1;
            k++;
        }
        double ans = 1;
        while (k>=0){
            ans = ans*ans;
            if (remainder[k]!=0){
                ans=ans*base;
            }
            k--;
        }
        if(mark==1){
            ans = 1/ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Power_12().Power(2,-3));
    }
}
