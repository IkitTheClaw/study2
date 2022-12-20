package unit15;

import java.util.LinkedList;
import java.util.List;


public class Stack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0,s);
    }

    public String pop() {
        if(storage.size()==0){
            return null;
        }
        var temp = storage.get(0);
        storage.remove(0);
        return temp;
    }

    public String peek() {
        if(storage.size()==0){
            return null;
        }
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
