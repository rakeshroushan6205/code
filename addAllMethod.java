import java.util.ArrayList; // Import the ArrayList class from java.util package

public class addAllMethod {
    public static void main(String[] args){

        // Create first ArrayList of Integer type
        ArrayList<Integer> a1 = new ArrayList<>();

        // Create second ArrayList of Integer type
        ArrayList<Integer> a2 = new ArrayList<>();

        // Create third ArrayList of Integer type
        ArrayList<Integer> a3 = new ArrayList<>();

        // Add elements to the first ArrayList (a1)
        a1.add(10); // Add 10
        a1.add(20); // Add 20
        a1.add(30); // Add 30
        a1.add(40); // Add 40

        // Add a single element to the second ArrayList (a2)
        a2.add(60); // Add 60

        // Add all elements from a1 to a2 using addAll(Collection)
        // This appends all elements of a1 to the end of a2
        a2.addAll(a1);

        // Print the contents of a2
        // Expected output: [60, 10, 20, 30, 40]
        System.out.println(a2);

        // Add elements to the third ArrayList (a3)
        a3.add(70); // Add 70
        a3.add(80); // Add 80
        a3.add(90); // Add 90

        // Add all elements from a1 to a3 starting at index 1
        // This inserts the elements of a1 at position 1, shifting existing elements to the right
        a3.addAll(1, a1);

        // Print the contents of a3
        // Expected output: [70, 10, 20, 30, 40, 80, 90]
        System.out.println(a3);
    }
}