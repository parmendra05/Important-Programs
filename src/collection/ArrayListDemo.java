package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<String> list = new ArrayList<>(); // Initial size is 0

        // 2. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Allows duplicates
        list.add(null);    // Allows nulls

        // 3. Print list
        System.out.println("Initial List: " + list);

        // 4. Add element at specific index
        list.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + list);

        // 5. Get element
        System.out.println("Element at index 2: " + list.get(2));

        // 6. Set element
        list.set(0, "Kiwi");
        System.out.println("After setting index 0 to Kiwi: " + list);

        // 7. Remove by index
        list.remove(3); // Removes Cherry
        System.out.println("After removing element at index 3: " + list);

        // 8. Remove by value
        list.remove("Apple"); // Removes first occurrence
        System.out.println("After removing 'Apple': " + list);

        // 9. Check if list contains an element
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 10. Get index of an element
        System.out.println("Index of null: " + list.indexOf(null));

        // 11. Last index of a duplicate
        list.add("Mango");
        System.out.println("Last index of Mango: " + list.lastIndexOf("Mango"));

        // 12. List size
        System.out.println("Size of list: " + list.size());

        // 13. Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 14. Create a shallow copy (clone)
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned List: " + clonedList);

        // 15. Convert to Array
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 16. Convert to specific type Array
        String[] strArray = list.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(strArray));

        // 17. Iterate using forEach (Java 8+)
        System.out.print("Iterating using forEach: ");
        list.forEach(item -> System.out.print(item + " | "));
        System.out.println();

        // 18. ReplaceAll (Java 8+)
        list.replaceAll(s -> s == null ? "Empty" : s.toUpperCase());
        System.out.println("After replaceAll to uppercase: " + list);

        // 19. RemoveIf (Java 8+)
        list.removeIf(s -> s.startsWith("M"));
        System.out.println("After removeIf (starting with M): " + list);

        // 20. Sort list (Java 8+)
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);

        // 21. SubList
        List<String> sub = list.subList(0, 2); // [start, end)
        System.out.println("SubList (0 to 2): " + sub);

        // 22. Ensure Capacity (performance tip)
        list.ensureCapacity(100); // avoid resizing overhead

        // 23. Trim to size (optimize memory)
        list.trimToSize();

        // 24. Clear list
        list.clear();
        System.out.println("After clear(): " + list);

        // 25. AddAll (bulk add)
        List<String> newItems = List.of("Dog", "Cat", "Parrot");
        list.addAll(newItems);
        System.out.println("After addAll(): " + list);

        // 26. RemoveAll
        list.removeAll(List.of("Cat"));
        System.out.println("After removeAll(): " + list);

        // 27. RetainAll
        list.retainAll(List.of("Dog")); // keeps only Dog
        System.out.println("After retainAll(): " + list);
    }
}
