

// HashSet contains() function without using the inbuilt one

import java.util.LinkedList;

public class CustomHashSet<T> {
    
    private static final int DEFAULT_CAPACITY = 16; // Default size of HashTable
    private LinkedList<T>[] buckets;                // Array of the linked lists for chain

    public CustomHashSet() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for(int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    // Hash function to determine the bucket index
    private int getBucketIndex(T key) {
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    // Adds an element to the HashSet
    public void add(T key) {
        int index = getBucketIndex(key);
        if(!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    // Custom Implementaion of contains()
    public boolean contains(T key) {
        int index = getBucketIndex(key);
        for(T item : buckets[index]) {
            if(item.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Removes an element from the HashSet
    public void remove(T key) {
        int index = getBucketIndex(key);
        buckets[index].remove(key);
    }


    
    
}
