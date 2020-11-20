package lesson11.task2;

import main.lesson11.task2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {
    @Test
    public void nameTest1() {
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals("Иван", human.getFirstName());
    }

    @Test
    public void nameTest2() {
        Human human = new Human();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> human.setFirstName("Ив"));
    }

    @Test
    public void nameTest3() {
        Human human = new Human();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> human.setFirstName("Ивансдлиннымименем"));
    }

    @Test
    public void nameTest4() {
        Human human = new Human();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> human.setFirstName("Иван5аа"));
    }
}
