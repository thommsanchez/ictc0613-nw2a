package activity04b.nw2a.flores;
import java.util.Scanner;
import java.util.Arrays;
public class Activity04BNW2AFlores 
{
public static void insert()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the desired length of the array: ");
        
        int length = input.nextInt();
        int array[] = new int[length];
        
        System.out.println("Please enter elements you wish to input in the array: ");
        for(int i = 0; i < length; i++)
        {
            array[i] = input.nextInt();
        }
        
        System.out.print("Inserted Element/s: "+"\n"+Arrays.toString(array));

    }
  
  public static void delete()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the desired length of the array: ");
        
        int length = input.nextInt();
        int array[] = new int[length];
        
        System.out.println("Please enter elements you wish to input in the array:");
        for(int i = 0; i < length; i++)
        {
            array[i] = input.nextInt();
        }
        
        System.out.print("Please enter the index of the element you wish to delete: ");
        int delete = input.nextInt();
        int[]newarray = new int[array.length-1];
        
        for(int i = 0, k = 0; i < array.length; i++)
                    {
                        if(i!=delete)
                        {
                            newarray[k] = array[i];
                            k++;
                        }
                    }
        
        System.out.println("\nAfter removing the element in index "+delete+":"+"\n"+Arrays.toString(newarray));
    }
  
  public static void traverse()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the desired length of the array: ");
        
        int length = input.nextInt();
        int array[] = new int[length];
        
        System.out.println("Please enter elements you wish to input in the array:");
        for(int i = 0; i < length; i++)
        {
            array[i] = input.nextInt();
        }
        
        System.out.print("Inserted Element/s: "+"\n"+Arrays.toString(array));
              
    }
  
  public static void exit()
    {
        System.out.println("Thank you for using the program!");
    }
  
  public static void main(String[] args) 
    {
    
      Scanner input = new Scanner(System.in);

      System.out.println("1) Insert");
      System.out.println("2) Delete"); 
      System.out.println("3) Traverse");
      System.out.println("4) Exit");
      System.out.print("\nPlease select the operation you want to execute(1, 2, 3, or 4): ");      
      
      int choices = input.nextInt();
      switch(choices)
        {
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
    }
}
