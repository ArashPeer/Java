package Abstract_Classes;

abstract class Car
{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("Playing Music!");
    }
    public abstract void color();
}
 class Toyota extends Car
{
    @Override
    public void color(){
        System.out.println("The color of the car is Yellow");
    }
    public void drive() {
        //super.drive();
        System.out.println("Driving!");
    }
}



public class Demo
{
    public static void main(String[] args) {

        Car obj = new Toyota();
        obj.drive();
        obj.playMusic();
        obj.color();

    }

}
