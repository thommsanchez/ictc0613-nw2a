
package act05b_mylinkedlist_icban_nw2a;

import java.util.LinkedList;
import java.util.Scanner;
public class Act05B_MyLinkedList_Icban_NW2A {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
       LinkedList<String> info = new LinkedList<>();
       System.out.print("How many members’ information will be entered? ");
       int members = input.nextInt();
       for(int i = 0; i< members; i++)
       {
          System.out.print("\nKindly give the information of member #" + (i+1)+"\n");
          System.out.print("Enter first name: ");
          String fname = input.next();
          info.add(fname);
          System.out.print("Enter middle name: ");
          String mname = input.next();
          info.add(mname);
          System.out.print("Enter last name: ");
          String lname = input.next();
          info.add(lname);
          System.out.print("Enter area code: ");
          String areaCode = input.next();
          info.add(areaCode);
          System.out.print("Enter telephone number: ");
          String telnum = input.next();
          info.add(telnum);
          System.out.print("Enter gender: ");
          String gender = input.next();
          info.add(gender);
          System.out.print("Enter age: ");
          String age = input.next();
          info.add(age);
       }
       
       int index = 0;
       for(int i = 0; i< members; i++)
       {
          System.out.println("\nWelcome to the club "+info.get(index)+" "
          +info.get(index+1)+" "+info.get(index+2)+"!"); 
          
          index = index + 3;
          System.out.println("Your area code and telephone number is ("+info.get(index)+") "
          +info.get(index+1)+".");
           
          index = index + 2;
          System.out.println("You are a "+info.get(index)+" member and your age is "
          +info.get(index+1)+".");
           index = index + 2;
       }
       
    }
    
}

