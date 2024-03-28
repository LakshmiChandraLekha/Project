package Exceptions;

public class Pratice {

    public static void main(String[] args) {

        /*try {
            String s = "selenium";
            char c = s.charAt(9);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException | ArithmeticException s) {
            s.printStackTrace();
            System.out.println("completed");

        }

        try {
            int a = 5 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("completed");
        }*/


        try{
            int a = 5/0;
            System.out.println(a);
            //throw new ArithmeticException("invalid");

        }catch (ArithmeticException e){
            System.out.println("executed");
            throw new ArithmeticException("lekha");

        }

    }


}
