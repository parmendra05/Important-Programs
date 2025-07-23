package others;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,3,5,6,3,6,3,3,7};
        int count =1;

        Map<Integer,Integer> hm=new HashMap<>();
        for(Integer a : arr) {
          if(hm.containsKey(a)) hm.put(a,hm.get(a)+1);
          else hm.put(a,1);
        }
        //System.out.println(hm);

        Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if (entry.getValue() > arr.length/2) {
                System.out.println( entry.getKey() +" -> "+entry.getKey());
                count++;
            }
        }
        if (count ==1) System.out.println(-1);


    }

}
