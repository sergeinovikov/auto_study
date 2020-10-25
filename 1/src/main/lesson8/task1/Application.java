package main.lesson8.task1;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        List<Person> duplicates = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Person person = new Person();
            duplicates.add(person);
        }

        Set<Person> uniqueDuplicates = new HashSet<>();
        for (int i = 0; i < duplicates.size(); i++) {
            for (int j = i + 1; j < duplicates.size(); j++) {
                if (duplicates.get(i).equals(duplicates.get(j))) {
                    uniqueDuplicates.add(duplicates.get(i));
                }
            }
        }

        for (Person current : uniqueDuplicates) {
            System.out.println(current);
        }
        
        System.out.println();
        Set<Person> persons = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            Person person = new Person();
            persons.add(person);
        }
        System.out.println("Количество людей в сете persons: " + persons.size());
    }


}
