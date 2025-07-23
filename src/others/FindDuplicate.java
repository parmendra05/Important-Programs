package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 5, 6, 3, 6, 3, 3, 7};

       Map<Object, Long> map= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting()));

        System.out.println(map);
        System.out.println(map.size());

        map.entrySet().stream().filter( a -> a.getValue()>1).forEach(e -> System.out.println("Key : " +e.getKey() +" -> times "+e.getValue()));
    }
}
