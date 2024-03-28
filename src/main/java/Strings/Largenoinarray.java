package Strings;

public class Largenoinarray {

    public static void main(String[] args) {

        int a[] = {2,3,5,8,2,1};
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
