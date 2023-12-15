package Abstract_Classes;

abstract class StudentUnifrom
{
    public void shirt()
    {
        System.out.println("blue shirt");
    }
    public abstract void shoe();
    public abstract void hat();

}

abstract class newUniform extends StudentUnifrom
{
    @Override
    public void shoe() {
        System.out.println("the mark for this shoe is Nike");
    }

}
class updatedUniform extends newUniform
{
    public void hat(){
        System.out.println("No hats during the class!");
    }
}

public class Student {
    public static void main(String[] args) {

        StudentUnifrom stUniform = new updatedUniform();
            stUniform.shirt();
            stUniform.shoe();
            stUniform.hat();

    }

}



