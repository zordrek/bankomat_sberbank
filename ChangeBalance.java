package sberbank;

import java.util.Scanner;

public class ChangeBalance {
    public static String nowmuchminus() {
        HowMuchBalance hmbalance = new HowMuchBalance();
        String text = hmbalance.hmbalance();
        var num = Double.parseDouble(text);
        System.out.println("*********** Сколько вы хотите снять? ***********");
        Scanner instepx = new Scanner(System.in);
        String newbalance = instepx.nextLine();
        var num2 = Double.parseDouble(newbalance);
        if (num2 > num) {
            System.out.println("Недостаточно средств");
            num2 = 0;
        }
        double total = num - num2;
        String str = Double.toString(total);
        return str;
    }

    public static String nowmuchplus() {
        HowMuchBalance hmbalance = new HowMuchBalance();
        String text = hmbalance.hmbalance();
        var num = Double.parseDouble(text);
        System.out.println("*********** Сколько вы хотите положить? ***********");
        Scanner instepx = new Scanner(System.in);
        String newbalance = instepx.nextLine();
        var num2 = Double.parseDouble(newbalance);
        double total = num + num2;
        String str = Double.toString(total);
        return str;
    }

    public static void minusbalance() {
        WriteCard write = new WriteCard();
        write.writeminus();
        //return null;
    }

    public static void plusbalance() {
        WriteCard write = new WriteCard();
        write.writeplus();
        //return null;
    }
}
