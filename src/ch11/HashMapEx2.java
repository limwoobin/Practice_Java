package ch11;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바" , 90);
        map.put("김자바" , 100);
        map.put("이자바" , 100);
        map.put("강자바" , 80);
        map.put("안자바" , 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + "," + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단:" + set);

        Collection value = map.values();
        it = value.iterator();

        int total = 0;
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("total:" + total);
        System.out.println("avg:" + (double) total/set.size());
        System.out.println("max:" + Collections.max(value));
        System.out.println("min:" + Collections.min(value));
    }
}
