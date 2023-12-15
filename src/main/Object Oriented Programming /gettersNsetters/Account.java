package gettersNsetters;

public class Account {
    int age;
    String name;
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAge(37);
        ac.setName("Arash");
        ac.printDetails();
        ac.setName("Jamal");
        ac.setAge(65);
        ac.printDetails();

    }
    public void printDetails(){
        System.out.println("name = " +  name +"\n" + "age "+age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
