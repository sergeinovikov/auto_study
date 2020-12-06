package lesson13.task3;

import main.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OnlyEqualsObjectsTest {

    @Test
    public void listOfObjectsUniqueTest() {
        Object uniqueObject1 = new Object();
        Object uniqueObject2 = new Object();
        Object uniqueObject3 = new Object();

        List<Object> notUniqueObjects = Arrays.asList(uniqueObject1, uniqueObject2, uniqueObject3, uniqueObject1);
        List<Object> uniqueObjects = Arrays.asList(uniqueObject1, uniqueObject2, uniqueObject3);

        Assertions.assertEquals(false, Functions.onlyEqualsObjects(notUniqueObjects));
        Assertions.assertEquals(true, Functions.onlyEqualsObjects(uniqueObjects));
    }

    @Test
    public void emptyListTest() {
        List<Object> emptyObjects = new ArrayList<>();
        Assertions.assertEquals(true, Functions.onlyEqualsObjects(emptyObjects));
    }

    @Test
    public void listOfStringsUniqueTest() {
        String uniqueString1 = "Москва";
        String uniqueString2 = "Зеленоград";
        String uniqueString3 = "Химки";
        String notUniqueString = "Москва";

        List<Object> notUniqueStrings = Arrays.asList(uniqueString1, uniqueString2, uniqueString3, notUniqueString);
        List<Object> uniqueStrings = Arrays.asList(uniqueString1, uniqueString2, uniqueString3);

        Assertions.assertEquals(false, Functions.onlyEqualsObjects(notUniqueStrings));
        Assertions.assertEquals(true, Functions.onlyEqualsObjects(uniqueStrings));
    }

    private static class Cat {
        private final String name;
        private final int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;

            Cat cat = (Cat) o;

            if (age != cat.age) return false;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
    }

    @Test
    public void listOfCatsUniqueTest() {
        Cat uniqueCat1 = new Cat("Маркиз", 2);
        Cat uniqueCat2 = new Cat("Пушок", 1);
        Cat uniqueCat3 = new Cat("Уголёк", 3);
        Cat notUniqueCat = new Cat("Маркиз", 2);

        List<Object> notUniqueCats = Arrays.asList(uniqueCat1, uniqueCat2, uniqueCat3, notUniqueCat);
        List<Object> uniqueCats = Arrays.asList(uniqueCat1, uniqueCat2, uniqueCat3);

        Assertions.assertEquals(false, Functions.onlyEqualsObjects(notUniqueCats));
        Assertions.assertEquals(true, Functions.onlyEqualsObjects(uniqueCats));
    }

}
