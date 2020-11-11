package main.lesson9.task4.restaraunt;

import main.lesson9.task3.figures.*;

import java.util.List;

public class RoundRobinDistributor extends Distributor {
    private static int index = 0;

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        new Cooker();
        Cooker chosenCooker;
        if (index != cookers.size()) {
            chosenCooker = cookers.get(index);
            index++;
        } else {
            index = 0;
            chosenCooker = cookers.get(index);
        }
        return chosenCooker;
    }
}
