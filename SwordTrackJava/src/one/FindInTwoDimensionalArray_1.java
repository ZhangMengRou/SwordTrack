package one;

public class FindInTwoDimensionalArray_1 {


    /*
     https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
      */
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length < 1 || array[0].length < 1) {
            return false;
        }

        int x = array[0].length - 1;
        int y = 0;
        while (x >= 0 && y <= array.length - 1) {
            if (array[y][x] == target) {
                return true;
            }
            if (array[y][x] > target) {
                x--;
            }else if (array[y][x] < target) {
                y++;
            }
        }
        return false;
    }

}
