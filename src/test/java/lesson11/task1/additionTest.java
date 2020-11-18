package lesson11.task1;

import main.lesson11.task1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class additionTest {

    @Test
    public void calcAdditionTest1() {
        Assertions.assertEquals(8, Calculator.addition(5, 3));
    }

    @Test
    public void calcAdditionTest2() {
        Assertions.assertEquals(21, Calculator.addition(1, 2, 3, 4, 5, 6));
    }
}
