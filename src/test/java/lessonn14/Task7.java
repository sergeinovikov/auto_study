package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Task7 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsAccountAmount() {
        assert persons != null;
        Long countPersonsAccounts = persons.stream()
                .map(Person::getAccounts)
                .filter(Objects::nonNull)
                .mapToLong(Collection::size)
                .sum();
        System.out.println(countPersonsAccounts);
        Assertions.assertEquals(988, countPersonsAccounts);

        Long countCheckingAccounts = persons.stream()
                .map(Person::getAccounts)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(account -> account.getAccountType().equals("Расчетный"))
                .count();
        System.out.println(countCheckingAccounts);
        Assertions.assertEquals(323, countCheckingAccounts);

        Long countDepositoryAccounts = persons.stream()
                .map(Person::getAccounts)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(account -> account.getAccountType().equals("Депозитный"))
                .count();
        System.out.println(countDepositoryAccounts);
        Assertions.assertEquals(342, countDepositoryAccounts);

        Long countRunningAccounts = persons.stream()
                .map(Person::getAccounts)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(account -> account.getAccountType().equals("Текущий"))
                .count();
        System.out.println(countRunningAccounts);
        Assertions.assertEquals(323, countRunningAccounts);

        Assertions.assertEquals(countPersonsAccounts, countCheckingAccounts + countDepositoryAccounts + countRunningAccounts);
    }
}
