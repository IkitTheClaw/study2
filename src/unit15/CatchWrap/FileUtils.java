package unit15.CatchWrap;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static void readFile(String filePath)  {
        System.out.println("Читаем содержимое файла " + filePath);

    }

    public static void writeFile(String filePath)  {
        System.out.println("Записываем данные в файл " + filePath);
    }
}
