import java.util.Arrays;

public class Methods {

  /*  public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D','D','D',};
        int countLetter = countDemonstration(letters, 'C');
        System.out.println("count = " + countLetter);
        
    }
    public static int countDemonstration(char[] letters, char searchLetter){
        int count = 0;
        for (int letter:letters){
            if (letter == searchLetter){
                count ++;
            }
        }

        return count;
    }*/

    public static void main(String[] args) {
        String [] arrayLists = {"Arash", "Arash", "Arash", "Ali","Ali","Ali","Ali"};
        int countElement = arrayListCount(arrayLists, "A");
        System.out.println("countElement = " + countElement);

    }
    public static int arrayListCount(String[] arrayLists, String searchElement ){
        int count = 0;
        for(String arrayList : arrayLists){
            if(arrayList == searchElement){
                count ++;
            }
        }
        return count;
    }
}
