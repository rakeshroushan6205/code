import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class RemoveMethod {

    public static void main(String[] args) {

        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Add 10 to the list
        a1.add(20); // Add 20 to the list
        a1.add(30); // Add 30 to the list
        a1.add(40); // Add 40 to the list
        a1.add(50); // Add 50 to the list
        a1.add(60); // Add 60 to the list

        // Print the original list
        System.out.println(a1); // Output: [10, 20, 30, 40]

        // Remove the element at index 2 (which is 30)
        a1.remove(2);

        // Remove the element at index 0 (which is now 10)
        a1.remove(0);

        // Print the updated list
        System.out.println(a1); // Output: [20, 40]

        


    }
}