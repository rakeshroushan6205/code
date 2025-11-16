import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class RetainAllMethod {

    public static void main(String[] args) {
        
        // Create the first ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Create the second ArrayList to store Integer values
        ArrayList<Integer> a2 = new ArrayList<>();

        // Add elements to the first ArrayList (a1)
        a1.add(10); // Add 10
        a1.add(20); // Add 20
        a1.add(30); // Add 30
        a1.add(40); // Add 40

        // Add elements to the second ArrayList (a2)
        a2.add(10); // Add 10
        a2.add(20); // Add 20
        a2.add(50); // Add 50
        a2.add(60); // Add 60

        // Retain only the elements in a2 that are also present in a1
        // This removes all elements from a2 that are not found in a1
        // After this operation, a2 will contain only [10, 20]
        a2.retainAll(a1);

        // Print the updated contents of a2
        System.out.println(a2); // Output: [10, 20]
    }
}