package hashmap.customhashmap;

import java.util.LinkedList;

class Entry {
    int key, value;

    Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class CustomHashMap {
    private static final int SIZE = 16;
    private LinkedList<Entry>[] table;

    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public Integer get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }
}

