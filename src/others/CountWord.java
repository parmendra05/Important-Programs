package others;

import java.util.List;
import java.util.stream.Collectors;

public class CountWord {
    public static void main(String[] args) {
        List<String> words= List.of("BLR","HYD","MUM","Delhi","BLR","HYD","MUM","BLR");

        words.stream().collect(Collectors.groupingBy(e->e, Collectors.counting())).entrySet().stream()
                .forEach(a -> System.out.println(a +" times "+ a.getValue()));

    }
}
