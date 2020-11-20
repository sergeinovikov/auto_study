package lesson11.task2;

import main.lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeTest {
    @Test
    public void ageTest1() {
        Human human = new Human();
        human.setAge(0);
        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    public void ageTest2() {
        Human human = new Human();
        human.setAge(60);
        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    public void ageTest3() {
        Human human = new Human();
        human.setAge(120);
        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    public void ageTest4() {
        Human human = new Human();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> human.setAge(-1));
    }

    @Test
    public void ageTest5() {
        Human human = new Human();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> human.setAge(121));
    }
}
