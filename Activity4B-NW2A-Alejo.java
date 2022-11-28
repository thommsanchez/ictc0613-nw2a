import java.util.Arrays; 
public class Activity4b {
 
 public static int findLocationDelete(int arr[], int t) {    
 if (arr == null) { 
 return -1; 
 } 
int len = arr.length; 
int i = 0; 
 
 while (i < len) { 
if (arr[i] == t) { 
return i; 
 } else {
 i = i + 1; 
} 
} return -1; 
} 
 
public static void main(String[] args) {

   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int Index_position = 2;
   int newValue    = 5;
   int option = 1; //change the number if you want to insert, delete, or traverse
   
System.out.println("Index position to be manipulate is my_array[" + findLocationDelete(my_array, 56)+"]");
System.out.println("");

System.out.println("Array : "+Arrays.toString(my_array));
System.out.println("");


if (my_array.length ==10){System.out.println("Array is full");} else if (my_array.length<10){System.out.println("Array is not full");}

System.out.println("");

switch (option) {
  case 1: //Insertion of value
  System.out.println("Inserting a value of "+ newValue+" in my_array[" + findLocationDelete(my_array, 56)+"]");     
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
   System.out.println("");
   
   
  case 2: //Deletion of value
  System.out.println("Deleting a value in my_array[" + findLocationDelete(my_array, 5)+"]");  
  
   int removeIndex = 2;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
    System.out.println("After deleting the 2nd element: "+Arrays.toString(my_array));
    System.out.println("");
    
   case 3: //Traverse
   System.out.println("Traversing an array");
   for (int i = 0; i < my_array.length; i++)
     {
         System.out.println( my_array[i] );
     }
     
     case 4: //Exit
     
     System.out.println("");
     System.out.println("End of the line.");
     break;
 }}}
 