
package act04b_nw2a_deocampo;

import java.util.*;

public class Act04B_NW2A_DeOcampo {

	public static void insertVal(){
            
	    int arrIndex, val;
            int[] arrLength;
            
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter Desired Array Length: ");
                arrIndex = sc.nextInt();
                arrLength = new int[arrIndex+1];
                System.out.println("Enter Desired Value/s");
                for(int i = 0; i < arrIndex; i++)
                {
                    arrLength[i] = sc.nextInt();
                }
                System.out.print("Enter Desired Value to be Inserted: ");
                val = sc.nextInt();
                arrLength[arrIndex] = val;
                System.out.println("Values After Inserting: ");
                for(int i = 0; i<arrIndex; i++)
                {
                    System.out.println(arrLength[i]);
                }
            }
	        System.out.print(arrLength[arrIndex]); 
	  }
	  
	  public static void deleteVal(){
	     
		  int arrLength, x;
                  int[] copyArr;
                  
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter Array length: ");
                arrLength = sc.nextInt();
                int array[] = new int[arrLength];
                System.out.println("Enter Desired Value/s");
                for(int i = 0; i < arrLength; i++)
                {
                    array[i] = sc.nextInt();
                }
                System.out.print("Enter the index of the element that you want to delete: ");
                x = sc.nextInt();
                System.out.println("Element to be deleted: "+ x);
                copyArr = new int[array.length - 1];
                System.arraycopy(array, 0, copyArr, 0, x);
                System.arraycopy(array, x + 1, copyArr, x, array.length - x - 1);
            }
	        System.out.println("Values After Deleting: "+ Arrays.toString(copyArr));  
	  }
	  
	  public static void traverseVal(){
		  int arrayLength;
                  
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter Desired Array Length: ");
                arrayLength = sc.nextInt();
                int array[] = new int[arrayLength+1];
                System.out.println("Enter Desired Value/s");
                for(int i = 0; i < arrayLength; i++)
                {
                    array[i] = sc.nextInt();
                }
                System.out.print("Elements in the Array are:\n");
                for(int i = 0; i < arrayLength; i++)
                {
                    System.out.print(array[i]+" ");
                }
            }
	  }
	  
	  public static void exit(){
	      System.out.println("Program Closed");
	  }
	  
	public static void main(String[] args) {
		
            System.out.println("Choose your desired operation");
	    System.out.println("1. Insert a Value");
	    System.out.println("2. Delete a Value"); 
	    System.out.println("3. Traverse Array");
	    System.out.println("4. Exit");
	      
            try (Scanner sc = new Scanner(System.in)) {
                int options = sc.nextInt();
                System.out.println();
                switch(options){
                    case 1:
                        insertVal();
                        break;
                    case 2:
                        deleteVal();
                        break;
                    case 3:
                        traverseVal();
                        break;
                    case 4:
                        exit();
                        break;
                }
                System.out.println();
            } 
	 }
}