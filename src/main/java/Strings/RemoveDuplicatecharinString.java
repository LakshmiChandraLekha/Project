package Strings;

public class RemoveDuplicatecharinString {

    public static void main(String[] args) {

        String s = "testing";
        String dup = " ";
        for(int i=0; i<= s.length()-1; i++){
            char ch = s.charAt(i);
            if(dup.indexOf(ch) == -1){
                dup = dup+ch;
            }
        }
        System.out.println(dup);
    }
}
