package sberbank;

import java.util.Scanner;

public class FirstPage {
    static void sayHello() {

        System.out.println("********* Первая страница ************");
        System.out.println("");
        System.out.println(">>>> Вы вставили карту, выберите действие:");
        System.out.println("");
        System.out.println("'1' - продолжить работу или '0' - завершить работу");
        Scanner instep = new Scanner(System.in);
        int step = instep.nextInt();
        if (step == 1) {
            Auth auth = new Auth();
            auth.auth();
        } else {
            System.out.println("********** До свидания ************");
        }

    }
}
