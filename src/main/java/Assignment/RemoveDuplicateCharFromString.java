package Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args){
        String s = "chandralekha";
        Set<Character>  set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        System.out.println(set);

        String s1 = "chandralekha";
        String removeDupChar = " ";
        for(int i=0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            if(removeDupChar.indexOf(ch1) == -1){
                removeDupChar = removeDupChar + ch1;
            }
        }
        System.out.println(removeDupChar);
    }
}
