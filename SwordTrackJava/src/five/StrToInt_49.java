package five;

public class StrToInt_49 {
    public int StrToInt(String str) {
        if (str.length()<1)  return 0;
        if (str.length()==1&&(str.charAt(0)<'0'||str.charAt(0)>'9'))
            return 0;
        int flag = 1;
        int ans = 0;
        int i = 0;
        if (str.charAt(0)=='+'){
            i++;
        }
        if (str.charAt(0)=='-'){
            i++;
            flag = -1;
        }
        for (;i<str.length();i++){
            if (str.charAt(i)<'0'||str.charAt(i)>'9'){
                return 0;
            }
            ans = ans*10+str.charAt(i) - '0';
        }
        return ans*flag;
    }

    public static void main(String[] args) {
        System.out.println(new StrToInt_49().StrToInt("-159"));
    }
}
