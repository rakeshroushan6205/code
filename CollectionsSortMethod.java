import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMethod {

    public static void main(String[] args) {
         ArrayList<Integer> a1 = new ArrayList<>();

       
         
        // Add elements to the first ArrayList (a1)
        a1.add(30); // Add 30
        a1.add(10); // Add 10
        a1.add(50); // Add 50
        a1.add(20); // Add 20
        a1.add(40); // Add 40
        
        System.out.println("Before sorting :");
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println("After sorting :");
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());
         System.out.println(a1); 
        
    }
    
}
