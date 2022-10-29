package DSem1;
import java.util.Arrays; 
import java.util.Scanner;
public class Act04B_NW2A_Celeste {
    public static void insert(){
     int len, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        len = s.nextInt();
        int array[] = new int[len+1];
        System.out.println("Enter Element");
        for(int i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        m = s.nextInt();
        array[len] = m;
        System.out.print("After inserting: ");
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
        System.out.print("Enter Array length: ");
        len = s.nextInt();
        int array[] = new int[len];
        System.out.println("Enter Element");
        for(i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the index of the element to delete: ");
        m = s.nextInt();
        System.out.println("\nElement to be deleted at index: "+ m); 
 
        int[] copyArr = new int[array.length - 1]; 
 
        System.arraycopy(array, 0, copyArr, 0, m); 
 
        System.arraycopy(array, m + 1, copyArr, m, array.length - m - 1); 
        s.close();
        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
  }
  
  public static void traverse(){
        int len;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        len = s.nextInt();
        int array[] = new int[len+1];
        System.out.println("Enter Element");
        for(int i = 0; i < len; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Elements in Array are:\n");
        for(int i = 0; i < len; i++)
        {
            System.out.print(array[i]+" ");
        }
        s.close();
  }
  
  public static void exit(){
      System.out.println("Exit");
  }
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
      System.out.print("\nOptions:");
      System.out.println("\n1. Insert");
      System.out.println("2. Delete"); 
      System.out.println("3. Traverse");
      System.out.println("4. Exit");
      System.out.print("\nEnter operations: ");
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
