import java.util.*; // Imports all classes from java.util package, including ArrayList

public class MultiDimentionArrayList { // Class name (note: typo in "Dimention" should be "Dimension")

    public static void main(String[] args) {
        // Creating three individual ArrayLists to hold Integer values
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Creating a main list that holds other ArrayLists (2D ArrayList)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Populating list1 with numbers 1 to 5
        // Populating list2 with double of 1 to 5
        // Populating list3 with triple of 1 to 5
        for (int i = 1; i <= 5; i++) {
            list1.add(i);       // Adds 1, 2, 3, 4, 5
            list2.add(i * 2);   // Adds 2, 4, 6, 8, 10
            list3.add(i * 3);   // Adds 3, 6, 9, 12, 15
        }

        // Adding all three lists to the mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing the entire mainList structure
        System.out.println(mainList); // Output: [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]

        // Iterating through each list inside mainList and printing elements line by line
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> list = mainList.get(i); // Get each sublist
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " "); // Print each element in the sublist
            }
            System.out.println(); // New line after each sublist
        }
    }
}