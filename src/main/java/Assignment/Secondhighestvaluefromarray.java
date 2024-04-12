package Assignment;

import java.util.Arrays;

public class Secondhighestvaluefromarray {
    public static void main(String[] args) {

        int a[] = { 5,7,8,6,2,9,1};

        int max = a[0];
        int secmax = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                secmax = max;
                max = a[i];
            }
            else if (a[i] > secmax) {
                secmax = a[i];
            }
        }
        System.out.println(secmax);

        int a1[] = {4,6,7,8,9,1};

        Arrays.sort(a1);
        System.out.println(a1[a1.length-2]);

    }



}
