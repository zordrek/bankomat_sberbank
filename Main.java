package sberbank;

public class Main {
    public static void main(String[] args) {
        FirstPage fp = new FirstPage();
        CardFromDB cfdb = new CardFromDB();
        ReadCard rc = new ReadCard();
        fp.sayHello();
        cfdb.cardFromDB();
        rc.read(Share.patchtocard());
        System.out.println(cfdb.balance());
        int num = Integer.parseInt(rc.read(Share.patchtocard()));
        System.out.println(num);
    }
}
