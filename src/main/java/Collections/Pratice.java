package Collections;

import java.util.*;

public class Pratice {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("selenium");
        list.add("Api");
        list.add("webdriverio");
        list.add("Api");
        list.add("playwright");

        System.out.println(list);

        Set set = new HashSet();
        set.add("selenium");
        set.add("playwright");
        set.add("Api");
        set.add("selenium");
        set.add("webdriverio");

        System.out.println(set);


            Set tset = new TreeSet();
        tset.add("selenium");
        tset.add("playwright");
        tset.add("Api");
        tset.add("selenium");
        tset.add("webdriverio");

        System.out.println(tset);


    }
}
