package sberbank;
import java.util.Scanner;

public class ReadPin {
    static void readpin() {
        Scanner inpin = new Scanner(System.in);
        int pin = inpin.nextInt();
        if (pin == 2379) {
            Welcome wlc = new Welcome();
            wlc.welcome();
        } else {
            System.out.println("Не верный PIN");
            //Auth auth = new Auth();
            // auth.auth();
            readpin();
        

        }
    }
}
