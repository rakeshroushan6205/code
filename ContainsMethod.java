import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class ContainsMethod {

    public static void main(String[] args) {

        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Add 10 to the list
        a1.add(20); // Add 20 to the list
        a1.add(30); // Add 30 to the list

        // Check if the list contains the value 10
        // The contains() method returns true if the specified element is present
        boolean b = a1.contains(10);

        // Print the result of the contains check
        System.out.println(b); // Output: true
    }
}