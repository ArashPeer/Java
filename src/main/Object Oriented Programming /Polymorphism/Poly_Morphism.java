package Polymorphism;

class Bird //anything inside a class is methods and variables
{
    //one straight form of polymorphism as follows
    public void song()
    {
        System.out.println("tweet tweet tweet");
    }

}
class Parrot extends Bird
{
    public void song()
    {
        System.out.println("Koowaak Koowaak");
    }

}
class eagle extends Bird
{
    public void song()
    {
        System.out.println("Yeeeah Yeeeah");
    }
}


public class Poly_Morphism {//that means, Many forms of a method

    public static void main(String[] args) {

        Parrot b = new Parrot();
        b.song();

    }
}
