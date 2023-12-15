package List;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArray_List {
    public static void main(String[] args) {
        /*
        Why do we use array list because in the example below we have student name and we defined the size in the
        array 30, and we stored 20 student in the array now if a new student comes in, we would not have a place
        for him in the array because the size is fixed for only 30, for better understanding consider the example below
        String[] studentName = new String[30];
        studentName[0] = "Mohammad";
        studentName[29] = "Mohammad";
          */
      /*  ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Arash");
        studentName.add("Mohammad");
        studentName.add("Tamana");
        studentName.add("Arsh");
        System.out.println("studentName = " + studentName);
        studentName.add(1,"Ahmad");
        System.out.println("studentName = " + studentName);*/

        /*ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
        numbers.add(0, 0);
        System.out.println("numbers = " + numbers);
        numbers.remove(0);
        System.out.println("numbers = " + numbers);
        numbers.size();
        System.out.println("numbers = " + numbers);


        ArrayList<Integer> empId = new ArrayList<>();
        empId.add(23434);
        empId.addAll(numbers);
        System.out.println(empId.get(2));
        System.out.println(empId.remove(0));
        System.out.println("empId = " + empId);*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (int element: list){
            System.out.println("element = " + element);

        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator "+ it.next());

        }


        /*System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(100));
        System.out.println("list = " + list);

        list.clear(); //this will remove all the element in the array.
        System.out.println("list = " + list);

*/
        /*System.out.println(list);
        list.set(0, 1);
        list.set(2,34553);

        System.out.println(list);

        System.out.println(list.get(1));*/


//        System.out.println(list.contains(100));
    }
}
