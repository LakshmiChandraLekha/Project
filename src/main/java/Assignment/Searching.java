package Assignment;

public class Searching {

    public static int binarysearch(int[] a, int key) {

        int l = 0, h = a.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
                l = l;
            } else {
                l = mid + 1;
                h = h;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[]  a = {3,5,6,8,12,15,16,19,21};
        int key = 15;
        System.out.println(binarysearch(a,key));

    }
}