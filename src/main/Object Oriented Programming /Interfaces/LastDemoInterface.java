package Interfaces;

//Here want to work on the logic as a programmer,
interface Computer
{
     void code();

}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("int a = 10 :: code, compile, run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("int a = 10 :: code, compile, run :: FASTER");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class LastDemoInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer arash = new Developer();
        arash.devApp(lap);

    }
}
//This is called loosely copuled