import java.util.Arrays;
import java.util.StringTokenizer;

public class Separete {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tok = new StringTokenizer(query, delimiter);
        String[] tokens = new String[tok.countTokens()];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tok.nextToken();
        }
        return tokens;
    }
}
