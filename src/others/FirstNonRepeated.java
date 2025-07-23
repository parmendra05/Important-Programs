package others;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String word ="swiss";

        Map<Character , Long> map = word.chars().mapToObj( c-> (char)c )
                .collect(Collectors.groupingBy(c-> c , LinkedHashMap::new,Collectors.counting()));
        // Taking LinkedHashMap to preserve the insertion order;

        System.out.println(map); // to print the map including key and value

        // First Non Repeated Character
        Optional<Character> uniqueElement= map.entrySet().stream().filter(e -> e.getValue() ==1).map(Map.Entry::getKey).findFirst();

        if (uniqueElement.isPresent()) System.out.println(uniqueElement);
        else System.out.println("No Unique value present");

        // Second Non Repeated Character
        Optional<Character> secondNonRepElement = map.entrySet().stream().filter(e -> e.getValue() ==1).map(Map.Entry::getKey).skip(1).findFirst();

    }
}
