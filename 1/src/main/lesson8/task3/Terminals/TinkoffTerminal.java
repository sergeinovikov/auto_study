package main.lesson8.task3.Terminals;

public class TinkoffTerminal extends Terminal {

    public TinkoffTerminal(String address) {
        super(address);
        owner = Owner.TINKOFF;
        commission = 9d;
        amountWithoutCommission = 600;
    }

    @Override
    public void TopUp(String phone, double amount) {
        if (amount < 100d) {
            double difference = 100d - amount;
            System.out.printf("Вы внесли %.2f руб. В терминале Тинькофф минимальная сумма для пополнения 100 руб. Внесите дополнительно как минимум %.2f руб.%n", amount, difference);
        } else {
            super.TopUp(phone, amount);
        }
    }
}
