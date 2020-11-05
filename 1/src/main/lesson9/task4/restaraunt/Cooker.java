package main.lesson9.task4.restaraunt;

import main.lesson9.task4.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    private List<Food> foodList = new ArrayList<>();

    public int timeSummary() {
        int timeSummary = 0;
        for (Food currentFood : foodList) {
            timeSummary += currentFood.getCookingTime();
        }
        return timeSummary;
    }

    public int foodAmount() {
        return foodList.size();
    }

    public void addFoodToList(Food food) {
        foodList.add(food);
    }

    public void clearFoodList() {
        foodList.clear();
    }
}
