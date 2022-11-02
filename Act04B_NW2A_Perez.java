package com.mycompany.act04b_nw2a_perez;
import java.util.Scanner;
public class Act04B_NW2A_Perez {
    public static void getValue(){
    int total;
    Scanner scan = new Scanner(System.in);
    System.out.println("How many names do you want to store?");
    total = scan.nextInt();
    String names[] = new String[total];
    for(int counter=0;counter<total;counter++){
    System.out.println("Enter the names you want to store: " + (counter+1));
    names[counter] = scan.next();
    }
    scan.close();
}
public static void deleteValue(){
    int total;
    Scanner scan = new Scanner(System.in);
    Scanner del = new Scanner(System.in);
    System.out.println("How many names do you want to store?");
    total = scan.nextInt();
    String names[] = new String[total];
    for(int counter=0;counter<total;counter++){
    System.out.println("Enter the names you want to store: " + (counter+1));
    names[counter] = scan.next();
    }
    scan.close();
    System.out.println("Enter the index of the element you want to delete: ");
}
       
public static void traverse(){
    int total;
    Scanner scan = new Scanner(System.in);
    System.out.println("How many names do you want to store?");
    total = scan.nextInt();
    String names[] = new String[total];
    for(int counter=0;counter<total;counter++){
    System.out.println("Enter the names you want to store: " + (counter+1));
    names[counter] = scan.next();
    }
    scan.close();
    System.out.println("The contents of this array is: ");
    for (int i = 0; i < names.length; i++) {   
            System.out.print(names[i] + " ");
}
}
public static void exit(){
    System.exit(0);
}
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select an Action: ");
        System.out.println("1. Insert a value" + "\n2. Delete a value" + "\n3. Traverse array" + "\n4. Exit");
        int option = scan.nextInt();
        switch(option){
            case 1:
                getValue();
                break;
            case 2:
                 deleteValue();
                break;
            case 3:
                traverse();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Error"); 
                break;
        }     
}    
}

