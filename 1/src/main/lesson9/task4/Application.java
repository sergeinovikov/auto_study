package main.lesson9.task4;

import main.lesson9.task4.food.Food;
import main.lesson9.task4.food.Generator;
import main.lesson9.task4.restaraunt.BusyTimeDistributor;
import main.lesson9.task4.restaraunt.Cooker;
import main.lesson9.task4.restaraunt.RoundRobinDistributor;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Food> menu = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            menu.add(new Generator().generateFood());

        List<Cooker> cookers = new Generator().generateCookers();

        RoundRobinDistributor roundRobin = new RoundRobinDistributor();

        for (Food currentFood : menu)
            roundRobin.addFood(currentFood, cookers);

        int totalCookingTimeRobin = 0;
        for (Cooker cooker : cookers) {
            if (totalCookingTimeRobin < cooker.timeSummary())
                totalCookingTimeRobin = cooker.timeSummary();
        }

        System.out.println("Общее время приготовления блюд при распределении поваров по очерёдности - " + totalCookingTimeRobin);

        BusyTimeDistributor busyTime = new BusyTimeDistributor();

        for (Cooker currentCooker : cookers)
            currentCooker.clearFoodList();

        for (Food currentFood : menu)
            busyTime.addFood(currentFood, cookers);

        int totalCookingTimeBusy = 0;
        for (Cooker cooker : cookers) {
            if (totalCookingTimeBusy < cooker.timeSummary())
                totalCookingTimeBusy = cooker.timeSummary();
        }


        System.out.println("Общее время приготовления блюд при распределении поваров по занятости - " + totalCookingTimeBusy);

        if (totalCookingTimeRobin > totalCookingTimeBusy) {
            System.out.println("Алгоритм распределения по занятости эффективнее");
        } else if (totalCookingTimeRobin < totalCookingTimeBusy) {
            System.out.println("Алгоритм распределения по очерёдности эффективнее");
        } else {
            System.out.println("Между алгоритмами распределения нет разницы!");
        }
    }
}
