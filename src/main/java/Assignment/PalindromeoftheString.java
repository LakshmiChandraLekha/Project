package Assignment;

public class PalindromeoftheString {

    public static void main(String[] args) {

        String string = "level";
        String revString = "";

        for(int i=string.length()-1; i>=0; i--){

            revString = revString + string.charAt(i);
        }
        System.out.println("Reverse of the String " + revString);
        if(revString.equals(string)){
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given String is not a palindrome");
        }
    }
}
