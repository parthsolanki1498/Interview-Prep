package Fidelity.MarkerInterfaceExample;

public class AnnotationTest {
    

    public static void main(String[] args) {
        MyFeatureClass obj = new MyFeatureClass();

        // Check if our class is annotated correctly
        if(obj.getClass().isAnnotationPresent(SpecialFeature.class)) {
            obj.show();
        } else {
            System.out.println("Not that special of a class after all haha!");
        }
    }
}
