import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class ClearMethod {

    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Add 10 to the list
        a1.add(20); // Add 20 to the list
        a1.add(30); // Add 30 to the list
        a1.add(40); // Add 40 to the list

        // Print the contents of the ArrayList before clearing
        System.out.println(a1); // Output: [10, 20, 30, 40]

        // Clear all elements from the ArrayList
        a1.clear(); // This removes all elements from the list

        // Print the contents of the ArrayList after clearing
        System.out.println(a1); // Output: []
    }
}