package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.helpers.PersonFilterHelper;
import main.lesson14.model.Person;
import main.lesson14.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task11 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void accountsAndPropertiesTotalSummary() {
        assert persons != null;
        List<Person> filteredPersons = PersonFilterHelper.getFilteredPersons(persons);
        System.out.println(filteredPersons.size());

        Assertions.assertEquals(20, filteredPersons.size());

        Long countPersonsWithoutPassport = filteredPersons.stream()
                .filter(person -> person.getPassport() == null)
                .count();
        Assertions.assertEquals(0, countPersonsWithoutPassport);

        Long countPersonsWithLessThan3Cards = filteredPersons.stream()
                .filter(person -> person.getCards().size() < 3)
                .count();
        Assertions.assertEquals(0, countPersonsWithLessThan3Cards);

        Long countPersonsWithoutProperty = filteredPersons.stream()
                .filter(person -> person.getProperties().isEmpty())
                .count();
        Assertions.assertEquals(0, countPersonsWithoutProperty);

        Long countPersonsWithPropertyCostLessThan20000k = filteredPersons.stream()
                .filter(person -> person.getProperties().stream()
                        .map(Property::getPrice)
                        .reduce(Double::sum)
                        .get() < 20_000_000d
                )
                .count();
        Assertions.assertEquals(0, countPersonsWithPropertyCostLessThan20000k);
    }
}
