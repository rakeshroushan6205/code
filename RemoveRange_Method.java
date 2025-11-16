import java.util.ArrayList; // Import the ArrayList class from the java.util package

// Create a subclass of ArrayList to expose the protected removeRange() method
class MyArrayList<E> extends ArrayList<E> {
    // Public wrapper method to call the protected removeRange() method
    public void removeRangePublic(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex); // Removes elements from fromIndex (inclusive) to toIndex (exclusive)
    }
}

public class RemoveRange_Method {

    public static void main(String[] args) {
        // Create an instance of the custom subclass
        MyArrayList<Integer> list = new MyArrayList<>();

        // Add integers 1 to 10 to the list
        for (int i = 1; i <= 10; i++) {
            list.add(i); // Adds i to the list
        }

        // Print the list before removing elements
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("Before removeRange: " + list);

        // Remove elements from index 2 (inclusive) to 5 (exclusive)
        // This removes 3, 4, and 5 from the list
        list.removeRangePublic(2, 5);

        // Print the list after removing elements
        // Output: [1, 2, 6, 7, 8, 9, 10]
        System.out.println("After removeRange: " + list);
    }

}
