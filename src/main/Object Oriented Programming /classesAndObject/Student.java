package classesAndObject;

public class Student { // a class in java has attributes = "properties"  and behaviors = "methods" for an entity.
    String name;
    int age;
    String address;
    double grade;

    public Student(String name, int age, String address, double grade){
        this.name = name;
        this.age = age;
        this.address = address;
        this.grade = grade;
        //a constructor is a special type of method to initialize any classes object.
    }
    //Here are we are modifying the object
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){this.grade = grade;}
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
    public double getGrade(){return grade;}
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    //method overriding
    public String toString(){
        return ("Student name is "+this.getName() + ", age is: " + this.getAge() + ", and Address "+ this.getAddress() + " the grade is " + this.grade);
    }

    //main method where we can execute out code with calling the constructor. 

    public static void main(String[] args) {
        Student darya = new Student("Darya", 25, "2330 Austin Highway", 3.50);
        System.out.println(darya.getName());
        System.out.println(darya.getAge());
        System.out.println(darya.getAddress());
        System.out.println(darya.getGrade());
    }
}
