import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class GetMethod {

    public static void main(String[] args){
        // Create an ArrayList with an initial capacity of 10
        ArrayList<Integer> a1 = new ArrayList<>(10);

        // Add integers 1 to 10 to the ArrayList using a loop
        for(int i = 1; i <= 10; i++){
            a1.add(i); // Adds i to the list
        }

        // Print the entire ArrayList
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(a1);

        // Retrieve and print the element at index 8
        // Indexing starts from 0, so this will print the 9th element (which is 9)
        System.out.println(a1.get(8)); // Output: 9
    }
}