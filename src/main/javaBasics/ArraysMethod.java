import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysMethod {
    public static void main(String[] args) {
        //Arrays
        int [] numbers = {1,2,3, 33, 45};

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);

/*        String [] names = new String[4];
        names[0] = "Ali";
        names[1] = "Mohammad";
        names[2] = "Omar";
        names[3] = "Johan";
        System.out.println(Arrays.toString(names));*/

        //Arrays AND indexes
        int[] nums = {1,2,3,4,5,6,10};
        int sum = IntStream.of(nums).sum();
        System.out.println("sum = " + sum);

        int size = nums.length;
        Arrays.sort(nums);
        System.out.println("sorted Array ::"+Arrays.toString(nums));
        int res = nums[size-1];
        System.out.println("Largest value in the array is ::"+res);

//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//            System.out.println(sum);
//        }
//        int num1 = 10;
//         num1 -= 5;
//        System.out.println(num1);
       /* for (int i = 0; i < nums.length; i++){
            System.out.println("i = " + nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
        }*/
//        Arrays.stream(nums).forEach(System.out::println);
       /////////////////////
        //What is break, lets see
       String[] namePerson = {"Mehrab", "Shayesta", "Ali", "Jamshid", "Lala", "Amir", "Aadi"};
        for (String s : namePerson) {
//            if(s.equals("Ali")){
//                break;
//            }
            if (s.endsWith("A".toLowerCase())){
                continue;
            }
            System.out.println("s = " + s);
        }

    }
}
