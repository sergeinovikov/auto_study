package lesson14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.helpers.PersonFilterHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void printPersonsNamePassportAndPropertyAmount() {
        assert persons != null;
        List<Person> filteredPersons = PersonFilterHelper.getFilteredPersons(persons);
        List<String> sortedBySeriesPersons = new ArrayList<>();

        filteredPersons.stream()
                .sorted((person1, person2) -> {
                            if (!person1.getPassport().getSeries().equals(person2.getPassport().getSeries())) {
                                return person1.getPassport().getSeries().compareTo(person2.getPassport().getSeries());
                            } else {
                                return person1.getPassport().getNumber().compareTo(person2.getPassport().getNumber());
                            }
                        }
                )
                .forEach(person -> {
                            String sortedBySeriesPerson = String.format("ФИО: %s %s %s, Паспорт: %s %s, Количество объектов недвижимости: %d",
                                    person.getLastName(),
                                    person.getFirstName(),
                                    person.getPatronymic(),
                                    person.getPassport().getSeries(),
                                    person.getPassport().getNumber(),
                                    person.getProperties().size()
                            );
                            System.out.println(sortedBySeriesPerson);
                            sortedBySeriesPersons.add(sortedBySeriesPerson);
                        }
                );

        Assertions.assertEquals(20, sortedBySeriesPersons.size());
        Assertions.assertEquals("ФИО: Сидоров Григорий Алексеевич, Паспорт: 0399 389537, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(0));
        Assertions.assertEquals("ФИО: Ефименко Сергей Григорьевич, Паспорт: 0865 228190, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(1));
        Assertions.assertEquals("ФИО: Ефименко Михаил Алексеевич, Паспорт: 0922 330624, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(2));
        Assertions.assertEquals("ФИО: Петров Иван Михайлович, Паспорт: 1207 579726, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(3));
        Assertions.assertEquals("ФИО: Казанцев Василий Григорьевич, Паспорт: 2283 507091, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(4));
        Assertions.assertEquals("ФИО: Петров Григорий Михайлович, Паспорт: 2341 892962, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(5));
        Assertions.assertEquals("ФИО: Крайнов Иван Григорьевич, Паспорт: 2790 234167, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(6));
        Assertions.assertEquals("ФИО: Крайнов Григорий Михайлович, Паспорт: 3104 469253, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(7));
        Assertions.assertEquals("ФИО: Кузнецов Алексей Александрович, Паспорт: 3502 598540, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(8));
        Assertions.assertEquals("ФИО: Кузьмин Петр Георгиевич, Паспорт: 3621 131892, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(9));
        Assertions.assertEquals("ФИО: Богданов Алексей Алексеевич, Паспорт: 4876 716276, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(10));
        Assertions.assertEquals("ФИО: Воронцов Иван Александрович, Паспорт: 6783 013061, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(11));
        Assertions.assertEquals("ФИО: Кузьмин Григорий Иванович, Паспорт: 6842 314376, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(12));
        Assertions.assertEquals("ФИО: Богданов Александр Алексеевич, Паспорт: 7467 904580, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(13));
        Assertions.assertEquals("ФИО: Богданов Василий Сергеевич, Паспорт: 7959 597500, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(14));
        Assertions.assertEquals("ФИО: Иванов Алексей Александрович, Паспорт: 8512 121998, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(15));
        Assertions.assertEquals("ФИО: Кузнецов Алексей Петрович, Паспорт: 8512 681073, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(16));
        Assertions.assertEquals("ФИО: Горбунов Петр Васильевич, Паспорт: 8799 664769, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(17));
        Assertions.assertEquals("ФИО: Богданов Олег Георгиевич, Паспорт: 9265 607005, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(18));
        Assertions.assertEquals("ФИО: Петров Иван Сергеевич, Паспорт: 9782 643023, Количество объектов недвижимости: 3", sortedBySeriesPersons.get(19));
    }
}
