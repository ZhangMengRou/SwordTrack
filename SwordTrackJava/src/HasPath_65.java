import java.util.HashMap;
import java.util.HashSet;

public class HasPath_65 {
    /*
   "ABC
   ESF
   CSA
   DEE",3,4,"SEE"
     */
    HashSet<String> mark = new HashSet<>();

    boolean ans = false;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        char[][] box = new char[rows][cols];
        int k = 0;
        if (rows * cols != matrix.length) return false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                box[i][j] = matrix[k];
                k++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (ans) {
                    return ans;
                }
                hasPath(box, i, j, str);
            }
        }

        return ans;
    }

    public void hasPath(char[][] box, int rows, int cols, char[] str) {

        if (str.length == 0 || ans) {
            ans = true;
            return;
        }
        // 越界
        if (rows < 0 || rows >= box.length || cols < 0 || cols >= box[0].length) {
            return;
        }
        if (str[0] != box[rows][cols] || mark.contains(rows + "," + cols)) {
            return;
        } else {
            mark.add(rows + "," + cols);
            hasPath(box, rows - 1, cols, String.valueOf(str).substring(1, str.length).toCharArray());
            hasPath(box, rows + 1, cols, String.valueOf(str).substring(1, str.length).toCharArray());
            hasPath(box, rows, cols - 1, String.valueOf(str).substring(1, str.length).toCharArray());
            hasPath(box, rows, cols + 1, String.valueOf(str).substring(1, str.length).toCharArray());
            mark.remove(rows + "," + cols);
        }
    }

}
