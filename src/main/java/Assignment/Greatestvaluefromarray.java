package Assignment;

public class Greatestvaluefromarray {

    public static void main(String[] args) {

        int a[] = {1,3,5,4,6,2,7};
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Greatest value from an array is " + max);
    }
}
