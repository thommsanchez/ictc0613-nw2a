
package act05b_mylinkedlist_natanauan_nw2a;

import java.util.LinkedList;
import java.util.Scanner;

public class Act05B_MyLinkedList_Natanauan_NW2A {

    public static void main(String[] args) {
        
        LinkedList<String> fName = new LinkedList<>(), mName = new LinkedList<>(), lName = new LinkedList<>(), 
                gender = new LinkedList<>(), age = new LinkedList<>(), areaCode = new LinkedList<>(), contact = new LinkedList<>(); 
        
        int membersNum;
        Scanner input = new Scanner(System.in);
        System.out.print("How many members’ information will be entered? ");
        membersNum = input.nextInt();
        
        for(int i=0; i<membersNum; i++){
            System.out.print("Kindly give the information of member #"+(i+1));
            
            System.out.print("\nEnter First Name: ");
            fName.add(input.next());
            
            System.out.print("Enter Middle Name: ");
            mName.add(input.next());
            
            System.out.print("Enter Last Name: ");
            lName.add(input.next());
            
            System.out.print("Enter Gender: ");
            gender.add(input.next());
            
            System.out.print("Enter Age: ");
            age.add(input.next());
            
            System.out.print("Enter Area Code: ");
            areaCode.add(input.next());
            
            System.out.print("Enter Contact/Telephone Number: ");
            contact.add(input.next());
            
            System.out.println(); 
        }
        
        for(int j=0; j<membersNum;j++){
            System.out.println("Welcome "+fName.get(j)+" "+mName.get(j) +" "+lName.get(j)+"!");
            System.out.println("Your area code and telephone number is ("+areaCode.get(j) +") "+contact.get(j) +".");
            System.out.println("You are a "+gender.get(j) +" member and your age is "+age.get(j) +".\n");
        } 
        
    }
    
}