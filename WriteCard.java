package sberbank;

import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteCard {
    public static void write() {
        try {
            // Путь к файлу
            String filePath = Share.patchtocard();
            // Строка, которую будем записывать в файл
            String content = "54487";
            // Преобразуем строку в массив байтов
            byte[] contentBytes = content.getBytes();
            // Записываем массив байтов в файл
            Files.write(Paths.get(filePath), contentBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
