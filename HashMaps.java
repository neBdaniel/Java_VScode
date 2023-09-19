import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        // Create a HashMap with String keys and Integer values:
        HashMap<String, Integer> fruitInventory = new HashMap<>();

        // Add key-value pairs to HashMap:
        fruitInventory.put("apples", 5);
        fruitInventory.put("strawberries", 7);
        fruitInventory.put("oranges", 4);

        // Remove a key-value pair from HashMap:
        fruitInventory.remove("apples");

        // Access a value:
        System.out.println(fruitInventory.get("oranges")); // Prints: 4

        // Find HashMap size:
        System.out.println(fruitInventory.size()); // Prints: 2

        // Iterate over a HashMap:
        for (String key : fruitInventory.keySet()) {
        System.out.println("Key: " + key + ", Value: " + fruitInventory.get(key));
        }
        /* Prints:
        Key: strawberries, Value: 7
        Key: oranges, Value: 4
        */

        /*
        A HashMap is abuilt-in data structure that stores a collection of key-value pairs.
        Each key acts as a unique identifier for its associated value. In order to use this data structure,
        import the HashMap class at the top of the program.
         */
    }    
}
