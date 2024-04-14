package Assignment;

import java.util.Arrays;


public class Anagram {

    public static void main(String[] args) {

        String s1 = "She is Lekha";
        String s2 = "heS Si kahLe";

        s1 = s1.replaceAll(" ","");
        s2 = s2.replaceAll(" ","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result =  Arrays.equals(a,b);

        if(result == true){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
}
