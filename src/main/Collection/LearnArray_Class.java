import java.util.Arrays;

public class LearnArray_Class {
    /*The Arrays class in Java is a utility class that provides various static methods for manipulating arrays.
     It is part of the java.util package. Some of the commonly used methods in the Arrays class include:*/
    public static void main(String[] args) {
//        int[] numbers = {1,2,4,3,5,8,7,6,9};
//        int index = Arrays.binarySearch(numbers,3);//in order to work with binarySearch the numbers should sorted
//        System.out.println("index = " + index);
        Integer[] numbers = {1,2,4,3,5,8,7,6,9};
        Arrays.sort(numbers);


        for (int i: numbers){
            System.out.println("i = " + i);

        }
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("index = " + index);

        System.out.println(Arrays.toString(numbers));


    }


}

