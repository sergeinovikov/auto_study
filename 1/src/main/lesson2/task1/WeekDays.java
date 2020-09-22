package main.lesson2.task1;

public class WeekDays {
    public static void main(String[] args) {
        String[] best = {"Пятница", "это", "лучший", "день", "недели"};
        WeekDays friday = new WeekDays();
        friday.first(best);
        friday.second(best);
        friday.third(best);
    }

    void first(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                System.out.printf("%s.%n", words[i]);
            } else {
                System.out.printf("%s ", words[i]);
            }
        }

    }

    void second(String[] words) {
        int index = 0;
        for (String current : words) {
            if (index == words.length - 1) {
                System.out.printf("%s.%n", current);
            } else {
                System.out.printf("%s ", current);
            }
            index++;
        }
    }

    void third(String[] words) {
        int index = 0;
        while (index < words.length) {
            if (index == words.length - 1) {
                System.out.printf("%s.", words[index]);
            } else {
                System.out.printf("%s ", words[index]);
            }
            index++;
        }
    }
}
