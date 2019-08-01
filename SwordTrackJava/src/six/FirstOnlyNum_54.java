package six;

import java.util.*;

public class FirstOnlyNum_54 {
    /*
    请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
     */
    private List<Character> list = new ArrayList<>();
    private HashMap<Character, Integer> map = new HashMap();
    private int i = 0;


    //Insert one char from stringstream
    public void Insert(char ch) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
        if (map.get(ch) == 1)
            list.add(ch);


    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {

        while (list.size() > 0 && map.getOrDefault(list.get(0), 0) > 1) {
            list.remove(0);
        }


        if (list.size() == 0) {
            return '#';
        } else {

            return list.get(0);
        }
    }

    public static void main(String[] args) {
        char[] t = "google".toCharArray();
        FirstOnlyNum_54 x = new FirstOnlyNum_54();
        for (char a : t) {
            x.Insert(a);

            System.out.println(x.FirstAppearingOnce());
        }
    }
}
