public class Triple_massive_creation {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int[][] doubleArray:multiArray) {
            for (int[] singleArray:doubleArray){
                for (int array:singleArray){
                    System.out.print(array);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}