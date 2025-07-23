package collection;

import java.util.*;
import java.util.function.BiFunction;

public class HashMapDemo {
    public static void main(String[] args) {

        // 1. Create a HashMap (Key: Integer, Value: String)
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() – Add key-value pairs
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Cherry");

        // 3. putIfAbsent() – Add only if key is not present
        map.putIfAbsent(103, "Coconut"); // won't overwrite
        map.putIfAbsent(104, "Date");

        // 4. get() – Get value for a key
        System.out.println("Value for key 102: " + map.get(102)); // Banana

        // 5. getOrDefault() – Return default if key not present
        System.out.println("Value for 105: " + map.getOrDefault(105, "Not Found")); // Not Found

        // 6. containsKey() – Check if key exists
        System.out.println("Contains key 101? " + map.containsKey(101)); // true

        // 7. containsValue() – Check if value exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana")); // true

        // 8. remove(key) – Remove by key
        map.remove(104);

        // 9. remove(key, value) – Remove if key-value pair matches
        map.remove(102, "Grapes"); // won't remove
        map.remove(102, "Banana"); // will remove

        // 10. replace(key, newValue) – Replace value if key exists
        map.replace(103, "Coconut");

        // 11. replace(key, oldValue, newValue) – Conditional replace
        map.replace(103, "Coconut", "Cherry");

        // 12. putAll() – Add all entries from another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.put(105, "Elderberry");
        newMap.put(106, "Fig");
        map.putAll(newMap);

        // 13. keySet() – Get all keys
        System.out.println("Keys: " + map.keySet());

        // 14. values() – Get all values
        System.out.println("Values: " + map.values());

        // 15. entrySet() – Get all entries
        System.out.println("Entries: " + map.entrySet());

        // 16. size() – Get map size
        System.out.println("Size: " + map.size());

        // 17. isEmpty() – Check if map is empty
        System.out.println("Is empty? " + map.isEmpty());

        // 18. clear() – Remove all entries
        HashMap<Integer, String> backup = new HashMap<>(map);
        map.clear();
        System.out.println("After clear(): " + map);

        // 19. clone() – Shallow copy
        @SuppressWarnings("unchecked")
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) backup.clone();
        System.out.println("Cloned map: " + clonedMap);

        // 20. forEach() – Java 8: loop using lambda
        System.out.print("forEach: ");
        clonedMap.forEach((k, v) -> System.out.print("[" + k + "=" + v + "] "));

        // 21. compute() – Compute value for key
        clonedMap.compute(105, (k, v) -> v + " Fruit");
        System.out.println("\nAfter compute(): " + clonedMap);

        // 22. computeIfAbsent() – Add only if key not present
        clonedMap.computeIfAbsent(107, k -> "Guava");
        System.out.println("After computeIfAbsent(): " + clonedMap);

        // 23. computeIfPresent() – Modify value if key exists
        clonedMap.computeIfPresent(106, (k, v) -> v.toUpperCase());
        System.out.println("After computeIfPresent(): " + clonedMap);

        // 24. merge() – Merge two values
        clonedMap.merge(107, " Juice", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge(): " + clonedMap);

        // 25. replaceAll() – Replace all values
        clonedMap.replaceAll((k, v) -> v.toLowerCase());
        System.out.println("After replaceAll(): " + clonedMap);

        // 26. equals() – Compare maps
        System.out.println("Equals to backup? " + clonedMap.equals(backup));

        // 27. hashCode() – Get hash code
        System.out.println("HashCode: " + clonedMap.hashCode());

        // 28. entrySet traversal with for-each
        System.out.println("Entries with for-each:");
        for (Map.Entry<Integer, String> entry : clonedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 29. keySet traversal with iterator
        System.out.print("Keys with Iterator: ");
        Iterator<Integer> keyItr = clonedMap.keySet().iterator();
        while (keyItr.hasNext()) {
            System.out.print(keyItr.next() + " ");
        }
        System.out.println();

        // 30. values traversal
        System.out.print("Values: ");
        for (String val : clonedMap.values()) {
            System.out.print(val + " ");
        }
    }
}
