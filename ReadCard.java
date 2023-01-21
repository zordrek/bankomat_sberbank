package sberbank;
import java.io.File;
import java.io.FileReader;


public class ReadCard {
    public static String read(String filename) {

        try {
            // Создаем объект файла
            File file = new File(Share.patchtocard());
            // Создаем объект FileReader для чтения файла
            FileReader fr = new FileReader(file);

            String text = "";

            int c = 0;
            while ((c = fr.read()) != -1) {
                char character = (char) c;
                int i = Character.digit(c, 10);
                String str = Integer.toString(i);
                text += str;
            }
            fr.close();

            return text;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
