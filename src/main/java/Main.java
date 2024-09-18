import data.Card;
import data.VisaCard;

public class Main {
    public static void main(String[] args) {
        Card visaCard = new VisaCard();
        visaCard.balance = 100;
        System.out.println(visaCard .getPaymentSystem());
    }
}