package se.lexicon;

public class CalcProfit {


    /**
     * Calculates the profit of product.
     * @param costPerUnit - Price for making the product.
     * @param pricePerUnit - Price that i get for selling the product.
     * @param unitAmount - How many units i have i stock.
     * @return
     */
    public static int getProfit(int costPerUnit, int pricePerUnit, int unitAmount){
        return (pricePerUnit * unitAmount) - (costPerUnit * unitAmount);
    }

}
