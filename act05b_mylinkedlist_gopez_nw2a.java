import java.util.LinkedList;
import java.util.Scanner;

public class act05b_mylinkedlist_gopez_nw2a 
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        LinkedList<String> fName = new LinkedList<>(), mName = new LinkedList<>(), lName = new LinkedList<>(), gender = new LinkedList<>();
        LinkedList<Integer> aCode = new LinkedList<>(), teleNum = new LinkedList<>(), age = new LinkedList<>();
        System.out.print("How many members' information will be entered? ");
        int membAmount = userInput.nextInt();
        
        for(int i=0;i<membAmount;i++)
        {
            System.out.print("Kindly give the information of member #"+(i+1));
            System.out.print("\nEnter first name: ");
            fName.add(userInput.next());
            System.out.print("Enter middle name: ");
            mName.add(userInput.next());
            System.out.print("Enter last name: ");
            lName.add(userInput.next());
            System.out.print("Enter area code: ");
            aCode.add(userInput.nextInt());
            System.out.print("Enter telephone number: ");
            teleNum.add(userInput.nextInt());
            System.out.print("Enter gender: ");
            gender.add(userInput.next());
            System.out.print("Enter age: ");
            age.add(userInput.nextInt());
            System.out.println();
        }
        for(int n=0;n<membAmount;n++)
        {
            System.out.println("Welcome "+fName.get(n)+" "+mName.get(n)+" "+lName.get(n)+"!");
            System.out.println("Your area code and telephone number is ("+aCode.get(n)+") "+teleNum.get(n)+".");
            System.out.println("You are a "+gender.get(n)+" member and your age is "+age.get(n)+".");
        }
    }
}
