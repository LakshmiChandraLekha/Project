package Assignment;

public class DuplicateElementsinarray {

    public static void main(String[] args) {

        int a[] = {1,3,4,6,5,3,1};
        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicate elements in array " + a[i]);
                }
            }
        }
    }
}
