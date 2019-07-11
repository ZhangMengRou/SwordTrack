package three;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        if (input==null||input.length<k||k==0) return ans;
        int[] min = new int[k];
        for (int i =0;i<k;i++){
            min[i] = Integer.MAX_VALUE;
        }
        for (int i = 0;i<input.length;i++){
            addToMin(input[i],min);
        }
        for (int i = 0;i<min.length;i++){
            ans.add(min[i]);
        }
        return ans;
    }
    public void addToMin(int a,int[] min){

        System.out.println(Arrays.toString(min));
        if (a>min[0]){
            return;
        }
        min[0]=a;
        for (int i = 0;i<min.length;){
            int left = 2*i+1;
            int right = 2*i+2;
            if (right<min.length){

                if (min[left]<=min[i]&&min[right]<=min[i]){
                    return;
                }
                if (min[left]>min[right]){
                    int tmp = min[i];
                    min[i] = min[left];
                    min[left] =tmp;
                    i = left;
                    continue;
                }else {
                    int tmp = min[i];
                    min[i] = min[right];
                    min[right] =tmp;
                    i = right;

                    continue;
                }
            }
            if (left==min.length-1&&min[left]>min[i]){
                int tmp = min[i];
                min[i] = min[left];
                min[left] =tmp;
                break;
            }else {
                return;
            }

        }
    }

    public static void main(String[] args) {
        int[] t = {4,5,1,6,2,7,3,8};
        System.out.println(new GetLeastNumbers_29().GetLeastNumbers_Solution(t,4));
    }

}
