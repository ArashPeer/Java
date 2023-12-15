import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World My first written code");
        /*
        Primitive data types
        Data Type       size        Description
        byte            1 byte      -128 - 127
        short           2 byte      -32,768 to 32,767
        int             4 byte      -2,147,483,648 to 2,147,483,647
        long            8 byte      9,223,372,854,775,807
        float           4 bytes     6 to 7 decimal digit, stores fractional numbers
        double          8 bytes     15 decimal digit, stores fractional numbers
        boolean         1 byte      true/false
        char            2 byte      stores single character/letter or ASCII Values.

        None primitive data types
        none reference type always starts with capital letter
        String
        Date
        LocalDate
        * */
        //data type demo
       int num1 = 15;
       int  num2 = num1;
       num1 = 200;
        System.out.println("num1 = "+ num1 + " num2 = "+ num2);

        //in the example below String is a class, name is an obj and obj has behavior action with it..
        String name = new String("Arash");
        System.out.println(name.contains(name));

    }


}

