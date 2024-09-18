package data;


public class MirCard extends Card{
    public MirCard() {
        super(PaymentSystem.MIR);
    }

    @Override
    public  void payInCountry(Country country, int amount) {

    }
}
