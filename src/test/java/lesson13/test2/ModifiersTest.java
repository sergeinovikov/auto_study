package lesson13.test2;

import main.lesson13.task2.Modifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModifiersTest {

    @Test
    public void invertTet() {
        Boolean actualResult = Modifiers.invert(true);
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void absoluteTet() {
        Integer actualResult = Modifiers.absolute(-25);
        Assertions.assertEquals(25, actualResult);
    }

    @Test
    public void reverseTet() {
        String actualResult = Modifiers.revere("Москва");
        Assertions.assertEquals("авксоМ", actualResult);
    }
}
