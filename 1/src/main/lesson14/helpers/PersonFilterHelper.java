package main.lesson14.helpers;

import main.lesson14.model.Person;
import main.lesson14.model.Property;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterHelper {

    public static List<Person> getFilteredPersons(List<Person> persons) {
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getCards().size() == 3)
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(Property::getPrice)
                        .reduce(Double::sum)
                        .get() > 20_000_000d
                )
                .collect(Collectors.toList());
        if (filteredPersons.size() == 20) {
            return filteredPersons;
        }
        throw new RuntimeException("Количество отфильтрованных людей не равняется 20");
    }
}
