package dailly_practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {

        //01: Find the Occurrence of character
        String str= "Parmendra";

        Map<Object , Long> occurrence = str.chars().mapToObj( c-> (char)c)
                .collect(Collectors.groupingBy(c->c , Collectors.counting()));
        occurrence.forEach((k,v) -> System.out.println("Character : "+k+"  ->  "+v+" times"));

        System.out.println("-----------------------------------------");
        //02: Find Occurrence of Number
        List<Integer> integers = List.of(1,2,2,9,3,4,5,9,3,5,6,7,8,9);

        Map<Integer , Long> integerLongMap = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        integerLongMap.forEach((k,v) -> System.out.println("Integer : "+k+"  ->  "+v+" times"));

        //02: Find Occurrence of Number 9 only
        Long nine = integers.stream().filter(i -> i==9).count();
        System.out.println("Occurrence of 9 is : "+nine);
    }
}
