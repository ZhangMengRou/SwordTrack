package five;

public class LeftRotateString_43 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < 1) return "";
        n = n % str.length();
        return str.substring(n, str.length()) + str.substring(0, n);

    }


}
