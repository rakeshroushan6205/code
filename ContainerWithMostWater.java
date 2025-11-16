import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {

    public static int findCapacity(ArrayList<Integer> list , int i,int j){
        int width = j-i;
                int height = Math.min(list.get(i),list.get(j));
                
             int capacity = 0;
             System.out.println(capacity);
                if(capacity < width*height){
                    capacity = width * height;
                }
                System.out.println(capacity);
        return capacity;
    }

    public static void container1(ArrayList<Integer> list){
        int totalWater = 0;
        for(int i=0;i<2;i++){
            
            for(int j=i+1;j<list.size();j++){
                
                
                totalWater = findCapacity(list,i,j);
                
            }  
        }
        System.out.println("Maximum capacity of water tank : "+ totalWater);

    }

    public static void container2(ArrayList<Integer> list){
        int totalWater = 0;
       int capacity = 0;
        int i=1;
        int j = list.size()-1;
         while(i<j){
            totalWater = findCapacity(list, i, j);
        //  int width = j-i;
        //  int height = Math.min(list.get(i),list.get(j));
         
        //         if(capacity < width*height){
        //             capacity = width * height;
        //         }
           if(list.get(i)<list.get(j)){
            i++;
           }
           else {
            j--;
           }
         }
       //  System.out.println("Maximum capacity of water tank : "+ capacity);

    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7)); 
        
       // container1(list);
        container2(list);
    }
    
}
