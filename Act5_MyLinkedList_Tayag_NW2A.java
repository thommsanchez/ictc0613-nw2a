package act5_mylinkedlist_tayag_nw2a;
import java.util.LinkedList;
import java.util.Scanner;

public class Act5_MyLinkedList_Tayag_NW2A {

    public static void main(String[] args) {
            LinkedList<String> Fname = new LinkedList<>(), 
                               Mname = new LinkedList<>(),
                               Lname = new LinkedList<>(), 
                               gender = new LinkedList<>(); 
                               
            LinkedList<Integer> age = new LinkedList<>(),
                                areaCode = new LinkedList<>(),
                                contact = new LinkedList<>();


        int membersAmount;
        Scanner input = new Scanner(System.in);
        System.out.print("How many members? ");
        membersAmount = input.nextInt();
        
        for(int i=0; i<membersAmount; i++){
            System.out.print("Kindly give the information of member #"+(i+1));
            //Data of the same type are grouped
            //String
            System.out.print("\nEnter First name: ");
            Fname.add(input.next());
            System.out.print("Enter Middle name: ");
            Mname.add(input.next());
            System.out.print("Enter Last name: ");
            Lname.add(input.next());       
            System.out.print("Enter Gender: ");
                gender.add(input.next());
     
            //Integer
            System.out.print("Enter Age: ");
            age.add(input.nextInt());
            System.out.print("Enter Area Code: ");
            areaCode.add(input.nextInt());
            System.out.print("Enter Contact Number: ");
            contact.add(input.nextInt());
            
            System.out.println(); //this is just for spacing
        }
        
       for(int j=0; j<membersAmount;j++){
           //Greetings, prints the first,middle, and last name
           System.out.println("Welcome "+Fname.get(j)+" "
                   +Mname.get(j) +" "
                   +Lname.get(j)
                   +"!"
           );
           
           //Displays the Contact info
           System.out.println("Your area code and telephone number is ("
                    +areaCode.get(j) +") "
                    +contact.get(j) +"."
            );
           
           //Printing other info
           System.out.println("You are a "
                   +gender.get(j) +" and your age is "
                   +age.get(j) +".\n"
           
           );
           
       } 
        
    }
    
}
