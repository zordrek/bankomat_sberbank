package sberbank;

public class Auth {
    static void auth() {
        ReadPin rp = new ReadPin();
        System.out.println("Аутентификация");
        System.out.println("PIN: ");
        rp.readpin();
     }
}