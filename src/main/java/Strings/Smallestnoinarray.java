package Strings;

public class Smallestnoinarray {

    public static void main(String[] args) {

        int a[] = {1,4,45,8,6};
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }

        }
        System.out.println(min);



    }
}
