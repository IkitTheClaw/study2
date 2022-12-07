package unit13.test;

import java.util.ArrayList;
import java.util.Collection;

public class Testus<T> {
    public Collection <T> foo(T type){
        ArrayList<T> list = new ArrayList<>();
        list.add(type);
        return list;
    }
}