package Assignment;

public class Factorialofthenumber {

    public static void main(String[] args) {
       // factorial number 1*2*3*4*5
        int num = 5;
        int factnum = 1;
        for(int i=factnum; i<=num; i++){
            factnum = factnum * i;
        }
        System.out.println("Factorial of the given number " + factnum);
    }
}
