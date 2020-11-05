package main.lesson9.task4.restaraunt;

import main.lesson9.task3.figures.*;

import java.util.List;

public class RoundRobinDistributor extends Distributor {
    private static int index = 0;

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        Cooker chosenCooker = new Cooker();
        for (int i = 0; i < cookers.size(); i++) {
            if (index == i) {
                index++;
                if (index == cookers.size())
                    index = 0;
                return cookers.get(i);
            }
        }
        throw new IllegalArgumentException("Не смогли найти повара под номером -" + index);
    }
}
