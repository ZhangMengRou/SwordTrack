package one;

public class ReplaceBlanks_2 {
    // ' '-->%20
    private String replaceSpace(StringBuffer str) {
        if (str == null){
            return null;
        }
        int blackCount = 0;
        int len = str.length();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                blackCount++;
            }
        }
        str.setLength(str.length()+blackCount*2);
        for (int j = str.length()-1,i = len - 1;j>i&&i>=0;i--,j--){
            if (str.charAt(i)==' '){
                str.setCharAt(j,'0');
                j--;
                str.setCharAt(j,'2');
                j--;
                str.setCharAt(j,'%');
            }else {
                str.setCharAt(j,str.charAt(i));
            }
        }

        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(new ReplaceBlanks_2().replaceSpace(new StringBuffer("momf jaonf sadjio ")));
    }
}
