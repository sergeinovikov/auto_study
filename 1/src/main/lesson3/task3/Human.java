package main.lesson3.task3;

public class Human {
    String name;
    int age;
    Human[] parents = new Human[2];
    Human[] grandparents = new Human[4];

    Human(String name, int age, Human parent1, Human parent2) {
        this.name = name;
        this.age = age;
        this.parents[0] = parent1;
        this.parents[1] = parent2;
        int count = 0;
        for (int i = 0; i <= 1; i++) {
            if (parents[i] != null) {
                for (int j = 0; j <= 1; j++) {
                    if (parents[i].parents[j] != null) {
                        grandparents[count] = parents[i].parents[j];
                        count++;
                    }
                }
            }
        }
    }
}
