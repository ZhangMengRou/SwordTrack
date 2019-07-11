package three;

public class MoreThanHalfNum_28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array==null||array.length<1) return 0;
        if (array.length==1) return array[0];
        int len =array.length;
        return MoreThanHalfNum_Solution(array,0,len-1);

    }
    public int MoreThanHalfNum_Solution(int [] array,int left,int right) {

        if (left>right) return 0;
        int k =(right-left)/2;
        int mid = array.length/2;
        int count =0;
        while (left<right){
            while (left<right&&array[right]>=array[k]){
                if (array[right]==array[k]) count++;
                right--;
            }
            while (left<right&&array[left]<=array[k]){
                if (array[left]==array[k]) count++;
                left++;
            }
            if (left<right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
            left++;
            right--;
        }
        if (count>array.length/2){
            return array[k];
        }
        if (left>k){
            int tmp = array[k];
            array[k] = array[right];
            array[right] = tmp;
            return MoreThanHalfNum_Solution(array,left,right-1);
        }else {
            int tmp = array[k];
            array[k] = array[left];
            array[left] = tmp;
            return MoreThanHalfNum_Solution(array,0,left-1);
        }

    }

    public static void main(String[] args) {
        int[] t = {1,2,3,2,3};
        System.out.println(new MoreThanHalfNum_28().MoreThanHalfNum_Solution(t));
    }
}
