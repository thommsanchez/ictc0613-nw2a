package com.mycompany.act5_mylinkedlist_perez_nw2a;
import java.util.*;
public class Act5_MyLinkedList_Perez_NW2A {
    public String firstName, middleName, lastName, areaCode, telephoneNumber, gender;
    public int Age;
    public Act5_MyLinkedList_Perez_NW2A next;
    public static Act5_MyLinkedList_Perez_NW2A firstNode;
    public static Act5_MyLinkedList_Perez_NW2A lastNode = null;
    
    public Act5_MyLinkedList_Perez_NW2A(String fName,String mName,String lName,String aCode,String telNum,String Gender,int age,Act5_MyLinkedList_Perez_NW2A n){
      firstName = fName;
      middleName = mName;
      lastName = lName;
      areaCode = aCode;
      telephoneNumber = telNum;
      gender = Gender;
      Age = age;
      next =  n;
    }
    
    public static void main(String[] args) {
       
        String name,fName, mName, lName, aCode, telNum, gender;
        int numNodes, age;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many member's information will be entered? ");
        numNodes = scan.nextInt();
        
        for(int i = 0; i < numNodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            name = scan.nextLine();
            fName = scan.nextLine();
            System.out.print("Enter middle name: ");
            mName = scan.nextLine();
            System.out.print("Enter last name: ");
            lName = scan.nextLine();
            System.out.print("Enter area code: ");
            aCode = scan.nextLine();
            System.out.print("Enter telephone number: ");           
            telNum = scan.nextLine();
            System.out.print("Enter gender: ");
            gender = scan.nextLine();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            
            Act5_MyLinkedList_Perez_NW2A n = new Act5_MyLinkedList_Perez_NW2A (fName, mName, lName, aCode, telNum, gender, age, null);
            if(lastNode !=null){
                lastNode.next = n;
                lastNode = n;
            }
            else {
                firstNode = n;
                lastNode = n;
            }
        }   
            
            Act5_MyLinkedList_Perez_NW2A n = firstNode;
            
            while(n != null){
                System.out.println("\nWelcome to the club " + n.firstName + " " + n.middleName + " " + n.lastName + "!");
                System.out.println("Your area code and telephone number is (" + n.areaCode + ")" + n.telephoneNumber + ".");
                System.out.println("You are a " + n.gender + " member and your age is " + n.Age + ".");
                n = n.next;
            }
    }}
    

