package sberbank;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;

public class ReadCard {
    public static String read(String filename) {

        try {
           /* FileReader fr = new FileReader("file.txt");
            int c;
            while ((c = fr.read()) != -1) {
                char character = (char) c;
                // do something with the character
            }
            fr.close();
            */

            // Создаем объект файла
            File file = new File(Share.patchtocard());
            // Создаем объект FileReader для чтения файла
            FileReader fr = new FileReader(file);
            // Создаем объект Scanner для считывания файла
            //Scanner scan = new Scanner(fr);
            // Переменная для хранения содержимого файла
            String text = "";
            // Считываем файл построчно
           // while (scan.hasNextLine()) {
           //     text =+ scan.nextLine();
            int c = 0;
            while ((c = fr.read()) != -1) {
                char character = (char) c;
                int i = Character.digit(c, 10);
                String str = Integer.toString(i);
                text += str;
            }
            fr.close();
            // Закрываем сканнер
            //scan.close();
            // Возвращаем содержимое файла
            return text;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
   public static void readafter() {
        try {
            // Путь к файлу
            String filePath = Share.patchtocard();
            // Считываем файл в массив байтов
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            // Преобразуем массив байтов в строку
            String fileContent = new String(fileBytes);
            // Выводим строку в консоль
            System.out.println(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
