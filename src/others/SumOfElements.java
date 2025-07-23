package others;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,3,2,5,10);

        //Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        Integer sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

}
