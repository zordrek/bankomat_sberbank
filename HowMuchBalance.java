package sberbank;

public class HowMuchBalance {
    public static void hmbalance() {
        ReadCard read = new ReadCard();
        String text = read.read(Share.patchtocard());
        var num = Double.parseDouble(text);
        System.out.println("Ваш баланс " + num + " тэнге.");
    }
}