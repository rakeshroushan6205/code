import java.util.*;
public class SwapTwoNumber {

    public static void main (String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); 
        list.add(9); 
        list.add(7); 
        list.add(6); 
        list.add(2); 
        list.add(1); 
       System.out.println("Before Swaping");
       System.out.println(list);
       int temp = list.get(3);
       list.set(3,list.get(1));
       list.set(1,temp);
       System.out.println("After Swaping");
       System.out.println(list);
    }
    
}
