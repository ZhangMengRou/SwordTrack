package two;

import java.util.ArrayList;

public class PrintMatrix_19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix==null||matrix.length<1||matrix[0].length<1)
            return null;
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int up = 0;
        int down = matrix.length-1;
        int i=0,j=0;
        while (left<=right&&up<=down){


            while (j<right&&i>=up&&i<=down){
                ans.add(matrix[i][j]);
                j++;
            }
            up++;
            //down
            while (i<down&&j>=left&&j<=right){
                ans.add(matrix[i][j]);
                i++;
            }
            right--;
            //left
            while (j>left&&i>=up&&i<=down){
                ans.add(matrix[i][j]);
                j--;
            }
            down--;
            //up
            while (i>up&&j>=left&&j<=right){
                ans.add(matrix[i][j]);
                i--;
            }
            left++;
        }
        ans.add(matrix[i][j]);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList a = new PrintMatrix_19().printMatrix( new int[][]{{1, 2, 3}});
        System.out.println(a.toString());
    }
}
