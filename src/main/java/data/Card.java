package data;

public abstract class Card {                     // класс это описание структуры данных

    public String cardHolder;
    public int balance;
    public String cardNumber;
    public PaymentSystem paymentSystem;

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem; //возвращает объект класса PaymentSystem
    }

    public abstract void payInCountry(Country country, int amount);
}
