package lesson14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.helpers.PersonFilterHelper;
import main.lesson14.model.Person;
import main.lesson14.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void printPersonsNameAndTotalPropertyCost() {
        assert persons != null;
        List<Person> filteredPersons = PersonFilterHelper.getFilteredPersons(persons);
        List<String> personsNameAndTotalPropertyCost = new ArrayList<>();


        filteredPersons.stream()
                .sorted((s1, s2) -> {
                            Double sum1 = s1.getProperties().stream().mapToDouble(Property::getPrice).sum();
                            Double sum2 = s2.getProperties().stream().mapToDouble(Property::getPrice).sum();
                            return sum2.compareTo(sum1);
                        }
                )
                .forEach(person -> {
                            String sortedByTotalPropertyCost = String.format("ФИО: %s %s %s, Суммарная стоимость недвижимости: %.2f",
                                    person.getLastName(),
                                    person.getFirstName(),
                                    person.getPatronymic(),
                                    person.getProperties().stream()
                                            .mapToDouble(Property::getPrice)
                                            .sum()
                            );
                            System.out.println(sortedByTotalPropertyCost);
                            personsNameAndTotalPropertyCost.add(sortedByTotalPropertyCost);
                        }
                );

        Assertions.assertEquals(20, personsNameAndTotalPropertyCost.size());
        Assertions.assertEquals("ФИО: Богданов Алексей Алексеевич, Суммарная стоимость недвижимости: 26646072,56", personsNameAndTotalPropertyCost.get(0));
        Assertions.assertEquals("ФИО: Горбунов Петр Васильевич, Суммарная стоимость недвижимости: 26292727,25", personsNameAndTotalPropertyCost.get(1));
        Assertions.assertEquals("ФИО: Ефименко Сергей Григорьевич, Суммарная стоимость недвижимости: 26257760,66", personsNameAndTotalPropertyCost.get(2));
        Assertions.assertEquals("ФИО: Ефименко Михаил Алексеевич, Суммарная стоимость недвижимости: 25952723,09", personsNameAndTotalPropertyCost.get(3));
        Assertions.assertEquals("ФИО: Кузнецов Алексей Петрович, Суммарная стоимость недвижимости: 25516943,28", personsNameAndTotalPropertyCost.get(4));
        Assertions.assertEquals("ФИО: Кузьмин Григорий Иванович, Суммарная стоимость недвижимости: 25317657,47", personsNameAndTotalPropertyCost.get(5));
        Assertions.assertEquals("ФИО: Кузнецов Алексей Александрович, Суммарная стоимость недвижимости: 25234139,61", personsNameAndTotalPropertyCost.get(6));
        Assertions.assertEquals("ФИО: Богданов Василий Сергеевич, Суммарная стоимость недвижимости: 25063710,41", personsNameAndTotalPropertyCost.get(7));
        Assertions.assertEquals("ФИО: Петров Григорий Михайлович, Суммарная стоимость недвижимости: 24647647,92", personsNameAndTotalPropertyCost.get(8));
        Assertions.assertEquals("ФИО: Петров Иван Сергеевич, Суммарная стоимость недвижимости: 24256529,49", personsNameAndTotalPropertyCost.get(9));
        Assertions.assertEquals("ФИО: Иванов Алексей Александрович, Суммарная стоимость недвижимости: 24219898,46", personsNameAndTotalPropertyCost.get(10));
        Assertions.assertEquals("ФИО: Казанцев Василий Григорьевич, Суммарная стоимость недвижимости: 23807429,86", personsNameAndTotalPropertyCost.get(11));
        Assertions.assertEquals("ФИО: Сидоров Григорий Алексеевич, Суммарная стоимость недвижимости: 23470969,75", personsNameAndTotalPropertyCost.get(12));
        Assertions.assertEquals("ФИО: Воронцов Иван Александрович, Суммарная стоимость недвижимости: 23348121,14", personsNameAndTotalPropertyCost.get(13));
        Assertions.assertEquals("ФИО: Крайнов Григорий Михайлович, Суммарная стоимость недвижимости: 23099540,56", personsNameAndTotalPropertyCost.get(14));
        Assertions.assertEquals("ФИО: Петров Иван Михайлович, Суммарная стоимость недвижимости: 22505432,22", personsNameAndTotalPropertyCost.get(15));
        Assertions.assertEquals("ФИО: Богданов Олег Георгиевич, Суммарная стоимость недвижимости: 22311448,78", personsNameAndTotalPropertyCost.get(16));
        Assertions.assertEquals("ФИО: Богданов Александр Алексеевич, Суммарная стоимость недвижимости: 21630551,51", personsNameAndTotalPropertyCost.get(17));
        Assertions.assertEquals("ФИО: Крайнов Иван Григорьевич, Суммарная стоимость недвижимости: 20726383,65", personsNameAndTotalPropertyCost.get(18));
        Assertions.assertEquals("ФИО: Кузьмин Петр Георгиевич, Суммарная стоимость недвижимости: 20093703,33", personsNameAndTotalPropertyCost.get(19));
    }
}