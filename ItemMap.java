import java.util.HashMap;

public class ItemMap {
    private HashMap<String, Integer> map;

    public ItemMap() {
        map = new HashMap<String, Integer>();
    }

    public void put(String item, int quantity) {
        if (map.containsKey(item)) {
            map.put(item, map.get(item) + quantity);
        } else {
            map.put(item, quantity);
        }
    }

    public void remove(String item, int quantity) {
        if (map.containsKey(item)) {
            int currQuantity = map.get(item);
            if (currQuantity > quantity) {
                map.put(item, currQuantity - quantity);
            } else {
                map.remove(item);
            }
        }
    }

    public int getQuantity(String item) {
        if (map.containsKey(item)) {
            return map.get(item);
        } else {
            return 0;
        }
    }

    public boolean contains(String item) {
        return map.containsKey(item);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }
}