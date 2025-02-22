public class HashSetDemo {


    public static void main(String[] args) {
        CustomHashSet<Integer> mySet = new CustomHashSet<>();
        
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);

        System.out.println(mySet.contains(20)); // True
        System.out.println(mySet.contains(40)); // False

        mySet.remove(20);
        System.out.println(mySet.contains(20)); // False
    }
    
}
