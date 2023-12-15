import java.util.*;

public class Collection_Class {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(56);
        list.add(73);
        list.add(12);
        list.add(98);
        list.add(33);
        System.out.println(list);

        System.out.println("min element "+ Collections.frequency(list, 33));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        Collections.max(list); //this will show the max number of element
        Collections.min(list);// this one the minimum
        Collections.sort(list); // this wor sort the number out.
        //And there are still multiple other methods that we can use them in collections....

        String name = "Arash Peer Mohammad";
        StringBuilder nameReverse = new StringBuilder(name);




    }
}
