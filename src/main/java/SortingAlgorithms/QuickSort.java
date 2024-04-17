package SortingAlgorithms;

public class QuickSort {

    public static void  Quicksort1(int arr[], int low, int high){

        int mid = (low + high)/2;
        int i = low;
        int j = high;
        int pivot =arr[mid];
        while(i<=j){
            while (arr[i] < pivot) {
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(low<j)
            Quicksort1(arr,low,j);
        if(high >i)
            Quicksort1(arr,i,high);

    }

    public static void main(String[] args) {

        int arr[] ={15,4,5,89,25,45,84};
        System.out.println("Before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Quicksort1(arr,0, arr.length-1);
        System.out.println("After sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
