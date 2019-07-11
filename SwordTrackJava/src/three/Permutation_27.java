package three;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation_27 {
    private ArrayList<String> arrayList = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {

        if (str==null||str.length()<1) return arrayList;
        PermutationHelper(new StringBuilder(str),0);
        Collections.<String>sort(arrayList);
        return arrayList;

    }
    public void PermutationHelper(StringBuilder str,int index) {

        if (index == str.length()-1){

            arrayList.add(str.toString());
            char c=str.charAt(index);
            for (int i=0;i<index;i++){
                if (str.charAt(i) != c) {
                    StringBuilder tmp = new StringBuilder(str);
                    tmp.setCharAt(index,tmp.charAt(i));
                    tmp.setCharAt(i,c);
                    arrayList.add(tmp.toString());

                }
            }
            return;
        }
        char c=str.charAt(index);

        for (int i=0;i<index;i++){
            if (str.charAt(i) != c) {
                StringBuilder tmp = new StringBuilder(str);
                tmp.setCharAt(index,tmp.charAt(i));
                tmp.setCharAt(i,c);
                PermutationHelper(new StringBuilder(tmp.toString()),index+1);
            }
        }
        PermutationHelper(new StringBuilder(str.toString()),index+1);
    }

    public static void main(String[] args) {

        System.out.println(new Permutation_27().Permutation("aab").toString());
    }
}
