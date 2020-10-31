package main.lesson9.task1;

import main.lesson9.task1.cars.*;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }

        int mitsubishiAmount = 0;
        int nissanAmount = 0;
        int renaultAmount = 0;
        int mercedesAmount = 0;
        int regularAmount = 0;
        int premiumAmount = 0;

        for (Car currentCar : cars) {
            if (currentCar instanceof Mitsubishi)
                mitsubishiAmount++;
            if (currentCar instanceof Nissan)
                nissanAmount++;
            if (currentCar instanceof Renault)
                renaultAmount++;
            if (currentCar instanceof Mercedes)
                mercedesAmount++;
            if (currentCar instanceof Regular)
                regularAmount++;
            if (currentCar instanceof Premium)
                premiumAmount++;
        }

        System.out.printf("Количество Mitsubishi: %d%nКоличество Nissan %d%nКоличество Renault: %d%nКоличество Mercedes: %d%nКоличество машин класса премиум: %d%nКоличество машин класса регуляр: %d", mitsubishiAmount, nissanAmount, renaultAmount, mercedesAmount, premiumAmount, regularAmount);
    }
}
