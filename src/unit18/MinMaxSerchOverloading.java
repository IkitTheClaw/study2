package unit18;

public class MinMaxSerchOverloading {
    public static int min(int i, int j) {
        return Math.min(i, j);
    }

    public static int min(int i, int j, int d) {
        return Math.min(min(i, j), d);
    }

    public static int min(int i, int j, int d, int h) {
        return Math.min(min(i, j, d), h);
    }

    public static int min(int i, int j, int d, int h, int g) {
        return Math.min(min(i, j, d, h), g);
    }

     public static int max(int i, int j) {
        return Math.max(i, j);
    }

    public static int max(int i, int j, int d) {
        return Math.max(max(i, j), d);
    }

    public static int max(int i, int j, int d, int h) {
        return Math.max(max(i, j, d), h);
    }

    public static int max(int i, int j, int d, int h, int g) {
        return Math.max(max(i, j, d, h), g);
    }
}
