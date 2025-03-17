package Kalyani;

public class Primenumber {
    public static void main(String[] args) {

         int count =0;
         for(int num=1; num<=10; num++){
             for(int i=1; i<=num; i++){
                 if(num % i == 0){
                     count++;
                 }
                 else if(count ==2){
                     System.out.println(num + "is a prime number");
                 }
                 else{
                     System.out.println(num + "is not a prime number");
                 }
             }

         }
        }
    }