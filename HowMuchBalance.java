package sberbank;

public class HowMuchBalance {
    public static String hmbalance() {
        CardFromDB cfdb = new CardFromDB();
        String text = cfdb.balance();
        return text;
    }
}
