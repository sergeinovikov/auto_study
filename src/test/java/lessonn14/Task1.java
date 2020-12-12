package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task1 {
    private List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsWithoutPassportWith3Properties() {
        Long personsAmount = persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getProperties().length == 3)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(3, personsAmount);
    }

    @Test
    public void vasilevWithAccountsNotEqualCardAmount() {
        Long personsAmount = persons.stream()
                .filter(person -> person.getLastName().equals("Васильев"))
                .filter(person -> person.getAccounts().length != person.getCards().length)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, personsAmount);
    }

    @Test
    public void fivePersonsWithPassportSeriesStartsWithDoubleZero() {
        Long personsAmount = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(5, personsAmount);

    }
}
