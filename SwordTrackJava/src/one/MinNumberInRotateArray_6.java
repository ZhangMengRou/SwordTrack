package one;

public class MinNumberInRotateArray_6 {
    public static void main(String[] args) {
        System.out.println(new MinNumberInRotateArray_6(

        ).minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
    public int minNumberInRotateArray(int [] array) {
        if (array==null||array.length<1){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while (left<right-1){
            mid = (left+right)/2;
            if (array[left]>array[mid]){
                right=mid;
            }else if(array[mid]>array[right]){
                left=mid;
            }
            if (array[mid]==array[left]&&array[mid]==array[right]){
                for (int i = left;i<right;i++){
                    if (array[i]>array[i+1]){
                        return array[i+1];
                    }
                }
                return array[mid];
            }

        }
        return Math.min(array[left],array[right]);
    }
}
