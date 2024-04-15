package Assignment;

public class Fibonacci {

    public static void main(String[] args) {

        // fibonacci series 0 1 1 2 3 5 8 13
        int num = 0;
        int num1 = 1;
        int num2;
        System.out.print(num + " ");
        System.out.print(num1 + " ");
        for(int i=0; i<7; i++){
            num2 = num + num1;
            System.out.print(num2 + " ");
            num = num1;
            num1 = num2;
        }

    }
}
