package ust;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer, Long> occurrence = array.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        occurrence.forEach((k,v) -> System.out.println("Elements :"+k+"  ->  "+v+" Times"));
        
        
    }
    
   
}
