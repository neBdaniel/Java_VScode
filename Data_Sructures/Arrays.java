package Data_Sructures;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args){
        // Create an ArrayList that stores Strings:
        ArrayList<String> months = new ArrayList<String>();

        // Add values to the end of the ArrayList:
        months.add("January");
        months.add("March");

        // Add values to a specified index in the ArrayList:
        months.add(1, "February");

        // Access a value from the ArrayList:
        System.out.println(months.get(0)); // Prints: January

        // Remove a value from the ArrayList:
        months.remove("February");
        months.remove(0); // Removes the zeroeth element

        //WHAT IS ARRAYS?
        /**
        An ArrayList is a built-in data structure that uses a dyunamic array to store its elements.
        In order to use this data structure, you must import java.util.ArrayList at the top of your 
        program.
         */
    } 
}
