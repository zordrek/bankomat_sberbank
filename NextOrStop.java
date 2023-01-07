package sberbank;

import java.util.Scanner;

public class NextOrStop {
    public static void nextorstop() {
        System.out.println("");
        System.out.println("'1' - продолжить работу или '0' - завершить работу");
        Scanner instepx = new Scanner(System.in);
        int stepx = instepx.nextInt();
        if (stepx == 1) {
            MainMenu mm = new MainMenu();
            mm.mm();
        } else {
            System.out.println("********** До свидания ************");
        }
    }
}
