
package act4b_nw2a_danque;

import java.util.Arrays; 
import java.util.Scanner;
public class act4b_nw2a_danque{
 
  public static void insert(){
     int len, m;
        Scanner s = new Scanner(System.in);
        System.out.print("enter array length: ");
        len = s.nextInt();
        int array[] = new int[len+1];
        System.out.println("enter element:");
        for(int i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("enter the element you want to insert: ");
        m = s.nextInt();
        array[len] = m;
        System.out.println("after inserting: ");
        for(int i = 0; i <len; i++)
        {
            System.out.print(array[i]+"\n");
        }
        s.close();
        System.out.print(array[len]); 
  }
  
  public static void delete(){
     
        int len, m, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter array length: ");
        len = s.nextInt();
        int array[] = new int[len];
        System.out.println("enter element:");
        for(i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("enter the index of the element that you want to be deleted: ");
        m = s.nextInt();
        System.out.println("\nelement to be deleted at index: "+ m); 
 
        int[] copyArr = new int[array.length - 1]; 
 
        System.arraycopy(array, 0, copyArr, 0, m); 
 
        System.arraycopy(array, m + 1, copyArr, m, array.length - m - 1); 
        s.close();
        System.out.println("array after deleting an element: "+ Arrays.toString(copyArr));  
  }
  
  public static void traverse(){
        int len;
        Scanner s = new Scanner(System.in);
        System.out.print("enter array length: ");
        len = s.nextInt();
        int array[] = new int[len+1];
        System.out.println("enter element");
        for(int i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("elements in array are:\n");
        for(int i = 0; i < len; i++)
        {
            System.out.print(array[i]+" ");
        }
        s.close();
  }
  
  public static void exit(){
      System.out.println("EXIT");
  }
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
      System.out.print("\nchoose your options:");
      System.out.println("\n1. Insert");
      System.out.println("2. Delete"); 
      System.out.println("3. Traverse");
      System.out.println("4. Exit");
      System.out.print("\nenter operations: ");
      int choices = s.nextInt();
      System.out.println();
      switch(choices){
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
      s.close(); 
  }
}