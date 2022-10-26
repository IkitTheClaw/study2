import java.util.Arrays;

public class FromHexToBinaryConverter {
    final static String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    final static String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    //7ac --- 7(0111) a (1010) c (1100) = 0111 1010 1100
    public static String toHex(String binaryNumber) {
        String HEX = "0123456789abcdef";
        String hexNumber = "";
        double DecimalNumber = 0;

        if (binaryNumber == null || binaryNumber.equals("")) {                                                                // проверка на пустоту
            return hexNumber;
        }

        if (((binaryNumber.length()) % 4) != 0) {
            int needzer = 4 - (binaryNumber.length() % 4);                                                    // добавляем нули в начало строки двоичного если требуется (длина строки стала кратной 4)
            for (int i = 0; i < needzer; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.replace("1","").replace("0","").length()!=0){              // if (binaryNumber != 0||binaryNumber !=1){
                return "";
            }
            int index = binaryNumber.length() - 1 - i;                                                              //ZOG ... конвертируем двоичную в десятичную как в BinaryConverter
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            DecimalNumber = DecimalNumber + value * Math.pow(2, i);
        }
        int DoubleDecimalNumber = (int) DecimalNumber;
        do {
            hexNumber = HEX.charAt(DoubleDecimalNumber % 16) + hexNumber;
            DoubleDecimalNumber /= 16;
        }
        while (DoubleDecimalNumber != 0);                                                                         //ZOG ... конвертируем десятичную в шестнадцатиричную систему как в ToHexConverter
        return hexNumber;
    }

    //a7d
    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.equals("")) {                                                                // проверка на пустоту
            return binaryNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            String currentChar = String.valueOf(hexNumber.charAt(i));
            if (Arrays.asList(hex).contains(currentChar)) {
                binaryNumber = getBinary(binaryNumber, currentChar);
            } else {
                return "";
            }
        }
        return binaryNumber;
    }

    private static String getBinary(String binaryNumber, String currentChar) {
        for (int j = 0; j < hex.length; j++) {
            if (hex[j].equals(currentChar)) {
                binaryNumber += binary[j];
                break;
            }
        }
        return binaryNumber;
    }
}







