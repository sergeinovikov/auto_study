package main.lesson8.task2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<Integer, Double> probabilitySet = new TreeMap<>();
        for (int groupAmount = 10; groupAmount <= 30; groupAmount++) {
            int iterationAmount = 100000;
            List<Person> currentProbability = new ArrayList<>();
            for (int iteration = 0; iteration < iterationAmount; iteration++) {
                List<Person> birthDateSet = new ArrayList<>();
                for (int i = 0; i < groupAmount; i++) {
                    Person person = new Person();
                    birthDateSet.add(person);
                }
                for (int i = 0; i < birthDateSet.size(); i++) {
                    boolean contains = false;
                    for (int j = i + 1; j < birthDateSet.size(); j++) {
                        if (birthDateSet.get(i).equals(birthDateSet.get(j))) {
                            currentProbability.add(birthDateSet.get(i));
                            contains = true;
                            break;
                        }
                    }
                    if (contains) {
                        break;
                    }
                }
            }
            double probability = ((double) currentProbability.size() / iterationAmount) * 100;
            probabilitySet.put(groupAmount, probability);
        }
        for (Map.Entry<Integer, Double> entry : probabilitySet.entrySet()) {
            System.out.printf("%d: %.2f%s %n", entry.getKey(), entry.getValue(), "%");
        }
    }
}
