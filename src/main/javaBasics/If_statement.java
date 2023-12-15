public class If_statement {

    public static void main(String[] args) {
        int age = 25;
        if((age >= 18 || age == 17) && age <= 16){
            System.out.println("Iam an Adult");
        } else if (age >= 18) {
            System.out.println("Yehhh!! Iam an Adult ");
        } else if (!(age >= 17)) {
            System.out.println("Still I need to wait");
        } else if (age == 17) {
            System.out.println("Still one more year to go!");
        }else{
            System.out.println("Nothing is working out");
        }
        //Ternary Operators
        int productAmount = 3;
        String message = productAmount >=3 ? "CORRECT AMOUNT" : "INCORRECT AMOUNT";
        System.out.println(message);
    }
}
