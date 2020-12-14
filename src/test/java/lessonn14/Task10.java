package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Account;
import main.lesson14.model.Person;
import main.lesson14.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task10 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void accountsAndPropertiesTotalSummary() {
        assert persons != null;
        Double depositsSummary = persons.stream()
                .map(Person::getAccounts)
                .filter(accounts -> !accounts.isEmpty())
                .flatMap(Collection::stream)
                .mapToDouble(Account::getAccountBalance)
                .sum();
        System.out.printf("%.2f%n", depositsSummary);
        Assertions.assertEquals("4853951057,95", String.format("%.2f",depositsSummary));

        Double propertySummary = persons.stream()
                .map(Person::getProperties)
                .filter(properties -> !properties.isEmpty())
                .flatMap(Collection::stream)
                .mapToDouble(Property::getPrice)
                .sum();
        System.out.printf("%.2f%n", propertySummary);
        Assertions.assertEquals("6833226748,86", String.format("%.2f",propertySummary));
    }
}
