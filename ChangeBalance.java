package sberbank;

import java.util.Scanner;

public class ChangeBalance {
    public static String nowmuchminus() {
        HowMuchBalance hmbalance = new HowMuchBalance(); //создается экземляр класса HowMuchBalance
        String text = hmbalance.hmbalance(); //переменной text присваивается результат выполнения HowMuchBalance, запрос из БД
        var num = Double.parseDouble(text); //переменной num присваивается преобразованное в число с запятой значение переменной text
        System.out.println("*********** Сколько вы хотите снять? ***********");
        Scanner instepx = new Scanner(System.in); //запрос суммы для изымания из карты
        String newbalance = instepx.nextLine(); //строковой переменной newbalance присваивается результат выполнения запроса
        var num2 = Double.parseDouble(newbalance); //переменной num2 присваивается преобразованное в число с запятой значение переменной newbalance
        if (num2 > num) { //ежели введенная сумма для изъятия больше чем имеющаяся
            System.out.println("Недостаточно средств"); //напишет что нет средств
            num2 = 0; //присвоит перменной num2 значение 0
        }
        double total = num - num2; //переменной total присваивается разница переменных num и num2
        String str = Double.toString(total); //строковой переменной str присваивается преобразованное в строку значение переменной total
        return str; //метод отдает значение переменной total
    }

    public static String nowmuchplus() {
        HowMuchBalance hmbalance = new HowMuchBalance(); //создается экземляр класса HowMuchBalance
        String text = hmbalance.hmbalance(); //переменной text присваивается результат выполнения HowMuchBalance, запрос из БД
        var num = Double.parseDouble(text); //переменной num присваивается преобразованное в число с запятой значение переменной text
        System.out.println("*********** Сколько вы хотите пАложить? ***********");
        Scanner instepx = new Scanner(System.in); //запрос суммы для покладания на карту
        String newbalance = instepx.nextLine(); //строковой переменной newbalance присваивается результат выполнения запроса
        var num2 = Double.parseDouble(newbalance); //переменной num2 присваивается преобразованное в число с запятой значение переменной newbalance
        double total = num + num2; //переменной total присваивается сумма переменных num и num2
        String str = Double.toString(total); //строковой переменной str присваивается преобразованное в строку значение переменной total
        return str; //метод отдает значение переменной total
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
