package lesson11.task1;

import main.lesson11.task1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class multiplicationTest {

    @Test
    public void calcMultiplicationTest1() {
        Assertions.assertEquals(6, Calculator.multiplication(3, 2));
    }

    @Test
    public void calcMultiplicationTest2() {
        Assertions.assertEquals(720, Calculator.multiplication(1, 2, 3, 4, 5, 6));
    }
}
