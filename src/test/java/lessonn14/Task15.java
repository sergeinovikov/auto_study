package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.helpers.PersonFilterHelper;
import main.lesson14.model.Person;
import main.lesson14.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void printPersonsFullNameAndPropertyWithPrice() {
        assert persons != null;
        List<Person> filteredPersons = PersonFilterHelper.getFilteredPersons(persons);
        List<String> personsWithSortedProperty = new ArrayList<>();

        filteredPersons.stream()
                .sorted((person1, person2) -> {
                            if (!person1.getLastName().equals(person2.getLastName())) {
                                return person1.getLastName().compareTo(person2.getLastName());
                            }
                            if (!person1.getFirstName().equals(person2.getFirstName())) {
                                return person1.getFirstName().compareTo(person2.getFirstName());
                            }
                            return person1.getPatronymic().compareTo(person2.getPatronymic());
                        }
                )
                .forEach(person -> {
                            String filteredByFullName = String.format("ФИО: %s %s %s, Паспорт: %s %s",
                                    person.getLastName(),
                                    person.getFirstName(),
                                    person.getPatronymic(),
                                    person.getPassport().getSeries(),
                                    person.getPassport().getNumber());

                            StringBuilder sortedPersonWithSortedProperty = new StringBuilder().append(filteredByFullName);

                            List<Property> sortedPersonProperty = person.getProperties().stream()
                                    .sorted(Comparator.comparing(Property::getPrice))
                                    .collect(Collectors.toList());

                            for (Property currentProperty : sortedPersonProperty) {
                                String propertyInfoWithPrice = String.format("\t" + "Недвижимость объект %d: %s, %.2f",
                                        sortedPersonProperty.indexOf(currentProperty) + 1,
                                        currentProperty.getAddress(),
                                        currentProperty.getPrice()
                                );

                                sortedPersonWithSortedProperty.append("\n").append(propertyInfoWithPrice);
                            }

                            personsWithSortedProperty.add(sortedPersonWithSortedProperty.toString());
                            System.out.println(sortedPersonWithSortedProperty.toString());
                        }
                );

        Assertions.assertEquals(20, personsWithSortedProperty.size());
        Assertions.assertEquals("ФИО: Богданов Александр Алексеевич, Паспорт: 7467 904580\n" +
                        "\tНедвижимость объект 1: г. Москва, ул. Палехская, д. 27, кв. 182, 4380113,98\n" +
                        "\tНедвижимость объект 2: г. Москва, ул. Михайлова, д. 73, кв. 216, 7558104,05\n" +
                        "\tНедвижимость объект 3: г. Москва, ул. Бакунинская, д. 28, кв. 67, 9692333,48",
                personsWithSortedProperty.get(0));
        Assertions.assertEquals("ФИО: Богданов Алексей Алексеевич, Паспорт: 4876 716276\n" +
                        "\tНедвижимость объект 1: г. Москва, ул. Щукинская, д. 49, кв. 282, 7171672,86\n" +
                        "\tНедвижимость объект 2: г. Москва, ул. Докукина, д. 47, кв. 314, 9581112,85\n" +
                        "\tНедвижимость объект 3: г. Москва, ул. Палехская, д. 96, кв. 125, 9893286,85",
                personsWithSortedProperty.get(1));
        Assertions.assertEquals("ФИО: Богданов Василий Сергеевич, Паспорт: 7959 597500\n" +
                        "\tНедвижимость объект 1: г. Москва, ул. Кантемировская, д. 42, кв. 165, 5569751,40\n" +
                        "\tНедвижимость объект 2: г. Москва, ул. Кантемировская, д. 38, кв. 217, 9612363,09\n" +
                        "\tНедвижимость объект 3: г. Москва, ул. Щукинская, д. 66, кв. 389, 9881595,92",
                personsWithSortedProperty.get(2));
        Assertions.assertEquals("ФИО: Петров Иван Сергеевич, Паспорт: 9782 643023\n" +
                        "\tНедвижимость объект 1: г. Москва, ул. Докукина, д. 93, кв. 232, 7070398,94\n" +
                        "\tНедвижимость объект 2: г. Москва, ул. Поддубная, д. 97, кв. 173, 8116844,92\n" +
                        "\tНедвижимость объект 3: г. Москва, ул. Поддубная, д. 85, кв. 366, 9069285,63",
                personsWithSortedProperty.get(18));
        Assertions.assertEquals("ФИО: Сидоров Григорий Алексеевич, Паспорт: 0399 389537\n" +
                        "\tНедвижимость объект 1: г. Москва, ул. Кантемировская, д. 50, кв. 240, 6667843,71\n" +
                        "\tНедвижимость объект 2: г. Москва, ул. Каширская, д. 45, кв. 251, 6872657,20\n" +
                        "\tНедвижимость объект 3: г. Москва, ул. Щукинская, д. 57, кв. 73, 9930468,84",
                personsWithSortedProperty.get(19));
    }
}