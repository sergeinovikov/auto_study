package main.lesson7.task4.Credits;

import java.util.*;

public class BaseCredit {
    protected double amount;
    protected double rate;
    protected int duration;

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public Map getMonthPayments() {
        Map<Integer, Double> monthlyPayments = new HashMap<>();
        for (int i = 0; i < this.duration; i++) {
            double monthlyPayment = this.amount / this.duration;
            monthlyPayments.put(i + 1, monthlyPayment);
        }
        return monthlyPayments;
    }

    public double calculateOverpayment() {
        double difference = this.amount;
        for (Object monthPayment : getMonthPayments().values()) {
            difference -= (double) monthPayment;
        }
        if (difference < 0) {
            difference *= -1;
        }
        return difference;
    }
}
