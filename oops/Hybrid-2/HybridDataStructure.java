import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HybridDataStructure {
    private Map<String, String> map;
    private LinkedList<String> order;

    public HybridDataStructure() {
        map = new HashMap<>();
        order = new LinkedList<>();
    }
    public void add(String key, String value) {
        if (!map.containsKey(key)) {
            order.add(key);
        }
        map.put(key, value);
    }
    public String get(String key) {
        return map.get(key);
    }
    public void printInsertionOrder() {
        for (String key : order) {
            System.out.println(key + ": " + map.get(key));
        }
    }
    public static void main(String[] args) {
        HybridDataStructure hybrid = new HybridDataStructure();
        hybrid.add("A", "Apple");
        hybrid.add("B", "Banana");
        hybrid.add("C", "Cherry");
        hybrid.printInsertionOrder();
    }
}
