package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsWithFundsBelow2100000() {
        assert persons != null;
        List<Person> personsBalanceBelow2100000 = persons.stream()
                .filter(person -> person.getAccounts().size() > 0)
                .filter(person -> {
                            Double accountsSum = 0.0;
                            for (int i = 0; i < person.getAccounts().size(); i++) {
                                accountsSum += person.getAccounts().get(i).getAccountBalance();
                            }
                            return accountsSum < 2100000;
                        }
                )
                .collect(Collectors.toList());

        Map<String, Double> personsAndBalance = new HashMap<>();
        for (Person person : personsBalanceBelow2100000) {
            Double accountsSum = 0.0;
            for (int j = 0; j < person.getAccounts().size(); j++) {
                accountsSum += person.getAccounts().get(j).getAccountBalance();
            }
            String fullName = person.getLastName() + " " + person.getFirstName() + " " + person.getPatronymic();
            personsAndBalance.put(fullName, accountsSum);
            System.out.printf("%s %s %s: %.2f%n", person.getLastName(), person.getFirstName(), person.getPatronymic(), accountsSum);
        }

        Assertions.assertEquals(2, personsAndBalance.size());
        Assertions.assertEquals(2043171.62, personsAndBalance.get("Иванов Георгий Алексеевич"));
        Assertions.assertEquals(2029366.53, personsAndBalance.get("Воронцов Василий Александрович"));
    }
}
