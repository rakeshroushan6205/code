import java.util.*;



public class FindMaximumElement {

    

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list  = new ArrayList<>();
        System.err.println("Enter the number of element to be enter : ");
        int n= scan.nextInt();
        System.out.println("enter element : ");
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
      try{
        for(int i=0;i<list.size();i++){
            // if(list.get(i) > max){
            //   max = list.get(i);
          
            // }
            max = Math.max(max,list.get(i));
        }
      }
      catch(Exception e){
        e.printStackTrace();
      }

      System.err.println(max+ " : is a maximum element ");
        
    }
    
}
