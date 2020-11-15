package main.lesson10.task4.entities;

import java.util.ArrayList;
import java.util.List;

public class DocumentQueue {
    private static List<SalaryDocument> payrollList = new ArrayList<>();

    public void add(SalaryDocument salaryDocument) {
        payrollList.add(salaryDocument);
    }

    public SalaryDocument getSalaryDocumentFIFO() {
        SalaryDocument salaryDocument = payrollList.get(0);
        payrollList.remove(0);
        return salaryDocument;
    }
}
