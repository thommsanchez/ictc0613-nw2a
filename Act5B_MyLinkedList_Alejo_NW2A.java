package act5B_mylinkedlist_alejo_nw2a;

import java.util.LinkedList;
import java.util.Scanner;

public class Act5B_MyLinkedList_Alejo_NW2A {

    public static void main(String[] args)   
{   
    Scanner mySC = new Scanner(System.in);
    LinkedList <String> myLL = new LinkedList<>();
    
    System.out.print("How many members' information will be entered? ");
    int length = mySC.nextInt();
    for (int i = 0; i < length; i++)
    {
    System.out.println(" ");
    mySC.nextLine();
    
    System.out.println("Kindly give the information of member #" + (i+1));
    
    System.out.print("Enter first name: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter middle name: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter last name: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter area code: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter telephone number: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter gender: ");
    myLL.add(mySC.nextLine());
    
    System.out.print("Enter age: ");
    myLL.add(mySC.next());
    }
    
    
    int ndx = 0;
    for (int i = 0; i < length; i++){    
    
    System.out.println(" ");
        
    System.out.println("Welcome to the club " + myLL.get(ndx) + " " + myLL.get(ndx+1) + " " + myLL.get(ndx+2) + "!");
    
    ndx = ndx + 3;
        
    System.out.println("Your area code and telephone number is (" + myLL.get(ndx) + ") " + myLL.get(ndx+1) + ".");
        
    ndx = ndx + 2;
    
    System.out.println("You are a " + myLL.get(ndx) + " member and your age is " + myLL.get(ndx+1) + ".");
    
    ndx = ndx + 2;
        
        }
    }
}