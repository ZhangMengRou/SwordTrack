package five;

public class ReverseSentence_44 {
    /*
     */

    public String ReverseSentence(String str) {
        //trim 去掉首尾空格
        if(str==null||str.trim().length()==0)
            return str;

        String[] sList = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int end = str.length();
        int start = str.length() - 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                stringBuilder.append(str.substring(start, end));
                stringBuilder.append(" ");
                end = i;
            } else {
                start = i;
            }

        }
        stringBuilder.append(str.substring(0, end));
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(new ReverseSentence_44().ReverseSentence(" "));
    }
}
