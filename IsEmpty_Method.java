import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class IsEmpty_Method {

    public static void main(String[] args) {
        // Create two ArrayLists to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        // Add elements to the first ArrayList (a1)
        a1.add(10); // Add 10
        a1.add(20); // Add 20

        // Check if a1 is empty
        // Since a1 contains elements, isEmpty() will return false
        boolean b = a1.isEmpty();
        System.out.println(b); // Output: false

        // Check if a2 is empty
        // Since a2 has no elements, isEmpty() will return true
        boolean b1 = a2.isEmpty();
        System.out.println(b1); // Output: true
    }
}