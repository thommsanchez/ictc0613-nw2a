package DSem1;
import java.util.*;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            LinkedList<String> members_information = new LinkedList<>();
        System.out.print("\nEnter the number of members’ information to enter: ");
         int number_of_members = sc.nextInt();
         for(int i = 0; i< number_of_members; i++)
         {
             System.out.println("\nKindly give the information of member #"+(i+1));
             System.out.print("Enter first name: ");
             String firstname = sc.next();
             members_information.add(firstname);
             System.out.print("Enter middle name: ");
             String middlename = sc.next();
             members_information.add(middlename);
             System.out.print("Enter last name: ");
             String lastname = sc.next();
             members_information.add(lastname);
             System.out.print("Enter area code: ");
             String area_code = sc.next();
             members_information.add(area_code);
             System.out.print("Enter telephone number: ");
             String telephone_number = sc.next();
             members_information.add(telephone_number);
             System.out.print("Enter gender: ");
             String gender = sc.next();
             members_information.add(gender);
             System.out.print("Enter age: ");
             String age = sc.next();
             members_information.add(age);


         }


        
         //declare a index setter
        int set_index = 0;
         //Now welcome the members to the club
        for(int i = 0; i< number_of_members; i++)
        {
            System.out.println("\nWelcome to the club "+members_information.get(set_index)+" "
                    +members_information.get(set_index+1)+" "+members_information.get(set_index+2));
            //increment the value of set index by three
            set_index = set_index + 3;
            System.out.println("Your area code and telephone number is ("+members_information.get(set_index)+") "
                    +members_information.get(set_index+1));
            set_index =set_index + 2;
            System.out.println("You are a "+members_information.get(set_index)+" member, and your age is "
                    +members_information.get(set_index+1));
            set_index = set_index + 2;
        }


    }
}
