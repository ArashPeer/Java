package Encapsulation.Encapsulation_2;

public class Main {

    public static void main(String[] args) {

        Cars myCar = new Cars("Toyota", "$25000", "220_mph");
//        System.out.println("NAME: " + myCar.getName());
//        System.out.println("PRICE: " + myCar.getPrice());
//        System.out.println("SPEED: " + myCar.getTopSpeed());

        System.out.println("NAME: " + myCar.getName()+ "\nPRICE: " + myCar.getPrice() + "\nSPEED: " + myCar.getTopSpeed() );

        System.out.println("INFORMATION UPDATED!!");
        myCar.setPrice("$30000");
        myCar.setTopSpeed("250_mph");
        System.out.println("NAME: "+myCar.getName()+"\nPRICE UPDATED: "+myCar.getPrice() +"\nSPEED UPDATED: "+ myCar.getTopSpeed());

    }
}
