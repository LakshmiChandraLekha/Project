package Assignment;

public class ReverseofsubString {

    public static void main(String[] args) {

        String string = "Hello World I love selenium";
        String[] split = string.split(" ");
        String revString = " ";
        for(int i=0; i< split.length; i++){
            String subString = split[i];
            String revSubString = " ";
            for(int j=subString.length()-1; j>=0; j--){
                revSubString = revSubString + subString.charAt(j);
            }
            revString = revString + revSubString;
        }
        System.out.println(revString);
    }
}
