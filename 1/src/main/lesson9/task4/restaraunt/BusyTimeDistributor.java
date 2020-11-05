package main.lesson9.task4.restaraunt;

import java.util.List;

public class BusyTimeDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int minTime = 0;
        Cooker chosenCooker = new Cooker();
        for (int i = 0; i < cookers.size(); i++) {
            if (minTime > cookers.get(i).timeSummary()) {
                minTime = cookers.get(i).timeSummary();
                chosenCooker = cookers.get(i);
            }

            if (i == 0) {
                minTime = cookers.get(i).timeSummary();
                chosenCooker = cookers.get(i);
            }
        }
        return chosenCooker;
    }
}
