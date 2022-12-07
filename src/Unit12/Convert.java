package Unit12;

public class Convert {
    public static void main(String[] args) {
        String string = "12.84";
        double i = 0;
        try {
            i = Double.parseDouble(string);
            System.out.println(Math.round(i));
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
