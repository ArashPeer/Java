public class WhileLoop {
//while loop? allows us to loop while the boolean expression evaluates to true
    public static void main(String[] args) {
        int [] numeric = {11,22,12,3,4,6,34,65};
        int numb = 0;
        while (numb < numeric.length){
            System.out.println("numb " + numb + "::" + numeric[numb]);
            numb = numb + 1;


        }
    }
}
