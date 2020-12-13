package lessonn14;

import main.lesson14.helpers.JsonHelper;
import main.lesson14.model.Card;
import main.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Task8 {
    private final List<Person> persons = JsonHelper.getPersonsFromFile("1/src/main/lesson14/dataset.json");

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
    public void personsCardsAmount() {
        assert persons != null;
        Long countAllValidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .flatMap(Collection::stream)
                .filter(this::isValid)
                .count();
        System.out.println(countAllValidCards);
        Assertions.assertEquals(425, countAllValidCards);

        Long countVisaValidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .flatMap(Collection::stream)
                .filter(this::isValid)
                .filter(card -> card.getType().equals("VISA"))
                .count();
        System.out.println(countVisaValidCards);
        Assertions.assertEquals(136, countVisaValidCards);

        Long countMCValidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .flatMap(Collection::stream)
                .filter(this::isValid)
                .filter(card -> card.getType().equals("MasterCard"))
                .count();
        System.out.println(countMCValidCards);
        Assertions.assertEquals(159, countMCValidCards);

        Long countMirValidCards = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .flatMap(Collection::stream)
                .filter(this::isValid)
                .filter(card -> card.getType().equals("МИР"))
                .count();
        System.out.println(countMirValidCards);
        Assertions.assertEquals(130, countMirValidCards);

        Assertions.assertEquals(countAllValidCards, countVisaValidCards + countMCValidCards + countMirValidCards);
    }
}
