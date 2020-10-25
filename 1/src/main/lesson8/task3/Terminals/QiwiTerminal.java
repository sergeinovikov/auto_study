package main.lesson8.task3.Terminals;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String address) {
        super(address);
        owner = Owner.QIWI;
        commission = 7d;
        amountWithoutCommission = 1000;
    }

    @Override
    public void TopUp(String phone, double amount) {
        super.TopUp(phone, amount);
    }
}
