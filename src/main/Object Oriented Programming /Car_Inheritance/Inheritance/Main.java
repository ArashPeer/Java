package Car_Inheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Shoe productShoe = new Shoe("Adidas", 8.5);
        Walking walk = new Walking(true,"Adidas", 8.5);
        Running run = new Running(4.5,"Adidas", 8.5);

        System.out.println(run.brand);
        System.out.println(productShoe.size);
    }
}
