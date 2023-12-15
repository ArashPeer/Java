package Method_Overriding;

public class Corolla extends Highlander {
    public void corollaLovely(){
        System.out.println("ahahaha");
    }

    int amountTier = 4;
    public void speed(){
        System.out.println("220-mph");
    }

    public int getSetAmountTier(){
        return amountTier;
    }
}
