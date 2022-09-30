public class Test {

    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[7] = "Java";
        for (String string:strings){
            System.out.println(string);
        }
        System.out.println(strings[7].equals(strings[6]));
    }
}
