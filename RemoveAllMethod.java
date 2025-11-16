import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class RemoveAllMethod {

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

        // Remove all elements from a2 that are also present in a1
        // In this case, 10 and 20 are common in both lists, so they will be removed from a2
        a2.removeAll(a1);

        // Print the updated contents of a2
        // Expected output: [50, 60] since 10 and 20 were removed
        System.out.println(a2);
    }
}