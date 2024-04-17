package SortingAlgorithms;

import java.util.Scanner;

public class Mergesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want to sort");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mSort(a, 0, a.length - 1);
        for(int x:a){
            System.out.println(x);
        }
    }
        public static void mSort(int[] a, int i, int j) {
            if (i < j) {
                int mid = (i + j) / 2;
                mSort(a, i, mid);
                mSort(a, mid + 1, j);
                merge(a, i, mid, j);
            }
        }
            public static void merge(int[] a, int low, int mid, int high){
                 int i = low;
                 int j = mid+1;
                 int k = low;
                 int[] b = new int[a.length];
                 while(i<=mid&&j<=high){
                     if(a[i] < a[j]){
                         b[k] = a[i];
                         i++;
                         k++;
                     }
                     else {
                         b[k] = a[j];
                         j++;
                         k++;
                     }

            }
                 while(i<=mid){
                     b[k] = a[i];
                     i++;
                     k++;
                 }
                 while(j<=high){
                     b[k] = a[j];
                     j++;
                     k++;
                 }
                 for (i=low; i<=high; i++){
                     a[i] = b[i];
                 }

    }
}
