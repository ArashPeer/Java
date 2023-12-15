public class SwitchStatement {

    public static void main(String[] args) {
        String gender = "male".toUpperCase();
        switch (gender){
            case "FEMALE":
                System.out.println("IAM A FEMALE");
                break;
            case "MALE":
                System.out.println("IAM A MALE");
                break;
            case "NOT PREFER TO SAY":
                System.out.println("IAM NOT PREFER TO SAY");
            default:
                System.out.println("NOT A VALID ENTRY");
        }
    }
}
