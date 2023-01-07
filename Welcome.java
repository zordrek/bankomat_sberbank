package sberbank;

public class Welcome {
    static void welcome() {
        System.out.println("Добро пожаловать, дорогой Карлсон!");
        System.out.println("");
        System.out.println("");
        MainMenu mm = new MainMenu();
        mm.mm();
    }
}
