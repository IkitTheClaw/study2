public class ToHexConverter {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
            String hexNumber = "";
        while (decimalNumber != 0 ) {                                                                      //while(десятичное число не равно 0) {
            hexNumber =  HEX.charAt(decimalNumber % 16) + hexNumber;                                      // представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
                                                                                                         //+ представление шестнадцатеричного числа
            decimalNumber = decimalNumber/16;                                                   //десятичное число = десятичное число / 16
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if (hexNumber == null ||hexNumber.isBlank())  {
            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++) {                                                      //for (int i = 0; i < длина входящей строки; i++) {
            decimal = 16 * decimal + HEX.indexOf(hexNumber.charAt(i));                                      //десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
        }
        return decimal;
    }
}




        // 4e8 = (4*16^2)+(14*16^1)+ (8*16^0) = 1024 + 224 + 128 = 1376
