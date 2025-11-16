import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class Size_Method {

    public static void main(String[] args) {
        
        // Create an ArrayList to store Integer values
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(10); // Add 10 to the list
        a1.add(20); // Add 20 to the list
        a1.add(30); // Add 30 to the list

        // Get the number of elements in the ArrayList using size() method
        int i = a1.size(); // size() returns the total number of elements in the list

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList : " + i); // Output: Size of ArrayList : 3
    }
}