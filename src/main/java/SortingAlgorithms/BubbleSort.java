package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = {1,6,3,5,7,2};
        System.out.println("Array before sorting the elements " + Arrays.toString(a));
        int n = a.length;
        for(int i=0; i<n-1; i++)  // Number of Passes
        {
          for(int j=0; j<n-1; j++)  //Iterations in each pass
          {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
          }
        }
        System.out.println("Array after sorting the elements" + Arrays.toString(a));
    }
}
