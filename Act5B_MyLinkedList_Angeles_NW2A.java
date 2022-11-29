package linklist;

import java.util.LinkedList;
import java.util.Scanner;

public class Act5B_MyLinkedList_Angeles_NW2A {
	public static void main (String[] args){
            Scanner s =new Scanner(System.in);
            
		int clubMembers, aCode,  age;
		String fName, mName, lName, gender, tNum;
		LinkedList membersInfo = new LinkedList();
	
		System.out.print("How many members' information will be entered?: ");
		clubMembers = s.nextInt();
	
		for (int i=0;i<clubMembers;i++) {
			System.out.println("Kindly give the information of member #"+(i+1));
		
			System.out.print("Enter First name: ");
			fName = s.next();
		
			System.out.print("Enter Middle name: ");
			mName = s.next();
			
			System.out.print("Enter Last name: ");
			lName = s.next();
		
			System.out.print("Enter Area code: ");
			aCode = s.nextInt();
		
			System.out.print("Enter Telephone number: ");
			tNum = s.next();
		
			System.out.print("Enter Gender: ");
			gender = s.next();
                       
			System.out.print("Enter Age: ");
			age = s.nextInt();
		
			membersInfo.add(fName);
			membersInfo.add(mName);
			membersInfo.add(lName);
			membersInfo.add(aCode);
			membersInfo.add(tNum);
			membersInfo.add(gender);
			membersInfo.add(age);
                        System.out.println();
			}
 	
		int index = 0;
		
		for (int i = 0; i< clubMembers; i++){
			System.out.println("\nWelcome to the club "+ membersInfo.get(index)+ " " + membersInfo.get(index+1)+ " " + membersInfo.get(index+2) + "!");
			index = index + 3;
			System.out.println("Your area code and telephone number is (" + membersInfo.get(index)+ ") " + membersInfo.get(index+1) + ".");
			index = index + 2;
			System.out.println("You are an "+ membersInfo.get(index)+ " member, and your age is " + membersInfo.get(index+1) + ".");
			index = index + 2;
			}
	}
}