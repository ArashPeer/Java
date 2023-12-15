public class LogicalOperators {

    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = false;
        boolean isOldMan = false;
        System.out.println(isAdult && isStudent);
        System.out.println((isAdult || isStudent) && isOldMan);
        System.out.println((!isAdult || isStudent) && !isOldMan);
        String personName = "Mohammad";
        System.out.println((10 > 4 || 3 >5) && personName.contains("M") && !isAdult);
    }
}
