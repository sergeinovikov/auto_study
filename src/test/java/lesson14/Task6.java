package lesson14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Task6 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsPropertyAmount() {
        assert persons != null;
        Long countPersonsProperty = persons.stream()
                .map(Person::getProperties)
                .filter(Objects::nonNull)
                .mapToLong(Collection::size)
                .sum();
        System.out.println(countPersonsProperty);
        Assertions.assertEquals(974, countPersonsProperty);

        Long countResidentialProperty = persons.stream()
                .map(Person::getProperties)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Жилая"))
                .count();
        System.out.println(countResidentialProperty);
        Assertions.assertEquals(497, countResidentialProperty);

        Long countNonResidentialProperty = persons.stream()
                .map(Person::getProperties)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Нежилая"))
                .count();
        System.out.println(countNonResidentialProperty);
        Assertions.assertEquals(477, countNonResidentialProperty);

        Assertions.assertEquals(countPersonsProperty, countResidentialProperty + countNonResidentialProperty);
    }
}