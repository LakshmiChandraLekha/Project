package Assignment;

public class FirstAndLastOccuranceOFChar {
    public static void main(String[] args) {

        String s ="aabbaabaccc";
        char c = 'b';
        int firstocc = -1;
        int lastocc = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == c) {
                if (firstocc == -1) {
                    firstocc = i;
                }
                lastocc = i;
            }
        }
        System.out.println(firstocc);
        System.out.println(lastocc);
    }
}
