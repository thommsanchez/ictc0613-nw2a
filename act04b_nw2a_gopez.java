import java.util.*;

public class act04b_nw2a_gopez 
{
    public static void main(String[] args)
    {
        Scanner scInput = new Scanner(System.in);
        boolean x;
        do
        {
            x=true;
            System.out.println("\nChoose the operation to be conducted:");
            System.out.println("1. Insert a value");
            System.out.println("2. Delete a value");
            System.out.println("3. Traverse array");
            System.out.println("4. Exit");
            System.out.print("-> ");
            int swChoice = scInput.nextInt();

            switch(swChoice)
            {
                case 1:
                    lastInsert();
                    break;
                case 2:
                    findLocationDelete();
                    break;
                case 3:
                    arrayTraverse();
                    break;
                case 4:
                    x=false;
                    break;
                default:
            }
         }while(x);
    }

    public static void lastInsert() 
    {
       Scanner scInput = new Scanner(System.in);
       System.out.println("Create an array.");
       System.out.print("Input the Array Length: ");
       int arrLength = scInput.nextInt();
       int arrUser[] = new int[arrLength+1];
       System.out.println("Input "+arrLength+" element/s for the array:");
       for(int i=0;i<arrLength;i++)
       {
           arrUser[i] = scInput.nextInt();
       }
       System.out.print("Input an element to insert into the array: ");
       int arrElemUser = scInput.nextInt();
       arrUser[arrLength] =  arrElemUser;
       System.out.print("Array before inserting an element: [ ");
       for(int i = 0;i<arrLength;i++)
       {
           System.out.print(arrUser[i]+" ");
       }
       System.out.println("]");
       System.out.print("Array after inserting an element: [ ");
       for(int i = 0;i<arrLength;i++)
       {
           System.out.print(arrUser[i]+" ");
       }
       System.out.print(arrUser[arrLength]);
       System.out.print(" ]\n");
    }

    public static void findLocationDelete() {
        Scanner scInput = new Scanner(System.in);
        System.out.println("Create an array.");
        System.out.print("Input the Array Length: ");
        int arrLength = scInput.nextInt();
        int arrUser[] = new int[arrLength];
        System.out.println("Input "+arrLength+" element/s for the array:");
        for(int i=0;i<arrLength;i++)
        {
            arrUser[i] = scInput.nextInt();
        }
       System.out.print("Input the index of the element you want to delete: ");
       int arrIndex = scInput.nextInt();
       int[] newArrUser = new int[arrUser.length-1];
       for(int i=0,k=0;i<arrLength;i++)
       {
           if(i!=arrIndex)
           {
               newArrUser[k]=arrUser[i];
               k++;
           }
       }
       System.out.println("Array before deleting an element: "+Arrays.toString(arrUser));
       System.out.println("Array after deleting an element: "+Arrays.toString(newArrUser));
    }

    public static void arrayTraverse() {
        Scanner scInput = new Scanner(System.in);
        System.out.println("Create an array.");
        System.out.print("Input the Array Length: ");
        int arrLength = scInput.nextInt();
        int arrUser[] = new int[arrLength];
        System.out.println("Input "+arrLength+" element/s for the array:");
        for(int i=0;i<arrLength;i++)
        {
            arrUser[i] = scInput.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arrUser));
    }
}
