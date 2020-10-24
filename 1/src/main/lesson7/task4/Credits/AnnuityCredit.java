package main.lesson7.task4.Credits;

import java.util.HashMap;
import java.util.Map;

public class AnnuityCredit extends BaseCredit {

    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public Map getMonthPayments() {
        Map<Integer, Double> monthlyPayments = new HashMap<>();
        double monthlyRate = rate / 100 / 12;
        double numerator = monthlyRate * Math.pow((1 + monthlyRate), duration);
        double denominator = Math.pow((1 + monthlyRate), duration) - 1;
        double monthlyPayment = amount * (numerator / denominator);
        for (int i = 0; i < duration; i++) {
            monthlyPayments.put(i + 1, monthlyPayment);
        }
        return monthlyPayments;
    }

    @Override
    public double calculateOverpayment() {
        return super.calculateOverpayment();
    }
}
