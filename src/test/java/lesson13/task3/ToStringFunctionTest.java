package lesson13.task3;

import main.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToStringFunctionTest {

    @Test
    public void toStringFromObject() {
        Object object = new Object();
        String actualResult = Functions.toStringFunction(object);
        Assertions.assertEquals(object.getClass().getName() + "@" + Integer.toHexString(object.hashCode()), actualResult);
    }

    @Test
    public void toStringFromString() {
        String string = "Проверка теста";
        String actualResult = Functions.toStringFunction(string);
        Assertions.assertEquals("Проверка теста", actualResult);
    }

    private static class Cat {
        private final String name;
        private final int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("Имя: %s, Возраст: %d", this.name, this.age);
        }
    }

    @Test
    public void toStringFromCat() {
        Cat cat = new Cat("Пушок", 3);
        String actualResult = Functions.toStringFunction(cat);
        Assertions.assertEquals("Имя: Пушок, Возраст: 3", actualResult);
    }
}
