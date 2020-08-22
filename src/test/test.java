package test;

import java.util.HashMap;
import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        String a = "935a2cdd-3d5c-4fc2-a7b0-18e462f5239f";
        String b = "bde14643-6ce2-469c-93ff-1d1d948ed85c";
        System.out.println(a.length());
        System.out.println(b.length());

        // 헤더토큰값 36
        Hashtable table = new Hashtable();
        table.put("a" , 1);
        table.put("b" , 2);

        HashMap map = new HashMap();
        map.put("A" , 1);
        map.put("B" , 2);
        System.out.println(table);
        System.out.println(map);
    }
}
