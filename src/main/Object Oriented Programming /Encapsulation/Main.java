package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setID(9);
        emp.setName("Arash Peer Mohammad");
        emp.setSalary(6000);

        System.out.println("ID: "+ emp.getID());
        System.out.println("NAME: "+ emp.getName());
        System.out.println("SALARY: "+ emp.getSalary());

    }
}
