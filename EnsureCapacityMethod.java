import java.util.ArrayList;

public class EnsureCapacityMethod {

    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<Integer> a1 = new ArrayList<>();

        // Pre-allocate space for at least 10 elements
        a1.ensureCapacity(10);

        // Add elements to the list
        for (int i = 1; i <= 10; i++) {
            a1.add(i);
        }

        // Print the list
        System.out.println("ArrayList: " + a1);


        // Using constructor with initial capacity
        ArrayList<Integer> list1 = new ArrayList<>(10); // Capacity = 10, Size = 0
         
        // Using ensureCapacity
        ArrayList<Integer> list2 = new ArrayList<>();   // Default capacity (usually 10)
        list2.ensureCapacity(10);                       // Ensures capacity is at least 10
    }


}
