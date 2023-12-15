import java.time.LocalDate;

public class PassportClass {
    public static void main(String[] args) {
        Passport internationPassport = new Passport("USA", "0P498333", "Arash", LocalDate.of(2025, 2,3));
        System.out.println(internationPassport.country);
        System.out.println(internationPassport.passportNumber);
        System.out.println(internationPassport.name);
        System.out.println(internationPassport.expireDate);
    }
    static class Passport{
        String country;
        String passportNumber;
        String name;
        LocalDate expireDate;
        Passport(String country, String passportNumber, String name, LocalDate expireDate){
            this.country = country;
            this.passportNumber = passportNumber;
            this.name = name;
            this.expireDate = expireDate;
        }
    }
}
