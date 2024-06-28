package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

    public static void main(String[] args) {

        //int a[] = {1,2,3,45,56};

             //

        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        System.out.println(integer);

        List<String> string = new ArrayList<>();
        string.add("lekha");
        string.add("xyxz");
        System.out.println(string);

        List list = new ArrayList();
        list.addAll(string);
        list.addAll(integer);
        System.out.println(list);



    }
}
