package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class Task2 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsWithPassportSeriesStartsWithDoubleZeroDesc() {
        assert persons != null;
        Long personsAmount = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .sorted((person1, person2) -> person2.getPassport().getNumber().compareTo(person1.getPassport().getNumber()))
                .peek(person -> System.out.printf("%s %s %s %s %s %n", person.getLastName(), person.getFirstName(), person.getPatronymic(), person.getPassport().getSeries(), person.getPassport().getNumber()))
                .count();
        Assertions.assertEquals(6, personsAmount);
    }

    @Test
    public void personWithEqualLast4DigitsInPassport() {
        assert persons != null;
        Person personWithEqualDigitsInPassport = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getNumber().substring(person.getPassport().getNumber().length() - 4).equals(person.getPassport().getSeries()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        System.out.printf("%s %s %s %s %s %n", personWithEqualDigitsInPassport.getLastName(), personWithEqualDigitsInPassport.getFirstName(), personWithEqualDigitsInPassport.getPatronymic(), personWithEqualDigitsInPassport.getPassport().getSeries(), personWithEqualDigitsInPassport.getPassport().getNumber());
        Assertions.assertEquals("Иванов", personWithEqualDigitsInPassport.getLastName());
        Assertions.assertEquals("Алексей", personWithEqualDigitsInPassport.getFirstName());
        Assertions.assertEquals("Алексеевич", personWithEqualDigitsInPassport.getPatronymic());
        Assertions.assertEquals("6483", personWithEqualDigitsInPassport.getPassport().getSeries());
        Assertions.assertEquals("086483", personWithEqualDigitsInPassport.getPassport().getNumber());
    }
}
