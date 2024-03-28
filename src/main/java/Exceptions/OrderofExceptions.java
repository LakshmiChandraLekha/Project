package Exceptions;

public class OrderofExceptions {

    public static void main(String[] args) {

        try{
            int a = 4/0;
            System.out.println(a);
        }
        catch(ArithmeticException ar){
            ar.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException arr){
            arr.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException ar){
            ar.printStackTrace();
        }
        catch (IndexOutOfBoundsException i){
            i.printStackTrace();
        }
        catch(RuntimeException r){
            r.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
