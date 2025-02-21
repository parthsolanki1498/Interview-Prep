package Fidelity.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/*
 * ConcurrentHashMap is a thread-safe, high performance implementation of HashMap in Java. 
 * Unlike HashMap, which is not thread-safe and Hashtable which is fully sync but slow,
 * ConcurrentHashMap provides concurrent read and write operations without locking the entire map
 */
public class ConcurrentHashMapExample {
    
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);

        // Retrieving a value
        System.out.println("Apple Count: " + map.get("Apple"));

        // Using computeIfAbsent for atomic insert
        map.computeIfAbsent("Orange", k -> 15);
        System.out.println("Orange Count: " + map.get("Orange"));

        // Concurrent Updates
        map.putIfAbsent("Grapes", 25);
        map.replace("Banana", 20, 30);

        System.out.println("Final Map: " + map);
    }
}
