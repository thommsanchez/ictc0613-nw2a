
package act4b_angeles_nw2a;
import java.util.Arrays; 
import java.util.Scanner;

public class Act4B_Angeles_NW2A {
    
 
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Pick a number you want to do with the array: ");
      System.out.println("1. INSERT ELEMENT");
      System.out.println("2. DELETE ELEMENT");
      System.out.println("3. TRAVERSE ELEMENT");
      System.out.println("4. EXIT");
      int choice = s.nextInt();
       
      if(choice==1){
          Insert();
      }
      else if(choice==2){
          Delete();
      }
      else if(choice==3){
          traverse();
      }
      else if(choice==4){
          exit();
      }
      else{
          System.out.println("ERROR");
      }
  }
      
    public static void Insert(){
        Scanner s = new Scanner(System.in);
        int length, p, e;
        
        System.out.print("Enter your preferred array length: ");
        length = s.nextInt();
     
        int arr[]= new int[length];
        
        System.out.println("Enter all elements");
        for(int i=0;i<length-1;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Position of the element that you will insert: ");
        p = s.nextInt();
        System.out.print("Element that you want to insert: ");
        e=s.nextInt();
        
        for(int i=length-1;i>p;i--){
            arr[i]=arr[i-1];
        }
        arr[p]=e;
       for(int i:arr){
           System.out.println(i);
       }
}
    
    public static void Delete(){
        
        int length, d, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        length = s.nextInt();
        int array[] = new int[length];
        System.out.println("Enter Element");
        for(i = 0; i < length; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Index of the element to be deleted: ");
        d = s.nextInt();
        System.out.println("Element to be deleted: "+ d); 
 
        int[] copyArr = new int[array.length - 1]; 
 
        System.arraycopy(array, 0, copyArr, 0, d); 
 
        System.arraycopy(array, d + 1, copyArr, d, array.length - d - 1); 
        s.close();
        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
  }
    
     public static void traverse(){
        int length;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        length = s.nextInt();
        int array[] = new int[length+1];
        System.out.println("Enter Element");
        for(int i = 0; i < length; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Elements in Array are:\n");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i]+" ");
        }
        s.close();
  }
  
  public static void exit(){
      System.out.println("Exit");
  }
    }



    
    

