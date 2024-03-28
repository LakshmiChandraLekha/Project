package Exceptions;

public class Finallyblock {

    public static void main(String[] args) {
        try{
            int a = 7/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            int a = 7/7;
            System.out.println(a);
        }
        finally {
            System.out.println("completed");
        }
    }
}
