package Interfaces;

interface A {
    //by default all the variables inside interface is static and final. that means initialing the varibale.
    int age = 37;
    String area = "San Antonio";
     void boy();
     void girl();
}
class B implements A
{

    @Override
    public void boy() {
        System.out.println("Iam a Boy!");
    }

    @Override
    public void girl() {
        System.out.println("Iam a Girl!");
    }
}
class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.boy();
        obj.girl();
        System.out.println(A.age+"\n"+A.area);
    }

}