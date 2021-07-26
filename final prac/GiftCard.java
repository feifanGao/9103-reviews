import java.util.*;

public class GiftCard {
    private double amount;

    public GiftCard(double amount) {
        this.amount = amount;
    }
    public void buyBook(double totalPrice) {
        if(amount>=totalPrice){
            amount=amount - totalPrice;
            System.out.println("Books bought successfully");
        }else{
            System.out.println("Card credit is insufficient");
        }
    }

    public double amountRemaining(){
        return amount;
    }
    public static void main(String[] args) {
        GiftCard a = new GiftCard(100);
        a.buyBook(90);
        a.buyBook(90);
    }
}
