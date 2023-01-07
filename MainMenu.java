package sberbank;

import java.util.Scanner;

public class MainMenu {
    static void mm() {
        System.out.println("************* Главное меню ***********");
        System.out.println("");
        System.out.println(">>>>> '1' - Узнать баланс");
        System.out.println("");
        System.out.println(">>>>> '2' - Снять деньги");
        System.out.println("");
        System.out.println(">>>>> '3' - Пополнить баланс");
        System.out.println("");
        System.out.println(">>>>> '0' - Завершить работу");
        NextOrStop nextorstop = new NextOrStop();
        Scanner instep = new Scanner(System.in);
        int step = instep.nextInt();

        if (step == 1) {
            System.out.println("************* Узнать баланс ***********");
            HowMuchBalance hmbalance = new HowMuchBalance();
            hmbalance.hmbalance();
            nextorstop.nextorstop();
        }
        if (step == 2) {
            System.out.println("************* Снять деньги ***********");

            nextorstop.nextorstop();
        }
        if (step == 3) {
            System.out.println("************* Пополнить баланс ***********");

            nextorstop.nextorstop();
        }

        ReadCard read = new ReadCard();

        WriteCard write = new WriteCard();
        String text = write.write(Share.patchtocard());
        //write.write();

        read.readafter();
    }
}
