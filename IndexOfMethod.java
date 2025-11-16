import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class IndexOfMethod {
    public static void main(String[] args){
         // Definetion
         
        //  int indexOf(object o);

        //   Returns the index of the first occurrence of the specified element.
        //   Searches from left to right (beginning to end).
        //   If the element is not found, returns -1.

        //  int lastIndexOf(object o);

        //  - Returns the index of the last occurrence of the specified element.
        //  - Searches from right to left (end to beginning).
        //  - If the element is not found, returns -1



        // Create an ArrayList with an initial capacity of 10
        ArrayList<Integer> a1 = new ArrayList<>(10);

        // Add elements to the ArrayList
        a1.add(40); // Index 0
        a1.add(20); // Index 1
        a1.add(50); // Index 2
        a1.add(60); // Index 3
        a1.add(20); // Index 4 (duplicate of 20)
        a1.add(70); // Index 5
        a1.add(80); // Index 6

        // Print the entire ArrayList
        // Output: [40, 20, 50, 60, 20, 70, 80]
        System.out.println(a1);

        // Find and print the index of the first occurrence of element 20
        // indexOf() returns the index of the first match, which is 1
        System.out.println(a1.indexOf(20)); // Output: 1

        // Try to find the index of element 15
        // Since 15 is not in the list, indexOf() returns -1
        System.out.println(a1.indexOf(15)); // Output: -1

        // Find and print the index of the last occurrence of element 20
        // lastIndexOf() returns the index of the last match, which is 4
        System.out.println(a1.lastIndexOf(20)); // Output: 4
    }
}