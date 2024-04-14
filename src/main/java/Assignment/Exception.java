package Assignment;

public class Exception {
    public static void main(String[] args) {

        try{
            String s = "selenium";
            char c = s.charAt(9);
        }catch (StringIndexOutOfBoundsException si){
            //si.printStackTrace();
            System.out.println(si.getMessage());
        }
    }
}
