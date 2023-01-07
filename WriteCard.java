package sberbank;

import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteCard {
    //public static void write() {
    public static String write(String filename) {
        try {
            // Путь к файлу
            String filePath = Share.patchtocard();
            // Строка, которую будем записывать в файл
            String content = "125874";
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
