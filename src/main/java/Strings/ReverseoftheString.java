package Strings;

public class ReverseoftheString {

    public static void main(String[] args) {

        String s = "selenium";

        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));

           /* String s1 = "java";
            StringBuffer sb = new StringBuffer(s1);
            System.out.print(sb.reverse());*/
        }
    }
}
