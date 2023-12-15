package Method_Overloading;

import java.util.Random;

public class Overloading_Method {// that means, You can have multiple method with exact same name but different parameters

    public static int addNumbers(int a, int b){
        return a+b;
    }
    public static double addNumbers(double a, double b){
        return a+b;
    }
    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }
    public static  void addNumbers(){
        Random r = new Random();
        System.out.println(r.nextInt(6) + r.nextInt(6));
    }
    public static void main(String[] args) {

        double result1 = addNumbers(2.5,3.4);
        int result2 = addNumbers(2,3);
        int result3 = addNumbers(2,3,4);
        System.out.println(result1+"\n"+ result2);
        System.out.println(result3);
        addNumbers();

    }
}
