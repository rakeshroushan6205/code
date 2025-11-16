import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class ContainsAll_Method {
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
        a2.add(30); // Add 30
        a2.add(50); // Add 50

        // Check if a1 contains all elements of a2
        // containsAll() returns true only if every element in a2 is present in a1
        // Since 50 is not in a1, the result will be false
        boolean b = a1.containsAll(a2);

        // Print the result of the containsAll check
        System.out.println(b); // Output: false
    }
}