package main.lesson10.task4;

import main.lesson10.task4.entities.CashDocument;
import main.lesson10.task4.entities.SalaryDocument;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        int amountOfDocuments = 5;
        for (int i = 0; i < amountOfDocuments; i++) {
            SalaryDocument salaryDocument = new SalaryDocument().generate();
            salaryDocument.save();
        }


        for (int i = 0; i < amountOfDocuments; i++) {
            CashDocument cashDocument = new CashDocument().generate();
            cashDocument.save();
        }
    }
}
