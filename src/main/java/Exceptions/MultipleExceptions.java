package Exceptions;

public class MultipleExceptions {

    public static void main(String[] args) {

        try{
            int a = 7/1;
            System.out.println(a);
            try{
                int b = 5/0;
            }
            finally {
                System.out.println("executed");
            }
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithematic Exception");
        }
        catch (Throwable th){
            System.out.println("Throwable catch block");
        }
        finally{
            System.out.println("Close Db");
        }

    }
}
