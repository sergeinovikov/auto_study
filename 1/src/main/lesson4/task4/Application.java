package main.lesson4.task4;

public class Application {
    public static void main(String[] args) {
        System.out.println("Первый человек");
        Human one = new Human()
                .setFirstName("Иван")
                .setLastName("Иванов")
                .setAge(14)
                .setPassport("1151", "444111")
                .setPassport("1151", "444111");

        System.out.printf("%nВторой человек%n");
        Human two = new Human()
                .setFirstName("Пётр")
                .setLastName("Петров")
                .setAge(121)
                .setPassport("1151", "44411d1")
                .setPassport("1151", "444111");

        System.out.printf("%nТретий человек%n");
        Human three = new Human()
                .setFirstName("Sергей")
                .setLastName("Сергеев")
                .setAge(-1)
                .setPassport("1151", null)
                .setPassport(null, "444111");

        System.out.printf("%n%nИмя:%s, Фамилия:%s, Возраст:%s,Паспорт серия:%s, Паспорт номер:%s%n", one.getFirstName(), one.getLastName(), one.getAge(), one.getPassport().getSeries(), one.getPassport().getNumber());
        System.out.printf("Имя:%s, Фамилия:%s, Возраст:%s, Паспорт серия:%s, Паспорт номер:%s%n", two.getFirstName(), two.getLastName(), two.getAge(), two.getPassport().getSeries(), two.getPassport().getNumber());
        System.out.printf("Имя:%s, Фамилия:%s, Возраст:%s,Паспорт серия:%s, Паспорт номер:%s%n", three.getFirstName(), three.getLastName(), two.getAge(), three.getPassport().getSeries(), three.getPassport().getNumber());
    }
}
