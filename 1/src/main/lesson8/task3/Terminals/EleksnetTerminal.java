package main.lesson8.task3.Terminals;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        owner = Owner.ELEKSNET;
        commission = 11d;
        amountWithoutCommission = 300;
    }

    @Override
    public void TopUp(String phone, double amount) {
        super.TopUp(phone, amount);
    }
}
