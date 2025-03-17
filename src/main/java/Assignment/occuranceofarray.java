package Assignment;

import java.util.Arrays;

public class occuranceofarray {

    public static void main(String[] args) {

          int a[] = {7,4,2,1,3,2,4,2,8};
          Arrays.sort(a);
          for(int i=0; i<a.length; i++){
              int count =1;
              if(i!= a.length-1){
                  for(int j=i+1; j<a.length; j++){
                      if(a[i] == a[j]){
                          count++;
                      }
                      else {
                          break;
                      }
                  }
                  System.out.println(a[i] + " => " + count);
                  i += count-1;
              }
          }
    }

}
