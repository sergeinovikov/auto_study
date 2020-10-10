package main.lesson5.task4;

public class Cat {
    private String name;
    private int age;

    Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0) {
                throw new AgeUnderZeroException();
            } else if (age >16) {
                throw new AgeTooHighException();
            }
            this.name = name;
            this.age = age;
        } catch (AgeUnderZeroException exception) {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.printf("Возраст кота меньше 0. Вывод ошибки: %s%n", stackTraceElements[0]);
        }
    }

    public String getName(){
        if (this.name==null){
            throw new NullPointerException();
        }
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
