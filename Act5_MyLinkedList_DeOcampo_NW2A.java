
package act5_mylinkedlist_deocampo_nw2a;

import java.util.*;

public class Act5_MyLinkedList_DeOcampo_NW2A {

    public static void main(String[] args) {
        
        LinkedList memInfo = new LinkedList();
        Scanner sc = new Scanner(System.in);
        
        int clubMem, addCode,  age;
	String fn, mn, ln, gender, tNumber;
	
	System.out.println("How many members' information will be entered?");
	clubMem = sc.nextInt();
	
	for (int i=0;i<clubMem;i++) {
		System.out.println("Kindly give the information of member #"+(i+1)+":");
		
		System.out.println("Enter your first name: ");
		fn = sc.next();
		
                System.out.println("Enter your middle name: ");
		mn = sc.next();
		
		System.out.println("Enter your last name: ");
		ln = sc.next();
		
		System.out.println("Enter your area code: ");
		addCode = sc.nextInt();
		
		System.out.println("Enter your telephone number: ");
		tNumber = sc.next();
		
		System.out.println("Enter your gender: ");
		gender = sc.next();
			
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		memInfo.add(fn);
		memInfo.add(mn);
		memInfo.add(ln);
		memInfo.add(addCode);
		memInfo.add(tNumber);
		memInfo.add(gender);
		memInfo.add(age);
		}
 	
		int index = 0;
		
		for (int i = 0; i< clubMem; i++){
                    System.out.println("\nWelcome to the club "+ memInfo.get(index)+ " " + memInfo.get(index+1)+ " " + memInfo.get(index+2) + "!");
                    index = index + 3;
                    
                    System.out.println("Your area code and telephone number is (" + memInfo.get(index)+ ") " + memInfo.get(index+1) + ".");
                    index = index + 2;
                    
                    System.out.println("You are a "+ memInfo.get(index)+ " member, and your age is " + memInfo.get(index+1) + ".");
                    index = index + 2;
		}
    }
    
}
