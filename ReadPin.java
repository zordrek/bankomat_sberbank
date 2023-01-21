package sberbank;
import java.util.Scanner;

public class ReadPin {


    static void readpin() {
        Scanner inpin = new Scanner(System.in);
        ReadCard rc = new ReadCard();
        int read_pin = Integer.parseInt(rc.read(Share.patchtocard()));
        int pin = inpin.nextInt();

        if (pin == read_pin) {
            Welcome wlc = new Welcome();
            wlc.welcome();
            //int read_pin = Integer.parseInt(rc.read(Share.patchtocard()));
        } else {
            System.out.println("Не верный PIN");
            //Auth auth = new Auth();
            // auth.auth();
            readpin();
        

        }
    }
}
