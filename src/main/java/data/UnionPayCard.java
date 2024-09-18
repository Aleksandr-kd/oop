package data;


public class UnionPayCard extends Card{
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }
}
