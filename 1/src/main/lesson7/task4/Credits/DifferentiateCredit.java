package main.lesson7.task4.Credits;

import java.util.HashMap;
import java.util.Map;

public class DifferentiateCredit extends BaseCredit {

    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public Map getMonthPayments() {
        Map<Integer, Double> monthlyPayments = new HashMap<>();
        double currentAmount = amount;
        for (int i = 0; i < duration; i++) {
            double percentPayment = currentAmount * rate / 100 / 12;
            double currentPayment = amount / duration + percentPayment;
            currentAmount -= (currentPayment - percentPayment);
            monthlyPayments.put(i + 1, currentPayment);
        }
        return monthlyPayments;
    }

    @Override
    public double calculateOverpayment() {
        return super.calculateOverpayment();
    }
}
