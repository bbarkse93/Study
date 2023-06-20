package ex13;

import java.util.*;

public class VectorExample01 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(2);

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        System.out.println("벡터의 크기: " + vec.size());
        System.out.println("벡터의 용량" + vec.capacity());
        Collections.sort(vec);

        for (String s : vec)
            System.out.print(s + " ");
    }
}
