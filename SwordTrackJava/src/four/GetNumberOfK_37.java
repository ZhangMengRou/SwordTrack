package four;

public class GetNumberOfK_37 {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null) return 0;
        int left = 0;
        int right = array.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == k) {
                int ml = mid - 1;
                int m2 = mid + 1;
                ans = ans + 1;
                while (ml >= 0 && array[ml] == k) {
                    ans++;
                    ml--;
                }
                while (m2 < array.length && array[m2] == k) {
                    ans++;
                    m2++;
                }
                return ans;
            }
            if (array[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 3, 3, 3, 4, 5};
    }
}
