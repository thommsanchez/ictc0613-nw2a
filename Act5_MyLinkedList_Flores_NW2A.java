package act5_mylinkedlist_flores_nw2a;
import java.util.Scanner;
import java.util.LinkedList;
public class Act5_MyLinkedList_Flores_NW2A 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        LinkedList<String> Fname = new LinkedList<>(), Mname = new LinkedList<>(), Lname = new LinkedList<>(), Acode = new LinkedList<>(), Tnum = new LinkedList<>(), Gender = new LinkedList<>(), Age = new LinkedList<>(); 
        
        System.out.print("How many members' information will be entered?");
        int NumMem = input.nextInt();
        
        for(int i = 0; i<NumMem; i++)
        {
            System.out.println("Kindly give the information of member #"+(i+1));
            
            System.out.print("Enter first name: ");
            Fname.add(input.next());
            
            System.out.print("Enter middle name: ");
            Mname.add(input.next());
            
            System.out.print("Enter last name: ");
            Lname.add(input.next());
            
            System.out.print("Enter area code: ");
            Acode.add(input.next());
            
            System.out.print("Enter telephone number: ");
            Tnum.add(input.next());
            
            System.out.print("Enter gender: ");
            Gender.add(input.next());
            
            System.out.print("Enter age: ");
            Age.add(input.next());
            
            System.out.println();
        }
        
        for(int i = 0; i<NumMem; i++)
        {
            System.out.println("Welcome to the club "+Fname.get(i)+" "+Mname.get(i)+" "+Lname.get(i)+"!");
            System.out.println("Your area code and telephone number is ("+Acode.get(i)+") "+Tnum.get(i)+".");
            System.out.println("You are a "+Gender.get(i)+" member and your age is "+Age.get(i)+"."+"\n");
        }
    }
    
}
