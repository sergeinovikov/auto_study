package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Account;
import main.lesson14.model.Person;
import main.lesson14.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task9 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsWithBudgetOver20000kAndPropertyCostAbove26000k() {
        assert persons != null;
        Long personWithBudgetOver20000k = persons.stream()
                .map(Person::getAccounts)
                .filter(accounts -> !accounts.isEmpty())
                .filter(accounts -> accounts.stream()
                        .map(Account::getAccountBalance)
                        .reduce(Double::sum)
                        .get() > 20_000_000d
                )
                .count();
        System.out.println(personWithBudgetOver20000k);
        Assertions.assertEquals(8, personWithBudgetOver20000k);

        Long personWithPropertyCostAbove26000k = persons.stream()
                .map(Person::getProperties)
                .filter(properties -> !properties.isEmpty())
                .filter(properties -> properties.stream()
                        .map(Property::getPrice)
                        .reduce(Double::sum)
                        .get() > 26_000_000d
                )
                .count();
        System.out.println(personWithPropertyCostAbove26000k);
        Assertions.assertEquals(8, personWithPropertyCostAbove26000k);

        Assertions.assertEquals(personWithBudgetOver20000k, personWithPropertyCostAbove26000k);
    }
}
