package six;

public class Match_52 {
    /*
    请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
     */
    private boolean flag = false;

    public boolean match(char[] str, char[] pattern) {
        int i = 0, j = 0;
        flag = flag || match(str, pattern, i, j);
        return flag;
    }

    public boolean match(char[] str, char[] pattern, int i, int j) {

        if (i == str.length && j == pattern.length || flag) return true;
        if (j == pattern.length) return false;


        if (j + 1 < pattern.length && pattern[j + 1] == '*') {
            flag = flag || match(str, pattern, i, j + 2);

            char c = pattern[j];
            while (i < str.length && (str[i] == c || c == '.')) {
                flag = flag || match(str, pattern, i + 1, j + 2);
                i++;
            }

        }
        if (pattern[j] == '.') {
            return match(str, pattern, i + 1, j + 1);
        }

        if (i < str.length && j < pattern.length && str[i] == pattern[j]) {
            return match(str, pattern, i + 1, j + 1);

        } else {
            return flag;
        }

    }

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "ab*ac*a";
        char[] str = s1.toCharArray();
        char[] pattern = s2.toCharArray();
        System.out.println(new Match_52().match(str, pattern));
    }
}
