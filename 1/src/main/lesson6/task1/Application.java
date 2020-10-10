package main.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            String firstName = new NameGenerator().generate();
            String lastName = new NameGenerator().generate();
            int age = new AgeGenerator().generate();
            String phoneNumber = new PhoneGenerator().generate();

            humans.add(new Human(firstName, lastName, age, phoneNumber));
        }

        for (Human current : humans) {
            if (current.age == 35) {
                System.out.printf("%s %s, возраст %d, тел. %s.%n", current.lastName, current.firstName, current.age, current.phoneNumber);
            }
        }
    }
}
