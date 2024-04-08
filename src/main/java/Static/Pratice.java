package Static;


import java.util.Arrays;

public class Pratice {

    public static void main(String[] args) {

        int a[] = {23,4,87,97,6,56,24,45};
       // Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            if(a[i] > 56){
                break;
            }
            else {
                System.out.println(a[i] + " ");
            }
        }

        for(int i=0; i<a.length; i++){
            if (a[i] < 4){
                continue;
            }
            else{
                System.out.println(a[i] + " ");

            }
        }
        for(int k:a){
            System.out.println(k);
        }
    }
}
