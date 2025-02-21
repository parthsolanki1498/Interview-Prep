package Fidelity;

public class SingletonClass {
    
    // volatile instance to ensure visibility and ordering of operations
    private static volatile SingletonClass instance;

    /* Explanation of each of the keyword above
    private - the private modifier specefies that the member can only be accessed in its own class
    static - used for memory management, belongs to class itself instead of instance, used for method that is same for every instance
    volatile - used to mark a Java variable as "being stored in the main memory" */

    // private constructor to prevent instantiation
    private SingletonClass() {}

     /* Constructor in Java is a speical method that is used to initalize objects. Called when object of calss is created. 
      * Can be used to set initial values for object attributes.
     */

     // Public method to get the instance (lazy init with double-checked locking)
     public static SingletonClass getInstance() {
        if(instance == null) {
            synchronized(SingletonClass.class) {
                if(instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
     }
    
     public void showMessage(){
        System.out.println("Hello from SingletonClass!!");
     }

     public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.showMessage();
     }
}