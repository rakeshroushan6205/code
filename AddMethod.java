import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class AddMethod {
    public static void main(String[] args){
        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Add 10 to the list
        a1.add(20); // Add 20 to the list
        a1.add(30); // Add 30 to the list
        a1.add(40); // Add 40 to the list

        // Insert 50 at index 1 (between 10 and 20)
        a1.add(1, 50); // The list becomes [10, 50, 20, 30, 40]

        // Print the contents of the ArrayList
        System.out.println(a1); // Output: [10, 50, 20, 30, 40]
    }
}