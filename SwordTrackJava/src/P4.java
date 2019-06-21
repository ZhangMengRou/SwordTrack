public class P4 {


    /*
     1234
     2456
     3789
     5
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
