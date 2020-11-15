package main.lesson10.task4.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SalaryDocument implements Generatable, Save {
    private final UUID uuid = UUID.randomUUID();
    private final List<Employee> employees = new ArrayList<>();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Property.SALARY_DATE_FORMAT);
    private final String documentDate = formatter.format((LocalDateTime.now().plusDays(1)));
    private static int index = 0;


    @Override
    public SalaryDocument generate() {
        for (int i = 0; i < Property.SALARY_EMPLOYEE_COUNT; i++) {
            employees.add(new Employee().generate());
        }
        new DocumentQueue().add(this);
        return this;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void save() throws IOException {
        System.out.println(this);
        File file = new File(Property.SALARY_OUTPUT_FILE + "_" + index + ".txt");
        index++;
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(this));
        writer.flush();
        writer.close();
    }

    public Double getTotalSalaryAmount() {
        Double totalSalaryAmount = 0d;
        for (Employee currentEmployee : employees)
            totalSalaryAmount += currentEmployee.getSalary();
        return totalSalaryAmount;
    }

    @Override
    public String toString() {
        StringBuilder employeeList = new StringBuilder();
        Double totalSalaryAmount = 0d;
        for (Employee currentEmployee : employees) {
            employeeList.append(currentEmployee.getFirstName())
                    .append(" ")
                    .append(currentEmployee.getLastName())
                    .append(", ")
                    .append(currentEmployee.getPassport().getSeries())
                    .append(" ")
                    .append(currentEmployee.getPassport().getNumber())
                    .append(", ")
                    .append(String.format("%.2f", currentEmployee.getSalary()))
                    .append(String.format("%n"));
            totalSalaryAmount += currentEmployee.getSalary();
        }
        return String.format(
                "Зарплатная ведомость.%n%n" +
                        "uuid: " + uuid + "%n%n" +
                        "Время операции: " + documentDate + ".%n%n" +
                        "Список сотрудников:%n" + employeeList.toString() +
                        "Общая сумма: " + "%.2f" + "%n%n", totalSalaryAmount
        );
    }
}
