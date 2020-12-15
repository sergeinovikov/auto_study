package lesson14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.helpers.PersonFilterHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task14 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void printPersonsFullNameAndPassport() {
        assert persons != null;
        List<Person> filteredPersons = PersonFilterHelper.getFilteredPersons(persons);
        List<String> sortedByPassportIssueDatePersons = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        filteredPersons.stream()
                .sorted((person1, person2) -> {
                            try {
                                Date person1IssueDate = sdf.parse(person1.getPassport().getIssueDate());
                                Date person2IssueDate = sdf.parse(person2.getPassport().getIssueDate());
                                return person1IssueDate.compareTo(person2IssueDate);
                            } catch (ParseException exception) {
                                throw new RuntimeException();
                            }
                        }
                )
                .forEach(person -> {
                            String sortedByIssueDatePerson = String.format("ФИО: %s %s %s, Паспорт: %s %s, Выдан: %s %s",
                                    person.getLastName(),
                                    person.getFirstName(),
                                    person.getPatronymic(),
                                    person.getPassport().getSeries(),
                                    person.getPassport().getNumber(),
                                    person.getPassport().getIssueDate(),
                                    person.getPassport().getIssuer()
                            );
                            System.out.println(sortedByIssueDatePerson);
                            sortedByPassportIssueDatePersons.add(sortedByIssueDatePerson);
                        }
                );

        Assertions.assertEquals(20, sortedByPassportIssueDatePersons.size());
        Assertions.assertEquals("ФИО: Кузнецов Алексей Петрович, Паспорт: 8512 681073, Выдан: 02.03.1980 Отделом УФМС по улице Кантемировская", sortedByPassportIssueDatePersons.get(0));
        Assertions.assertEquals("ФИО: Кузнецов Алексей Александрович, Паспорт: 3502 598540, Выдан: 10.11.1981 Отделом УФМС по улице Кантемировская", sortedByPassportIssueDatePersons.get(1));
        Assertions.assertEquals("ФИО: Воронцов Иван Александрович, Паспорт: 6783 013061, Выдан: 02.02.1982 Отделом УФМС по улице Изумрудная", sortedByPassportIssueDatePersons.get(2));
        Assertions.assertEquals("ФИО: Ефименко Михаил Алексеевич, Паспорт: 0922 330624, Выдан: 29.02.1984 Отделом УФМС по улице Михайлова", sortedByPassportIssueDatePersons.get(3));
        Assertions.assertEquals("ФИО: Казанцев Василий Григорьевич, Паспорт: 2283 507091, Выдан: 15.09.1985 Отделом УФМС по улице Палехская", sortedByPassportIssueDatePersons.get(4));
        Assertions.assertEquals("ФИО: Иванов Алексей Александрович, Паспорт: 8512 121998, Выдан: 21.01.1987 Отделом УФМС по улице Бакунинская", sortedByPassportIssueDatePersons.get(5));
        Assertions.assertEquals("ФИО: Богданов Василий Сергеевич, Паспорт: 7959 597500, Выдан: 22.03.1987 Отделом УФМС по улице Изумрудная", sortedByPassportIssueDatePersons.get(6));
        Assertions.assertEquals("ФИО: Крайнов Григорий Михайлович, Паспорт: 3104 469253, Выдан: 17.12.1987 Отделом УФМС по улице Проходчиков", sortedByPassportIssueDatePersons.get(7));
        Assertions.assertEquals("ФИО: Ефименко Сергей Григорьевич, Паспорт: 0865 228190, Выдан: 17.02.1989 Отделом УФМС по улице Поддубная", sortedByPassportIssueDatePersons.get(8));
        Assertions.assertEquals("ФИО: Петров Иван Сергеевич, Паспорт: 9782 643023, Выдан: 13.04.1992 Отделом УФМС по улице Докукина", sortedByPassportIssueDatePersons.get(9));
        Assertions.assertEquals("ФИО: Богданов Александр Алексеевич, Паспорт: 7467 904580, Выдан: 24.05.1992 Отделом УФМС по улице Кантемировская", sortedByPassportIssueDatePersons.get(10));
        Assertions.assertEquals("ФИО: Петров Григорий Михайлович, Паспорт: 2341 892962, Выдан: 02.07.1993 Отделом УФМС по улице Первомайская", sortedByPassportIssueDatePersons.get(11));
        Assertions.assertEquals("ФИО: Крайнов Иван Григорьевич, Паспорт: 2790 234167, Выдан: 11.08.1993 Отделом УФМС по улице Партизанская", sortedByPassportIssueDatePersons.get(12));
        Assertions.assertEquals("ФИО: Сидоров Григорий Алексеевич, Паспорт: 0399 389537, Выдан: 16.05.1996 Отделом УФМС по улице Бакунинская", sortedByPassportIssueDatePersons.get(13));
        Assertions.assertEquals("ФИО: Кузьмин Петр Георгиевич, Паспорт: 3621 131892, Выдан: 31.10.1996 Отделом УФМС по улице Норильская", sortedByPassportIssueDatePersons.get(14));
        Assertions.assertEquals("ФИО: Горбунов Петр Васильевич, Паспорт: 8799 664769, Выдан: 01.03.1997 Отделом УФМС по улице Каширская", sortedByPassportIssueDatePersons.get(15));
        Assertions.assertEquals("ФИО: Кузьмин Григорий Иванович, Паспорт: 6842 314376, Выдан: 02.03.1998 Отделом УФМС по улице Бакунинская", sortedByPassportIssueDatePersons.get(16));
        Assertions.assertEquals("ФИО: Богданов Алексей Алексеевич, Паспорт: 4876 716276, Выдан: 15.04.1998 Отделом УФМС по улице Первомайская", sortedByPassportIssueDatePersons.get(17));
        Assertions.assertEquals("ФИО: Богданов Олег Георгиевич, Паспорт: 9265 607005, Выдан: 09.05.1998 Отделом УФМС по улице Докукина", sortedByPassportIssueDatePersons.get(18));
        Assertions.assertEquals("ФИО: Петров Иван Михайлович, Паспорт: 1207 579726, Выдан: 12.12.1998 Отделом УФМС по улице Норильская", sortedByPassportIssueDatePersons.get(19));
    }
}
