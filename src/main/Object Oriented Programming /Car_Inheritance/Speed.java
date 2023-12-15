package Car_Inheritance;

public class Speed extends Toyota{
    int speed;

    Speed(int speed, String model, String color, int gear){
        super(model, color, gear);
        this.speed = speed;
    }
}
