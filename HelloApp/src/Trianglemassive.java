public class Trianglemassive {
    public static int[][] result = new int[10][];
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0;i < result.length;i++){
            result[i] = new int[num];
            num++;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <result[i].length;j++){
                result[i][j] = i + j;
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
