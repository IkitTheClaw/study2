public class Convertor {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalnum = 0;
        int i = 0;                                                                                   //i равно 0
        if (decimalNumber <= 0) {
            return 0;
        }
        while (decimalNumber != 0) {                                                                  //while(десятичное число не равно 0) {
            octalnum = (int) (octalnum + (decimalNumber % 8) * (Math.pow(10,i)));                    //восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
            decimalNumber = octalnum / 8;                                                           //десятичное число = десятичное число / 8
            i++;                                                                                   //i увеличиваем на 1
        }                                                                                         //}
            return octalnum;

        }

        public static int toDecimal ( int octalNumber){
        int decim = 0;
        int i = 0;                                                                                  //i равно 0
        if (octalNumber <=0) {
            return 0;
        }
        while (octalNumber != 0){                                                                      //while(восьмеричное число не равно 0) {
            decim = (int) ( decim + (octalNumber % 10) * (Math.pow(8,i)));                            //десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
            octalNumber = octalNumber / 10;                                                          //восьмеричное число = восьмеричное число / 10
            i++;                                                                                    //i увеличиваем на 1
        }                                                                                          //}
            return decim;
        }
    }


