package main.lesson2.task8;

public class CharacterN {
    public static void main(String[] args) {
        CharacterN n = new CharacterN();
        n.switchWithBreakN(-1);
        n.switchWithBreakN(2);
        n.switchWithBreakN(4);
        n.switchWithBreakN(7);
        n.switchWithBreakN(0);
        System.out.println("");
        n.switchWithoutBreakN(-1);
        n.switchWithoutBreakN(2);
        n.switchWithoutBreakN(4);
        n.switchWithoutBreakN(7);
        n.switchWithoutBreakN(0);
    }

    void switchWithBreakN(int digit) {
        switch (digit) {
            case 1:
                for (int i = 0; i < 1; i++) {
                    System.out.print("A");
                }
                System.out.println("");
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    System.out.print("A");
                }
                System.out.println("");
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    System.out.print("A");
                }
                System.out.println("");
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    System.out.print("A");
                }
                System.out.println("");
                break;
            default:
                for (int i = 0; i < 5; i++) {
                    System.out.print("A");
                }
                System.out.println("");
        }
    }

    void switchWithoutBreakN(int digit) {
        switch (digit) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.printf("A%n");
        }
    }

}
