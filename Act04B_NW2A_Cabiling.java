package cabiling4b;
import java.util.Arrays; 
import java.util.*;
public class Act04B_NW2A_Cabiling {

	    public static void insert(){
	     int a, m;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please Enter Array length: ");
	        a = scan.nextInt();
	        int array[] = new int[a+1];
	        System.out.println("Please Enter Element");
	        for(int i = 0; i < a; i++)
	        {
	            array[i] = scan.nextInt();
	        }
	        System.out.print("Please Enter the element to insert: ");
	        m = scan.nextInt();
	        array[a] = m;
	        System.out.print("After inserting: ");
	        for(int i = 0; i <a; i++)
	        {
	            System.out.print(array[i]+"\n");
	        }
	        scan.close();
	        System.out.print(array[a]); 
	  }

	  public static void delete(){

	        int b, m, i = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please Enter Array length: ");
	        b = scan.nextInt();
	        int array[] = new int[b];
	        System.out.println("Please Enter Element");
	        for(i = 0; i < b; i++)
	        {
	            array[i] = scan.nextInt();
	        }
	        System.out.print("Please Enter the index of the element to delete: ");
	        m = scan.nextInt();
	        System.out.println("Element to be deleted at index: "+ m); 

	        int[] copyArr = new int[array.length - 1]; 

	        System.arraycopy(array, 0, copyArr, 0, m); 

	        System.arraycopy(array, m + 1, copyArr, m, array.length - m - 1); 
	        scan.close();
	        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
	  }

	  public static void traverse(){
	        int c;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please Enter Array length: ");
	        c = scan.nextInt();
	        int array[] = new int[c+1];
	        System.out.println("Please Enter Element");
	        for(int i = 0; i < c; i++)
	        {
	            array[i] = scan.nextInt();
	        }
	        System.out.print("Elements in Array are:\n");
	        for(int i = 0; i < c; i++)
	        {
	            System.out.print(array[i]+" ");
	        }
	        scan.close();
	  }

	  public static void exit(){
	      System.out.println("Exit");
	  }
	  public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.println("Please Choose Options:");
	      System.out.println("1. Insert");
	      System.out.println("2. Delete"); 
	      System.out.println("3. Traverse");
	      System.out.println("4. Exit");
	      System.out.println("Enter chosen operations: ");
	      int choices = scan.nextInt();
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
	      scan.close(); 
	  }
	}
