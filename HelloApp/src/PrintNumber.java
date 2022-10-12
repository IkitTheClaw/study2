public class PrintNumber {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.println(i);
                Thread.sleep(1, 300000);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
