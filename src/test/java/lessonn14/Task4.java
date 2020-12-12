package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Card;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

    @Test
    public void personsWith3AccountsAnd0Cards() {
        assert persons != null;
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getAccounts().size() == 3)
                .filter(person -> person.getCards().size() == 0)
                .collect(Collectors.toList());
        Assertions.assertEquals(0, filteredPersons.size());
        Boolean allSeries4Digits = filteredPersons.stream()
                .allMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        System.out.println(allSeries4Digits);
        Assertions.assertEquals(true, allSeries4Digits);
        Boolean atLeastOnePersonSeries4Digits = filteredPersons.stream()
                .anyMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        System.out.println(atLeastOnePersonSeries4Digits);
        Assertions.assertEquals(false, atLeastOnePersonSeries4Digits);
        Boolean notASinglePersonSeries4Digits = filteredPersons.stream()
                .noneMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        System.out.println(notASinglePersonSeries4Digits);
        Assertions.assertEquals(true, notASinglePersonSeries4Digits);
    }

    private Boolean isValid(Card card) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.yy");
        try {
            Date cardDate = sdf.parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }
    }

    @Test
    public void personsWithValidAndInvalidCards() {
        assert persons != null;
        Long personsWithCards = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .count();
        System.out.println(personsWithCards);
        Assertions.assertEquals(462, personsWithCards);

        Long personsWithValidCard = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().allMatch(this::isValid))
                .count();
        System.out.println(personsWithValidCard);
        Assertions.assertEquals(152, personsWithValidCard);

        Long personsWithInvalidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().noneMatch(this::isValid))
                .count();
        System.out.println(personsWithInvalidCards);
        Assertions.assertEquals(153, personsWithInvalidCards);

        Long personsWithValidAndInvalidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().anyMatch(this::isValid))
                .filter(cards -> cards.stream().anyMatch(card -> !isValid(card)))
                .count();
        System.out.println(personsWithValidAndInvalidCards);
        Assertions.assertEquals(157, personsWithValidAndInvalidCards);
    }
}