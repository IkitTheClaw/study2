public class Multiplicationtable {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        int vert = 0;
        int num = 1;
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {                        //вертикаль
            int temp = 0;
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                temp++;                                                         //горизонталь
                MULTIPLICATION_TABLE[i][j] = temp;
                    if (j == 0) {
                        MULTIPLICATION_TABLE[i][j] = num++;
                        vert++;
                    }
                    if (i != 0 && j != 0) {
                        MULTIPLICATION_TABLE[i][j] = vert * temp;
                    }
                }
            }
            for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
                for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                    System.out.print(MULTIPLICATION_TABLE[i][j] + " ");//напишите тут ваш код
                }
                System.out.println();
            }
        }
    }


