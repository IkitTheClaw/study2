import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {


    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] examparray = new String[6];                      //создали масив examparray длиной 6
        strings = new String[]{"java","world", "hello", "java", "hello", "anime"};                                  // создали масив strings длиной 6
        String[] reservarray = new String[6];
        /* for (int i = 0; i < strings.length; i++) {              //занесли с консоли значение ячеек strings
           strings[i] = console.nextLine();
        }*/
        for (int i = 0; i < strings.length; i++) {              //инициализировали масив строк examparray равный strings
            examparray[i] = strings[i];
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < examparray.length; j++) {      // сравниваем строки первого и второго масива меняя первый
                if (strings[i].equals(examparray[j])) {
                    reservarray[i] = null;                     // найти способ чтобы i менялось в конце пробега по j????сделать 3ий масив с исправлеными строками и затем сравнить его с первым?
                } else {
                    reservarray[j] = strings[i];
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {            //выводим на экран
            System.out.println(reservarray[i]);
        }
    }
}