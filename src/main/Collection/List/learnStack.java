package List;

import java.util.Stack;

public class learnStack { // that means last IN first OUT
    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Cat");
        animal.push("Dog");
        animal.push("Tiger");
        animal.push("Cheetah");

        System.out.println("animal = " + animal);
        animal.pop();
        System.out.println("animal = " + animal);
        System.out.println(animal.peek());


    }
}
