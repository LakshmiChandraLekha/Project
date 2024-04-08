package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap();
        map.put(1,"selenium");
        map.put(2,"API testing");
        map.put(1,"playwright");
        map.put(3,"webdriverio");
        map.put(null,null);
        map.put(4,null);

        System.out.println(map);


        Map<Integer, String> tm = new TreeMap();
        tm.put(1,"selenium");
        tm.put(2,"API testing");
        tm.put(1,"playwright");
        tm.put(3,"webdriverio");
        //tm.put(null,null);
       tm.put(4,null);
        System.out.println(tm);

    }
}
