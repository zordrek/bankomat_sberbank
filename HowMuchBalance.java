package sberbank;

public class HowMuchBalance {
    public static String hmbalance() {
        //CardFromDB cfdb = new CardFromDB();
        //String text = cfdb.balance();
        CardBalance cb = new CardBalance();
        String text = cb.balance();
        return text;
    }
}
