package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void countPassportSeriesVariations() {
        assert persons != null;
        Long passportsAmount = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getPassport().getSeries())
                .distinct()
                .count();
        System.out.printf("Количество различных серий паспортов: %d", passportsAmount);
        Assertions.assertEquals(472, passportsAmount);
    }

    @Test
    public void personWith3AccountsAnd2CardsWithin49and99FirstPersons() {
        assert persons != null;
        Person person = persons.stream()
                .skip(49)
                .limit(100)
                .findFirst()
                .filter(person1 -> person1.getAccounts().size() == 3)
                .filter(person1 -> person1.getCards().size() == 2)
                .orElse(persons.get(0));
        System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic());
        for (int i = 0; i < person.getAccounts().size(); i++) {
            System.out.printf("%s ", person.getAccounts().get(i).getAccountNumber());
        }
        System.out.println();
        for (int i = 0; i < person.getCards().size(); i++) {
            System.out.printf("%s ", person.getCards().get(i).getCardNumber());
        }
        Assertions.assertEquals("Кузьмин", person.getLastName());
        Assertions.assertEquals("Иван", person.getFirstName());
        Assertions.assertEquals("Петрович", person.getPatronymic());
        Assertions.assertEquals("03993.328.3.16306561347", person.getAccounts().get(0).getAccountNumber());
        Assertions.assertEquals("03443.364.6.62434564962", person.getAccounts().get(1).getAccountNumber());
        Assertions.assertEquals("81821.643.9.65301523431", person.getAccounts().get(2).getAccountNumber());
        Assertions.assertEquals("4593279110041199", person.getCards().get(0).getCardNumber());
        Assertions.assertEquals("5370923335643534", person.getCards().get(1).getCardNumber());
    }

    @Test
    public void personsWithCorrectPassportFormat() {
        assert persons != null;
        Boolean result = persons.stream()
                .filter(person -> person.getPassport() != null)
                .allMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$") &&
                                        person.getPassport().getNumber().matches("^[0-9]{6}$")
                );
        if (result) {
            System.out.println("У всех клиентов, у которых есть паспорт, данные соответствуют формату");
        } else {
            System.out.println("Есть клиенты, у которых данные паспорта не соответствуют формату");
        }
        Assertions.assertEquals(true, result);
    }


}
