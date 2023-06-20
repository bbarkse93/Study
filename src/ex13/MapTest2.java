package ex13;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("Kim", "1234", "Park", "pass", "Lee", "word");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key=" + key + ", value = " + value);
        }
        // map.put("Choi", "password");
        map.remove("pass");
        // map.get(map);
        System.out.println(map);
    }
}
