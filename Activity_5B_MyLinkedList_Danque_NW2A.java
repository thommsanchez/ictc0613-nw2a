
import java.io.*;
import java.util.LinkedList;

public class Activity_5B {

    public static void main(String[] args) throws IOException {
        int clubMembers, aCode, age;
        String fName, mName, lName, gender, tNum;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        LinkedList membersInfo = new LinkedList();

        System.out.println("How many members' information will be entered?");
        clubMembers = Integer.parseInt(read.readLine());

        for (int i = 0; i < clubMembers; i++) {
            System.out.println("Kindly give the information of member #" + (i + 1) + ":");

            System.out.println("Enter First name: ");
            fName = String.valueOf(read.readLine());

            System.out.println("Enter Middle name: ");
            mName = String.valueOf(read.readLine());

            System.out.println("Enter Last name: ");
            lName = String.valueOf(read.readLine());

            System.out.println("Enter Area code: ");
            aCode = Integer.parseInt(read.readLine());

            System.out.println("Enter Telephone number: ");
            tNum = String.valueOf(read.readLine());

            System.out.println("Enter Gender: ");
            gender = String.valueOf(read.readLine());

            System.out.println("Enter Age: ");
            age = Integer.parseInt(read.readLine());

            membersInfo.add(fName);
            membersInfo.add(mName);
            membersInfo.add(lName);
            membersInfo.add(aCode);
            membersInfo.add(tNum);
            membersInfo.add(gender);
            membersInfo.add(age);
        }

        int index = 0;

        for (int i = 0; i < clubMembers; i++) {
            System.out.println("\nWelcome to the club " + membersInfo.get(index) + " " + membersInfo.get(index + 1) + " " + membersInfo.get(index + 2) + "!");
            index = index + 3;
            System.out.println("Your area code and telephone number is (" + membersInfo.get(index) + ") " + membersInfo.get(index + 1) + ".");
            index = index + 2;
            System.out.println("You are a " + membersInfo.get(index) + " member, and your age is " + membersInfo.get(index + 1) + ".");
            index = index + 2;
        }
    }
}
