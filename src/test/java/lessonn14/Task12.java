package lessonn14;

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
                            System.out.printf("ФИО:%s %s %s, Суммарная стоимость недвижимости: %.2f%n",
                                    person.getLastName(),
                                    person.getFirstName(),
                                    person.getPatronymic(),
                                    person.getProperties().stream()
                                            .mapToDouble(Property::getPrice)
                                            .sum()
                            );
                            String fullName = person.getLastName() + " " + person.getFirstName() + " " + person.getPatronymic();
                            personsNameAndTotalPropertyCost.add(
                                    fullName + " " + String.format("%.2f",
                                            person.getProperties().stream()
                                                    .mapToDouble(Property::getPrice)
                                                    .sum())
                            );
                        }
                );

        Assertions.assertEquals(20, personsNameAndTotalPropertyCost.size());
        Assertions.assertEquals("Богданов Алексей Алексеевич 26646072,56", personsNameAndTotalPropertyCost.get(0));
        Assertions.assertEquals("Горбунов Петр Васильевич 26292727,25", personsNameAndTotalPropertyCost.get(1));
        Assertions.assertEquals("Ефименко Сергей Григорьевич 26257760,66", personsNameAndTotalPropertyCost.get(2));
        Assertions.assertEquals("Ефименко Михаил Алексеевич 25952723,09", personsNameAndTotalPropertyCost.get(3));
        Assertions.assertEquals("Кузнецов Алексей Петрович 25516943,28", personsNameAndTotalPropertyCost.get(4));
        Assertions.assertEquals("Кузьмин Григорий Иванович 25317657,47", personsNameAndTotalPropertyCost.get(5));
        Assertions.assertEquals("Кузнецов Алексей Александрович 25234139,61", personsNameAndTotalPropertyCost.get(6));
        Assertions.assertEquals("Богданов Василий Сергеевич 25063710,41", personsNameAndTotalPropertyCost.get(7));
        Assertions.assertEquals("Петров Григорий Михайлович 24647647,92", personsNameAndTotalPropertyCost.get(8));
        Assertions.assertEquals("Петров Иван Сергеевич 24256529,49", personsNameAndTotalPropertyCost.get(9));
        Assertions.assertEquals("Иванов Алексей Александрович 24219898,46", personsNameAndTotalPropertyCost.get(10));
        Assertions.assertEquals("Казанцев Василий Григорьевич 23807429,86", personsNameAndTotalPropertyCost.get(11));
        Assertions.assertEquals("Сидоров Григорий Алексеевич 23470969,75", personsNameAndTotalPropertyCost.get(12));
        Assertions.assertEquals("Воронцов Иван Александрович 23348121,14", personsNameAndTotalPropertyCost.get(13));
        Assertions.assertEquals("Крайнов Григорий Михайлович 23099540,56", personsNameAndTotalPropertyCost.get(14));
        Assertions.assertEquals("Петров Иван Михайлович 22505432,22", personsNameAndTotalPropertyCost.get(15));
        Assertions.assertEquals("Богданов Олег Георгиевич 22311448,78", personsNameAndTotalPropertyCost.get(16));
        Assertions.assertEquals("Богданов Александр Алексеевич 21630551,51", personsNameAndTotalPropertyCost.get(17));
        Assertions.assertEquals("Крайнов Иван Григорьевич 20726383,65", personsNameAndTotalPropertyCost.get(18));
        Assertions.assertEquals("Кузьмин Петр Георгиевич 20093703,33", personsNameAndTotalPropertyCost.get(19));
    }
}