package Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("One", 1);
        nums.put("Two", 2);
        nums.put("Three", 3);
        nums.put("Four", 4);
        nums.put("Five", 5);

//        if(!nums.containsKey("Two")){
//            nums.put("Two", 22);
//        }
//        nums.putIfAbsent("Two", 24); //This one is also working as if condition.

        System.out.println("nums = " + nums);

        //Now how to iterate this?
        for(Map.Entry<String, Integer> e: nums.entrySet()){
//            System.out.println("e = " + e);
            System.out.println("e.getKey() = " + e.getKey());
            System.out.println("e.getValue() = " + e.getValue());
        }
        for(String key: nums.keySet()){
            System.out.println("key = " + key);
        }
        for(Integer val: nums.values())
        {
            System.out.println("val = " + val);
        }

    }
}
