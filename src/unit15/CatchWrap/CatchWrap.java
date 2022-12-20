package unit15.CatchWrap;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
public class CatchWrap {


    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (Exception fileNotFoundException){
            throw new RuntimeException(fileNotFoundException);
        }
    }
}


