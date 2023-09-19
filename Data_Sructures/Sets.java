package Data_Sructures;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        // Create a HashSet of Strings:
        Set<String> shapes = new HashSet<String>();

        // Add items to a Set:
        shapes.add("square");
        shapes.add("triangle");
        shapes.add("circle"); 

        // Remove a value:
        shapes.remove("square");

        // Check for a value:
        System.out.println(shapes.contains("circle")); // Prints: true

        // Finding the size of a Set:
        System.out.println(shapes.size()); // Prints: 2

        // Iterate through a Set:
        for (String item: shapes) {
        System.out.println(item);
        }
        /* Prints:
        triangle
        circle
        */


        // WHAT IS SETS?
        /**
        A Set is a built-in data structure that stores an unordered collection of unique values. 
        A Set can only store reference type values.There are multiple implementations of a Set: the HashSet, 
        the TreeSet, and the LinkedHashSet. While these classes share the similarities of storing unique objects 
        and having access to the same methods, there are a few differences between the three that impact the 
        order items appear within the structure as well as the runtime of some of the methods. In order to utilize 
        a Set and its associated operations, import its class at the top of the program.
         */
    }
}
