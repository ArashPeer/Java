package Car_Inheritance;

public class Main {


    public static void main(String[] args) {
        Internal_features car = new Internal_features(7.9, true,"Corolla", "Yellow", 6 );

        System.out.println("car = " + car.model);
        System.out.println("color = " + car.color);
        System.out.println("gear = " + car.gear);
        System.out.println("engine power = " + car.enginPower);
        System.out.println("electrical seats = " + car.electricalSeats);


    }
}
