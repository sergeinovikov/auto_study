package main.lesson4.task3.workers;

import java.util.Arrays;

public class ServiceDesk {
    public static int ticketNumber = 0;

    public static void createTicket(String description) {
        String[] accountant = {"справк", "отчет", "бюджет"};
        String[] logician = {"доставк", "курьер"};
        String[] sysAdmin = {"компьютер", "принтер", "сервер"};
        String[] cleaner = {"уборк"};

        //после решения задачи я посмотрел готовый ответ и не стал менять своё решение,
        // т.к. думаю, что легче стереть окончание у слова в массиве, чем подбирать для него регулярные выражения
        // (менее затратно по времени), но суть понял

        if (Arrays.stream(accountant).anyMatch(description::contains)) {
            System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
            Accountant.takeTicket(ticketNumber);
        } else if (Arrays.stream(logician).anyMatch(description::contains)) {
            System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
            Logistician.takeTicket(ticketNumber);
        } else if (Arrays.stream(sysAdmin).anyMatch(description::contains)) {
            System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
            SysAdmin.takeTicket(ticketNumber);
        } else if (Arrays.stream(cleaner).anyMatch(description::contains)) {
            System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
            Cleaner.takeTicket(ticketNumber);
        } else {
            System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
            System.out.printf("Специалист по выполнению заявки %d не найден%n", ticketNumber);
        }
    }
}
