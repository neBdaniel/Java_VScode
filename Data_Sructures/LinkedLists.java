package Data_Sructures;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args){
        // Create a LinkedList that stores Strings:
        LinkedList<String> days = new LinkedList<String>();

        // Add values to the end of the LinkedList:
        days.add("Monday");
        days.add("Tuesday");

        // Add values to a specified index in the LinkedList:
        days.add(0, "Sunday");

        // Access a value from the LinkedList:
        System.out.println(days.get(0)); // Prints: Sunday

        // Remove a value from the LinkedList:
        days.remove("March");
        days.remove(1); // Removes the element at index 1
        days.remove(); // Removes the first element in the LinkedList

        /**
        
        A LinkedList is a built-in data structure that uses a doubly linked list to store its elements.
        In orderr to use this data structure, you must import java.util.LinkedList at the top of your
        program.
         */
    } 
}
