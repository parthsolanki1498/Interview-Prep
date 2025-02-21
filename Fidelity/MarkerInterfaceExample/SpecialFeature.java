package Fidelity.MarkerInterfaceExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
 * A Marker Interface is an interface that does not have any methods or fields but is used to indicate or 
 * "mark" a class for special behavior at runtime. It acts as a tag that gives metadata to the Java Compiler or JVM
 * 
 * Example - Serializable, Cloneable, Remote
 */

@Retention(RetentionPolicy.RUNTIME) // Retain at runtime for reflection
@Target(ElementType.TYPE) // Can be applied to classes only

public @interface SpecialFeature {
    
} 
