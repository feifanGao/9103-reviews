public class BulkDiscount extend DiscountPolicy {
    private int mini;
    private double percent;
    public BulkDiscount(int mini, double percent) { 
        this.mini = mini;
        this.percent = percent;
    }

    public computeDiscount(int numberOfItems, int PerItemPrice) {
        double total =numberOfItems*PerItemPrice;
        if(numberOfItems>mini){
            total -= (percent*total)/100;
        }
        return total;
    }
}
