package hashmap.customhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);

        System.out.println("Value for key 2: " + hashMap.get(2));
        hashMap.remove(2);
        System.out.println("Value for key 2 after removal: " + hashMap.get(2));
    }
}

