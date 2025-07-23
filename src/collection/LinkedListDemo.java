package collection;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        // 1. Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // 2. add() - Adds element to the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list); // [Apple, Banana, Cherry]

        // 3. addFirst() - Adds element at beginning
        list.addFirst("Mango");
        System.out.println("After addFirst: " + list); // [Mango, Apple, Banana, Cherry]

        // 4. addLast() - Adds element at the end
        list.addLast("Orange");
        System.out.println("After addLast: " + list); // [Mango, Apple, Banana, Cherry, Orange]

        // 5. getFirst() - Retrieves first element
        System.out.println("First Element: " + list.getFirst()); // Mango

        // 6. getLast() - Retrieves last element
        System.out.println("Last Element: " + list.getLast()); // Orange

        // 7. get(index) - Get element by index
        System.out.println("Element at index 2: " + list.get(2)); // Banana

        // 8. set(index, value) - Replace element
        list.set(2, "Grapes");
        System.out.println("After set at index 2: " + list); // [Mango, Apple, Grapes, Cherry, Orange]

        // 9. remove() - Removes head
        list.remove();
        System.out.println("After remove(): " + list); // [Apple, Grapes, Cherry, Orange]

        // 10. removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list); // [Grapes, Cherry, Orange]

        // 11. removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list); // [Grapes, Cherry]

        // 12. add(index, element)
        list.add(1, "Lemon");
        System.out.println("After add at index 1: " + list); // [Grapes, Lemon, Cherry]

        // 13. contains()
        System.out.println("Contains Lemon? " + list.contains("Lemon")); // true

        // 14. indexOf()
        System.out.println("Index of Lemon: " + list.indexOf("Lemon")); // 1

        // 15. lastIndexOf()
        list.add("Cherry");
        System.out.println("Last index of Cherry: " + list.lastIndexOf("Cherry")); // 3

        // 16. size()
        System.out.println("Size: " + list.size()); // 4

        // 17. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty()); // false

        // 18. toArray()
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 19. toArray(T[])
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(stringArray));

        // 20. clone()
        LinkedList<String> cloneList = (LinkedList<String>) list.clone();
        System.out.println("Cloned List: " + cloneList);

        // 21. clear()
        cloneList.clear();
        System.out.println("After clear(): " + cloneList); // []

        // 22. offer() - Adds to end (returns true/false)
        list.offer("Pineapple");
        System.out.println("After offer(): " + list); // [Grapes, Lemon, Cherry, Cherry, Pineapple]

        // 23. offerFirst()
        list.offerFirst("Kiwi");
        System.out.println("After offerFirst(): " + list); // [Kiwi, Grapes, Lemon, Cherry, Cherry, Pineapple]

        // 24. offerLast()
        list.offerLast("Papaya");
        System.out.println("After offerLast(): " + list); // [Kiwi, Grapes, Lemon, Cherry, Cherry, Pineapple, Papaya]

        // 25. peek() - Retrieves head without removing
        System.out.println("Peek: " + list.peek()); // Kiwi

        // 26. peekFirst()
        System.out.println("Peek First: " + list.peekFirst()); // Kiwi

        // 27. peekLast()
        System.out.println("Peek Last: " + list.peekLast()); // Papaya

        // 28. poll() - Retrieves and removes head
        System.out.println("Poll: " + list.poll()); // Kiwi
        System.out.println("After poll: " + list);

        // 29. pollFirst()
        System.out.println("Poll First: " + list.pollFirst()); // Grapes
        System.out.println("After pollFirst: " + list);

        // 30. pollLast()
        System.out.println("Poll Last: " + list.pollLast()); // Papaya
        System.out.println("After pollLast: " + list);

        // 31. push() - Adds to head (stack behavior)
        list.push("Avocado");
        System.out.println("After push: " + list); // [Avocado, Lemon, Cherry, Cherry, Pineapple]

        // 32. pop() - Removes from head (stack behavior)
        String popped = list.pop();
        System.out.println("Popped: " + popped); // Avocado
        System.out.println("After pop: " + list);

        // 33. removeIf() - Java 8+
        list.removeIf(fruit -> fruit.equals("Cherry"));
        System.out.println("After removeIf Cherry: " + list); // Removes all "Cherry"

        // 34. replaceAll() - Java 8+
        list.replaceAll(fruit -> fruit.toUpperCase());
        System.out.println("After replaceAll to upper case: " + list);

        // 35. sort() - Java 8+
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort: " + list);

        // 36. forEach() - Java 8+
        System.out.print("List items: ");
        list.forEach(item -> System.out.print(item + " | "));
        System.out.println();

        // 37. subList()
        List<String> subList = list.subList(0, 2);
        System.out.println("SubList (0 to 2): " + subList);

        // 38. addAll()
        list.addAll(List.of("Fig", "Guava"));
        System.out.println("After addAll(): " + list);

        // 39. removeAll()
        list.removeAll(List.of("PINEAPPLE"));
        System.out.println("After removeAll(): " + list);

        // 40. retainAll()
        list.retainAll(List.of("GUAVA", "LEMON"));
        System.out.println("After retainAll(): " + list);
    }
}
