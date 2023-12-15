package classesAndObject;

public class Constructor {

    public static void main(String[] args) {
        Dog myDog = new Dog("German Shipper", 4, false);
        if(myDog.name.equals("German Shipper") && myDog.age == 4){
            System.out.println("The comparison is correct!");
        }else{
            System.out.println("The comparison is incorrect");
        }
        System.out.println(myDog.healthy);
    }
}
