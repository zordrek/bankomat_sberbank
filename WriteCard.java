package sberbank;

import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteCard {
    //public static void write() {
    public static void writeminus() {
        try {
            CardBalanceUpdate cbu = new CardBalanceUpdate();
            cbu.balanceminus();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeplus() {
        try {
            CardBalanceUpdate cbu = new CardBalanceUpdate();
            cbu.balanceplus();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
