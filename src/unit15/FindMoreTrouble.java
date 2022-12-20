package unit15;

public class FindMoreTrouble {
    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement info : stackTrace) {
            System.out.printf(String.format(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(), info.getClassName(), info.getFileName()));
        }
    }

    static void makeScrewdriver() {
        addJuice();


    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

