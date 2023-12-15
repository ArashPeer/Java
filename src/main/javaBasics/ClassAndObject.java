public class ClassAndObject {

    //Class is a bluprint and the creator of an object, Whenever you create class it has to be started with uppercase
    /*public static void main(String[] args) {
        //Classes and Objects,
        //as soon as you use new in this code below, that means lenseOne itself is an Object.
        Lense lenseOne = new Lense("Sony", "85mm", true);
        Lense lenseTwo = new Lense("Canon", "65mm", false);
        Lense lenseThree = new Lense("Panasonic", "90mm", true);
        System.out.println("Lens 1");
        System.out.println(lenseOne.brand);
        System.out.println(lenseOne.focalLeghnt);
        System.out.println(lenseOne.isPrime);

        System.out.println("Lens 2");
        System.out.println(lenseTwo.brand);
        System.out.println(lenseTwo.focalLeghnt);
        System.out.println(lenseTwo.isPrime);

        System.out.println("Lens 3");
        System.out.println(lenseThree.brand);
        System.out.println(lenseThree.focalLeghnt);
        System.out.println(lenseThree.isPrime);


    }
    static class Lense {
        String brand;
        String focalLeghnt;
        boolean isPrime;

        Lense(String brand, String focalLeghnt, boolean isPrime){//this is called constructor, to construct obj
            this.brand = brand;//"this" means the current state of the current class.this, is the template or blueprint to create our object.
            this.focalLeghnt = focalLeghnt;
            this.isPrime = isPrime;
        }

    }*/

    public static void main(String[] args) {
        Car carOne = new Car("Corolla", "Toyota", 4, true);
        System.out.println(carOne.model);
        System.out.println(carOne.made);
        System.out.println(carOne.doors);
        System.out.println(carOne.isPrime);
    }
    static class Car{ //class, a blueprint for creating an object
        String model;
        String made;
        int doors;
        String company;
        boolean isPrime;
        Car(String model, String made, int doors, boolean isPrime){
            this.model = model;
            this.made = made;
            this.doors = doors;
            this.isPrime = isPrime;
        }

    }
}


