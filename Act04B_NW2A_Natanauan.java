
package act04b_nw2a_natanauan;

import java.util.Scanner;
import java.util.*;

public class Act04B_NW2A_Natanauan {

    public static void insert(){
        
        int length, num;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the length of Array: ");
        length = input.nextInt();
        int array[] = new int[length+1];
        
        System.out.println("Enter the "+length+" elements: ");
            for(int i = 0; i < length; i++){
                array[i] = input.nextInt();
            }
        
        System.out.print("Enter the element to insert: ");
        num = input.nextInt();
        array[length] = num;
        
        System.out.print("Insert successful: ");
            for(int i = 0; i <length; i++){
                System.out.print(array[i]+"\n");
            }
        input.close();
        System.out.print(array[length]); 
        
  }
  
  public static void findlocationDelete(){
     
        int length, num, i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the length of Array: ");
        length = input.nextInt();

        int array[] = new int[length];
        System.out.println("Enter the "+length+" elements: ");
            for(i = 0; i < length; i++){
                array[i] = input.nextInt();
            }
        
        System.out.print("Enter the index of the element that needs to be deleted: ");
        num = input.nextInt();
        System.out.println("\nElement to be deleted at index: "+ num); 
 
        int[] copyArr = new int[array.length - 1]; 
 
        System.arraycopy(array, 0, copyArr, 0, num); 
        System.arraycopy(array, num + 1, copyArr, num, array.length - num - 1); 
        input.close();
        System.out.println("Delete successful: "+ Arrays.toString(copyArr)); 
        
  }
  
    public static void traverse(){
        
        int length;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the length of Array: ");
        length = s.nextInt();
        int array[] = new int[length+1];
        
        System.out.println("Enter the "+length+" elements: ");
            for(int i = 0; i < length; i++){
                array[i] = s.nextInt();
            }
        
        System.out.print("Elements in Array are:\n");
            for(int i = 0; i < length; i++){
                System.out.print(array[i]+" ");
            }
        s.close();
        
  }
  
  public static void exit(){
      System.out.println("Exit");
  }
  public static void main(String[] args) {
    
      
        Scanner input = new Scanner(System.in);
        System.out.print("\nSelect an option (1-4):");
        System.out.println("\n1. Insert");
        System.out.println("2. Delete"); 
        System.out.println("3. Traverse");
        System.out.println("4. Exit");
        System.out.print("\nEnter: ");
        int choices = input.nextInt();
        System.out.println();
    
        switch(choices){
          case 1:
              insert();
              break;
          case 2:
              findlocationDelete();
              break;
          case 3:
              traverse();
              break;
          case 4:
              exit();
              break;
      }
        
        
      System.out.println();
      input.close(); 
  }
    
}
