import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class Set_method {
    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Index 0
        a1.add(20); // Index 1
        a1.add(30); // Index 2
        a1.add(50); // Index 3

        // Print the original contents of the ArrayList
        // Output: [10, 20, 30, 50]
        System.out.println(a1);

        // Replace the element at index 2 with 60
        // This changes the value 30 to 60
        a1.set(2, 60);

        // Print the updated contents of the ArrayList
        // Output: [10, 20, 60, 50]
        System.out.println(a1);
    }
}