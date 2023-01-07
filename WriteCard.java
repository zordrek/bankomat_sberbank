package sberbank;

import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteCard {
    //public static void write() {
    public static String writeminus() {
        try {
            // Путь к файлу
            String filePath = Share.patchtocard();
            // Строка, которую будем записывать в файл
            //String content = "2548";
            String content = ChangeBalance.nowmuchminus();
            // Преобразуем строку в массив байтов
            byte[] contentBytes = content.getBytes();
            // Записываем массив байтов в файл
            Files.write(Paths.get(filePath), contentBytes);
            return content;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String writeplus() {
        try {
            // Путь к файлу
            String filePath = Share.patchtocard();
            // Строка, которую будем записывать в файл
            //String content = "2548";
            String content = ChangeBalance.nowmuchplus();
            // Преобразуем строку в массив байтов
            byte[] contentBytes = content.getBytes();
            // Записываем массив байтов в файл
            Files.write(Paths.get(filePath), contentBytes);
            return content;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
