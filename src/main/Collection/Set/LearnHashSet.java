package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
//        Set<Integer> setElement = new HashSet<>();
//        Set<Integer> linkHsh_set = new LinkedHashSet<>();
        //both HashSet and LinkedHashSet will do the same job, the only difference is that in linkedHashSet
        //that will show the element in order which in hashSet it is not doing the same order.

        Set<Integer> setElement = new TreeSet<>();
        //behind the sean it organize everything in sorted form


        setElement.add(100);
        setElement.add(200);
        setElement.add(300);
        setElement.add(400);
        setElement.add(500);

        setElement.add(500);//Ah I cannot add duplicate element.

        System.out.println(setElement);
        System.out.println(setElement.contains((500)));

        if(setElement.contains(100) == true){
            System.out.println("The element is present ");
        }else{
            System.out.println("The element is not present");
        }

    }
}
