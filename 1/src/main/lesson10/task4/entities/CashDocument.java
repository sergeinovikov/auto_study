package main.lesson10.task4.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CashDocument implements Generatable, Save {
    private final List<Double> nominals = new ArrayList<>();
    private final UUID uuid = UUID.randomUUID();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Property.SALARY_DATE_FORMAT);
    private final String documentDate = formatter.format((LocalDateTime.now().plusDays(1)));
    private SalaryDocument salaryDocument;
    private static int index = 0;

    @Override
    public CashDocument generate() {
        salaryDocument = new DocumentQueue().getSalaryDocumentFIFO();
        String[] nominals = Property.CASH_NOMINALS.split(",");
        for (String nominal : nominals) this.nominals.add(Double.parseDouble(nominal));
        return this;
    }

    public void save() throws IOException {
        System.out.println(this);
        File file = new File(Property.CASH_OUTPUT_FILE + "_" + index + ".txt");
        index++;
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(this));
        writer.flush();
        writer.close();
    }

    @Override
    public String toString() {
        Map<Double, Integer> nominalsResult = new TreeMap<>();
        Double totalSalaryAmount = salaryDocument.getTotalSalaryAmount();
        for (Double currentNominal : nominals) {
            int currentNominalAmount = (int) (totalSalaryAmount / currentNominal);
            nominalsResult.put(currentNominal, currentNominalAmount);
            totalSalaryAmount -= currentNominalAmount * currentNominal;
            totalSalaryAmount = DoubleHelper.round(totalSalaryAmount); //пришлось взять из готового материала ибо одну копейку всегда не досчитывал это просто какая-то жесть))
        }

        StringBuilder nominalsList = new StringBuilder();
        for (Map.Entry<Double, Integer> entry : nominalsResult.entrySet()) {
            nominalsList.append(entry.getKey()).append(" - ").append(entry.getValue()).append(" шт.%n");
        }

        return String.format(
                "Заявка на выдачу средств из кассы.%n" +
                        "uuid: " + uuid + "%n%n" +
                        "Обоснование: Зарплатная ведомость " + salaryDocument.getUuid() + "%n%n" +
                        "Время операции: " + documentDate + ".%n%n" +
                        "Сумма операции: " + "%.2f" + "%n" +
                        nominalsList.toString(), salaryDocument.getTotalSalaryAmount()
        );
    }
}
