package classesAndObject;

public class Student { // a class in java has attributes = "properties"  and behaviors = "methods" for an entity.
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        //a constructor is a special type of method to initialize any classes object.
    }
    //Here are we are modifying the object
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //we use getter to retrive those modifed attributes
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    //method overriding
    public String toString(){
        return ("Student name is "+this.getName() + ", age is: " + this.getAge() + ", and Address "+ this.getAddress());
    }

    //main method where we can execute out code with calling the constructor. 

    public static void main(String[] args) {
        Student darya = new Student("Darya", 25, "2330 Austin Highway");
        System.out.println(darya.getName());
        System.out.println(darya.getAge());
        System.out.println(darya.getAddress());
    }
}
