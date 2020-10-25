package main.lesson8.task3.Terminals;

public abstract class Terminal implements TopUpBalance {
    protected String address;
    protected Owner owner;
    protected double commission;
    protected double amountWithoutCommission;

    public Terminal(String address) {
        this.address = address;
    }

    @Override
    public void TopUp(String phone, double amount) {
        double amountWithCommission;
        if (amount < amountWithoutCommission) {
            amountWithCommission = amount - ((amount / 100) * commission);
        } else {
            amountWithCommission = amount;
        }
        System.out.printf("Внесена сумма %.2f руб. для пополнения телефона %s. Баланс пополнен на сумму %.2f руб. С уважением, ваш %s, %s%n", amount, phone, amountWithCommission, owner.getDescriprion(), address);
    }
}
