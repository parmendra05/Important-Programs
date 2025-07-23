package collection;
import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        // 1. Create a HashSet of Strings
        HashSet<String> set = new HashSet<>();

        // 2. add() - Adds elements (returns false if duplicate)
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, won't be added
        set.add(null);    // HashSet allows one null
        System.out.println("Initial set: " + set);

        // 3. size() - Get the size
        System.out.println("Size: " + set.size());

        // 4. isEmpty() - Check if empty
        System.out.println("Is empty? " + set.isEmpty());

        // 5. contains() - Check if element exists
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // 6. remove() - Remove an element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 7. clear() - Remove all elements
        HashSet<String> temp = new HashSet<>(set); // create backup copy
        set.clear();
        System.out.println("After clear(): " + set);

        // 8. addAll() - Add multiple elements from another collection
        set.addAll(Arrays.asList("Dog", "Cat", "Parrot", "Elephant"));
        System.out.println("After addAll(): " + set);

        // 9. removeAll() - Remove all matching elements
        set.removeAll(Arrays.asList("Dog", "Cat"));
        System.out.println("After removeAll(): " + set);

        // 10. retainAll() - Keep only matching elements
        set.retainAll(Arrays.asList("Elephant"));
        System.out.println("After retainAll(): " + set);

        // 11. clone() - Shallow copy of set
        @SuppressWarnings("unchecked")
        HashSet<String> cloned = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + cloned);

        // 12. equals() - Compare sets
        System.out.println("Set equals cloned? " + set.equals(cloned));

        // 13. hashCode() - Hash code of set
        System.out.println("Hash code: " + set.hashCode());

        // 14. iterator() - Traverse using iterator
        Iterator<String> itr = set.iterator();
        System.out.print("Iterator traversal: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " | ");
        }
        System.out.println();

        // 15. forEach() - Java 8+
        System.out.print("forEach traversal: ");
        set.forEach(item -> System.out.print(item + " | "));
        System.out.println();

        // 16. removeIf() - Java 8+
        set.add("Duck");
        set.add("Donkey");
        set.removeIf(animal -> animal.startsWith("D"));
        System.out.println("After removeIf (starts with D): " + set);

        // 17. stream() - Java 8+
        long count = set.stream().count();
        System.out.println("Stream count: " + count);

        // 18. spliterator() - For parallel traversal
        Spliterator<String> spliterator = set.spliterator();
        System.out.print("Spliterator output: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        // 19. toArray() - Convert to Object array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 20. toArray(T[]) - Convert to typed array
        String[] typedArray = set.toArray(new String[0]);
        System.out.println("Typed array: " + Arrays.toString(typedArray));
    }
}
