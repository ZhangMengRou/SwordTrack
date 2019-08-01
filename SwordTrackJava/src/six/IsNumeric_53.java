package six;

public class IsNumeric_53 {
    /*
......感到难受
     */
    int point = 0;

    public boolean isNumeric(char[] str) {

        if (str == null || str.length < 1) return false;

        int start = 0;
        int end = str.length - 1;
        if (str[0] == '+' || str[0] == '-') start++;
        for (int i = start; i < str.length; i++) {

            if (str[i] == 'e' || str[i] == 'E') {
                if (i + 1 < str.length) {
                    if (str[i] == 'e') {
                        int k = i + 1;
                        while (k < str.length) {
                            if (str[k] == '.')
                                return false;
                            k++;
                        }
                    }
                    if (str[i + 1] == '-' || str[i + 1] == '+') {

//                        System.out.println(isPureNum(str, start, i - 1));
//                        System.out.println(isPureNum(str, i + 2, end));
                        return isPureNum(str, start, i - 1) && isPureNum(str, i + 2, end);
                    } else {
                        return isPureNum(str, start, i - 1) && isPureNum(str, i + 1, end);

                    }
                } else {
                    return false;
                }
            }

        }
        for (int i = start; i < str.length; i++) {


            if (str[i] == '.') {
                point = 1;
                if (start <= i - 1) {
                    return isPureNum(str, start, i - 1) && isPureNum(str, i + 1, end);
                } else {
                    return isPureNum(str, i + 1, end);

                }
            }
        }
        return isPureNum(str, start, end);
    }


    public boolean isPureNum(char[] str, int start, int end) {
        if (start > end) return false;
        if (start == end) {
            if (str[start] >= '0' && str[start] <= '9') {
                return true;
            }
            return false;
        }
        int i = start;

        while (i <= end) {
            if (str[i] < '0' || str[i] > '9') {
                if (str[i] == '.') {
                    point++;
                    i++;
                    continue;
                }
                return false;
            }
            i++;
        }
        return point < 2;
    }

    public static void main(String[] args) {
        System.out.println(new IsNumeric_53().isNumeric("12e+5.4".toCharArray()));
    }
}
