package Unit14;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class ALot {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        HashSet<String> set = new HashSet<>();
        for(String str:words){
            set.add(str);
        }
        int i = 0;
        if (set.contains(word)){
            i++;
        }
        if (i>0){
            System.out.println("Слово"+" "+word+" "+"есть в множестве");
        }
        else {
            System.out.println("Слова" +" "+ word +" "+ "нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}

