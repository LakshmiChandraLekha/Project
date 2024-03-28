package Exceptions;

public class TypeofExceptions {
   String s;
    public static void main(String[] args) {

        TypeofExceptions t = new TypeofExceptions();
        t.ArithmeticException();
        t.StringIndexOutOfBoundsException();
        t.ArrayIndexOutOfBoundsException();
        t.nullpointerException();
    }

    public void  ArithmeticException() {
        try {
            int a = 5 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("completed");
        }

    }
    public void StringIndexOutOfBoundsException() {
        try {
            String s = "selenium";
            char c = s.charAt(9);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException | ArithmeticException s) {
            s.printStackTrace();
            System.out.println("completed");

        }
    }
    public void ArrayIndexOutOfBoundsException (){
        try{
            int a[] = {1,2,3,4,5,6,6,6};
            System.out.println(a[9]);
        }
        catch(ArrayIndexOutOfBoundsException a){

            a.printStackTrace();
        }
    }
    public void nullpointerException(){
        try{
           // String s =null;
            System.out.println(s.length());
        }
        catch (NullPointerException n){
            n.printStackTrace();

        }
    }
}
