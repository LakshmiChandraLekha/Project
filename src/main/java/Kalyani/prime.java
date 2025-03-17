package Kalyani;

public class prime {

    public static void main(String[] args) {
        int num=13, count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Given number is a Prime number");
        }
        else{
            System.out.println("Given number is not a Prime number");
        }
    }
}
