package main.lesson6.task2;

import main.lesson6.task2.generators.HumanGenerator;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Human> humansSet = new LinkedHashSet<>();
        for (int i = 0; i < 2000; i++) {
            humansSet.add(new HumanGenerator().generate());
        }

        int countHumansWithAllPhones = 0;
        for (Human currentHuman : humansSet) {
            if (currentHuman.getPhones().size() == 3) {
                System.out.printf("Имя:%s, Фамилия:%s, Возраст:%d, тел. дом.%s, тел.раб:%s, тел.моб.:%s%n", currentHuman.getFirstName(), currentHuman.getLastName(), currentHuman.getAge(), currentHuman.getPhones().get(PhoneType.HOME), currentHuman.getPhones().get(PhoneType.WORK), currentHuman.getPhones().get(PhoneType.MOBILE));
                countHumansWithAllPhones++;
            }
        }
        System.out.printf("Количество людей с 3 телефонами:%s%n", countHumansWithAllPhones);

        humansSet.removeIf(currentHuman -> currentHuman.getPhones().size() > 1);
        System.out.printf("Количество людей без телефонов:%d%n", humansSet.size());
    }
}
