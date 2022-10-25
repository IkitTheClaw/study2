public class ArrayWithUnicode {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        char[] array = {'\u00A9','\u004A','\u0061','\u0076','\u0061','\u0052','\u0075','\u0073','\u0068'};
        System.arraycopy(array, 0, symbols ,0, array.length);
    }
}


