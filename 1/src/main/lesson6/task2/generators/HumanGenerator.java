package main.lesson6.task2.generators;

import main.lesson6.task2.Chance;
import main.lesson6.task2.Human;
import main.lesson6.task2.PhoneType;

import java.util.Map;

public class HumanGenerator {
    public Human generate() {
        Human human = new Human();
        human.setFirstName(new NameGenerator().generate());
        human.setLastName(new NameGenerator().generate());
        human.setAge(new AgeGenerator().generate());

        if (Chance.calculateChance(20)) {
            String phone = new PhoneGenerator().generate();
            PhoneType home = PhoneType.HOME;
            human.setPhones(home, phone);
        }

        if (Chance.calculateChance(20)) {
            String phone = new PhoneGenerator().generate();
            PhoneType work = PhoneType.WORK;
            human.setPhones(work, phone);
        }

        if (Chance.calculateChance(20)) {
            String phone = new PhoneGenerator().generate();
            PhoneType mobile = PhoneType.MOBILE;
            human.setPhones(mobile, phone);
        }

        return human;
    }
}
