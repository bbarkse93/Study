package ex13;

import java.util.ArrayList;

public class ArrayTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Grape");
        list.add("StrawBerry");

        int index = list.indexOf("Mango");

        System.out.println("망고의 위치: " + index);
    }
}