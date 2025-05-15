package top20;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfString {
    public static Map<Character , Integer> findOccurrence(String str){

        char[] chars = str.toCharArray();

        Map<Character , Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                    else map.put(ch,1);
        }
        return map;
    }

    public static void main(String[] args) {
        String str ="javaprogram";
        System.out.println(findOccurrence(str));
    }
}
