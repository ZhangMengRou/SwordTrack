import java.util.HashSet;

public class MovingCount_66 {
    /*
    地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */
    HashSet<String> mark = new HashSet<>();

    int ans = 0;

    public int movingCount(int threshold, int rows, int cols) {

        count(threshold, 0, 0, rows, cols);
        return ans;
    }

    public void count(int threshold, int i, int j, int rows, int cols) {


        System.out.println(i + "---" + j);
        // 越界
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return;
        }
        System.out.println(countSum(i, j));
        if (countSum(i, j) > threshold) {
            System.out.println("return countSum");
            return;
        }
//        System.out.println(ans);
        if (mark.contains(i + "," + j)) {

            return;
        } else {
            ans++;
            mark.add(i + "," + j);
//            System.out.println("add "+rows + "," + cols);
            count(threshold, i - 1, j, rows, cols);
            count(threshold, i + 1, j, rows, cols);
            count(threshold, i, j - 1, rows, cols);
            count(threshold, i, j + 1, rows, cols);
//            mark.remove(rows + "," + cols);
        }
    }

    public int countSum(int rows, int cols) {
        int sum = 0;
        while (rows > 0) {
            sum += rows % 10;
            rows = rows / 10;
        }
        while (cols > 0) {
            sum += cols % 10;
            cols = cols / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(new MovingCount_66().movingCount(5, 10, 10));
    }

}
