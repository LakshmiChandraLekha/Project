package Collections;

import java.util.ArrayList;

public class Arraylist2 {

    public static void main(String[] args) {

        //int a[] = {1,2,3,45,56};

               ArrayList arraylist = new ArrayList();
               arraylist.add("selenium");
               arraylist.add(2);

               String l = arraylist.get(1).toString();
        System.out.println(l);

             int k = Integer.parseInt(l);
        System.out.println(k);
    }
}
