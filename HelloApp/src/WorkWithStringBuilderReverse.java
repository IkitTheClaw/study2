public class WorkWithStringBuilderReverse {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder build = new StringBuilder(string);
        build.reverse();
        String result = build.toString();
        return result;
    }
}
