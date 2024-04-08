package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

      List l =  new ArrayList();
      l.add("Ruby");
      l.add("java");
      l.add("C");
      l.add("python");
        System.out.println(l);
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

          ArrayList<String> list = new ArrayList();
        list.add("Selenium");
        list.add("playright");
        list.add("Tosca");
        list.add("Webdriverio");
        System.out.println(list);
        for(String s:list){
            System.out.println(s);
        }
       Iterator iterator = list.iterator();
        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());*/

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
