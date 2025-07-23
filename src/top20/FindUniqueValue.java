package top20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class FindUniqueValue {

    static void printUniqueElements(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,1,4,6,7,2,5,7,5,5,5,5,5,1,1);
        printUniqueElements(integers);
    }
}
