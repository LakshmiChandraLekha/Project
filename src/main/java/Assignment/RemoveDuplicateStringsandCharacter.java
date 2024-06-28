package Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStringsandCharacter {

    public static void main(String[] args) {
       // Remove duplicate strings
        String s = "java is coding language java  language is very useful";
        String[] split = s.split(" ");
        Set<String> set = new LinkedHashSet<>();
        for(String string: split){
            set.add(string);
        }
        System.out.println(set);

        // Remove duplicate characters in given String

        String s1 = "chandralekha";
        Set<Character> set1 = new LinkedHashSet<>();
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            set1.add(c);
        }
        System.out.println(set1);
    }
}
