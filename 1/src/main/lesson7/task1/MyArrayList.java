package main.lesson7.task1;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {

    @Override
    public int size() {
        System.out.printf("Размер спика: %d%n", super.size());
        return super.size();
    }

    @Override
    public boolean add(Object t) {
        super.add(t);
        System.out.printf("Добавлен объект %s в список%n", t);
        return true;
    }

    @Override
    public boolean contains(Object o) {
        if (super.contains(o)) {
            System.out.println("Объект содержится в списке");
        } else {
            System.out.println("Объект не содержится в списке ");
        }
        return super.contains(o);
    }

    @Override
    public Object get(int index) {
        try {
            System.out.printf("Получен объект %s из списка", super.get(index));
            return super.get(index);
        } catch (IndexOutOfBoundsException exception) {
            System.out.printf("Получен объект %s из списка%n", null);
            return null;
        }
    }

    @Override
    public void add(int index, Object element) {
        try {
            super.add(index, element);
            System.out.printf("Добавлен объект %s в спиок на позицию %d%n", element, index);
        } catch (IndexOutOfBoundsException exception) {
            super.add(0, element);
            System.out.printf("Добавлен объект %s в спиок на позицию 0%n", element);
        }
    }
}
