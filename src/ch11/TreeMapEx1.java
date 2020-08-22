package ch11;

import java.util.*;

import static ch11.HashMapEx4.printBar;

public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A" , "K" , "A" , "K" , "D" , "k" , "K" , "A" , "K" , "K"};

        TreeMap map = new TreeMap();
        for (int i=0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i] , new Integer(value.intValue() + 1));
            } else {
                map.put(data[i] , new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();
        System.out.println("기본정렬");
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            int value = (int) e.getValue();
            System.out.println(e.getKey() + ":" + printBar('#' , value) + " " + value);
        }
        System.out.println();

        Set set = map.entrySet();
        List list = new ArrayList(set);

        Collections.sort(list , new ValueComparator());
        it = list.iterator();

        System.out.println("값의 크기가 큰 순서로 정렬");
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            int value = (int) e.getValue();
            System.out.println(e.getKey() + ":" + printBar('#' , value) + " " + value);
        }
    }

    static class ValueComparator implements Comparator {
        public int compare(Object o1 , Object o2) {
            if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;
                int v1 = (int) e1.getValue();
                int v2 = (int) e2.getValue();
                System.out.println(v1 + "," + v2);
                return v2 - v1;
            }
            return -1;
        }
    }

    static String printBar(char ch , int value) {
        char[] bar = new char[value];

        for (int i=0; i<bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);
    }
}
