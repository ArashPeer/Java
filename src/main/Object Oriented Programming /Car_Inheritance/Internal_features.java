package Car_Inheritance;

public class Internal_features extends Toyota {
    double enginPower;
    boolean electricalSeats;

    Internal_features(double enginPower, boolean electricalSeats, String model, String color, int gear){
        super(model, color, gear);
        this.enginPower = enginPower;
        this.electricalSeats = electricalSeats;
    }
}
