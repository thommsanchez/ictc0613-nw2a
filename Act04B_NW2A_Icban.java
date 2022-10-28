
package act04b_nw2a_icban;

import java.util.Arrays; 
import java.util.*;
public class Act04B_NW2A_Icban{
 
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      System.out.print("\nChoose your options:");
      System.out.println("\n1. Insert");
      System.out.println("2. Delete"); 
      System.out.println("3. Traverse");
      System.out.println("4. Exit");
      System.out.print("\nWhat operations you want to perform?: ");
      int choice = sc.nextInt();
      System.out.println();
      switch(choice){
          case 1:
              insert();
              break;
          case 2:
              delete();
              break;
          case 3:
              traverse();
              break;
          case 4:
              exit();
              break;
      }
      System.out.println();
      sc.close(); 
  }
  
  public static void insert(){
     int length, elem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        length = sc.nextInt();
        int arr[] = new int[length+1];
        System.out.println("Enter "+length+" Element to Store in Array");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to insert: ");
        elem = sc.nextInt();
        arr[length] = elem;
        System.out.print("After inserting an element: ");
        for(int i = 0; i <length; i++)
        {
            System.out.print(arr[i]+",");
        }
        sc.close();
        System.out.print(arr[length]); 
  }
  
  public static void delete(){
     
        int length, index, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter "+length+" Element to Store in Array");
        for(i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index of the element that you want to be deleted: ");
        index = sc.nextInt();
        System.out.println("\nElement to be deleted at index: "+ index); 
 
        int[] copyArr = new int[arr.length - 1]; 
 
        System.arraycopy(arr, 0, copyArr, 0, index); 
 
        System.arraycopy(arr, index + 1, copyArr, index, arr.length - index - 1); 
        sc.close();
        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
  }
  
  public static void traverse(){
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names you want to enter?: ");
        length = Integer.parseInt(sc.nextLine());
        
        String names[] = new String[length];
        System.out.println("Enter "+length+" names to Store in Array:");
        for(int i = 0; i < names.length; i++)
        {
            names[i] = sc.nextLine();
        }
         sc.close();
        System.out.print("\nThe names in Array are:\n");
        for(int i = 0; i < names.length; i++)
        {
            System.out.print(names[i]+"\n");
        }
  }
  
  public static void exit(){
      System.out.println("Program Exit");
  }
}