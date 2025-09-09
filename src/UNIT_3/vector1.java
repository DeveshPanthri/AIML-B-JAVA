package UNIT_3;

import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(1); // Initial capacity of 1
        vec.add("First");
        vec.add("2nd");
        vec.add("3rd");
        vec.add("4th");

        System.out.println("Capacity: " + vec.capacity());
        System.out.println("Size: " + vec.size());
    }
}