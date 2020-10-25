package main.lesson8.task4;

import main.lesson8.task4.entities.Client;
import main.lesson8.task4.entities.Entity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ValidatorStub {
    private static Set<Entity> entities = new HashSet<>();

    public static void validateEntity(Entity entity) {
        System.out.println("Объект до валидации:");
        System.out.println(entity);
        if (entities.size() == 0) {
            entity.setUuid(String.valueOf(new Random().nextInt(10000000)));
            entities.add(entity);
        } else {
            for (Entity current : entities) {
                if (entity.equals(current)) {
                    entity.setUuid(current.getUuid());
                } else {
                    entity.setUuid(String.valueOf(new Random().nextInt(10000000)));
                    entities.add(entity);
                    break;
                }
            }
        }
        System.out.println("Объект после валидации: ");
        System.out.println(entity);

    }
}
