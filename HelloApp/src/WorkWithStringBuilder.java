public class WorkWithStringBuilder {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder build = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            build.append(strings[i]);
        }
            return build;
        }


    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder build = new StringBuilder(string);
        build.replace(start,end,str);
        return build;
    }
}


