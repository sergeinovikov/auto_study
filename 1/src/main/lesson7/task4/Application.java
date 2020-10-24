package main.lesson7.task4;

import main.lesson7.task4.Credits.AnnuityCredit;
import main.lesson7.task4.Credits.BaseCredit;
import main.lesson7.task4.Credits.DifferentiateCredit;


public class Application {
    public static void main(String[] args) {
        BaseCredit baseCredit = new BaseCredit(300_000d, 16.9d, 12);
        BaseCredit differentiateCredit = new DifferentiateCredit(300_000d, 16.9d, 12);
        BaseCredit annuityCredit = new AnnuityCredit(300_000d, 16.9d, 12);

        System.out.printf("Список ежемесячных платежей:%n");
        for (int i = 1; i < baseCredit.getMonthPayments().size() + 1; i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i, baseCredit.getMonthPayments().get(i), differentiateCredit.getMonthPayments().get(i), annuityCredit.getMonthPayments().get(i));
        }

        System.out.printf("%n%nПереплата по типам кредита:%n");
        System.out.printf("%.2f   %.2f   %.2f", baseCredit.calculateOverpayment(), differentiateCredit.calculateOverpayment(), annuityCredit.calculateOverpayment());
    }
}
