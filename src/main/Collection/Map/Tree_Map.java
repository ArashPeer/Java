package Map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("Laptop", 1);
        tm.put("desktop", 6);
        tm.put("keyword", 3);
        tm.put("Mouse", 1);
        tm.put("Charger", 2);
        tm.put("desktop", 3);

        System.out.println("tm = " + tm);
        System.out.println(tm.get("desktop"));

        tm.remove("Laptop");
        System.out.println("tm = " + tm);

        System.out.println(tm.containsKey("Charger")+ "\n" +tm.containsValue(3));

       /* for (Map.Entry<String, Integer> loop: tm.entrySet()){
            System.out.println("loop = " + loop);
        }
        for(String key: tm.keySet()){
            System.out.println("key = " + key);
        }*/

    }
}
