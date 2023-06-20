package ex13;

import java.util.Vector;

public class VectorTest<T> {

    public static void main(String[] args) {

        Vector<Object> vc = new Vector<Object>();

        vc.add("Hello World!");
        vc.add(20);
        vc.add(1.5);

        System.out.println("Vector Size: " + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("Vector Element " + i + ": " + vc.get(i));
        }

        String s = (String) vc.get(0);
        System.out.println(s);
    }
}
