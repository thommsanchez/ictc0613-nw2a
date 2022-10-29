package act04b_nw2a_tayag;
import java.util.*;

public class Act04B_NW2A_Tayag {

    public static String[]findLocationDelete(String[]name){
    //new array
    String[]newData = new String[name.length-1];
    //identify target
    System.out.println("Which String to remove (Type the name):");
        Scanner target = new Scanner(System.in);
        String targetVal = target.nextLine();
    //duplicate array
            int newLength=0;
            for(int i=0; i<name.length; i++){             
                if(!name[i].equalsIgnoreCase(targetVal)){
                newData[newLength]=name[i];
                newLength++;
                }
                }
            return newData;
            }
    
    
    public static String[]insertNewString(String[]name){
    
    //make new array
    String[]addData = new String[name.length+1];   
    //copy old data to new    
        for(int i=0; i<name.length; i++){
        addData[i]=name[i];
    }
    //add new data
    Scanner inputNewString = new Scanner(System.in);
        addData[addData.length-1]=inputNewString.nextLine();
    return addData;
    }    
     
    
    
    public static String[]createNewArray(String[]name){  
    Scanner xString = new Scanner(System.in);
    //overwriting current array creating a new array[5]
    String[]overwriteData = new String[5];
    for(int i=0; i<5; i++){
    overwriteData[i] = xString.next();    
    }    
    return overwriteData;    
    }
    
    public static void main(String[] args) {
        Scanner xNum = new Scanner(System.in);
        String name[] = new String[5];
        boolean x;
        
        do{
        System.out.println("Choose an input\n1. Create/overwrite a String array\n2. Insert a String on current array\n3. Delete a String Value\n4. Display current array\n5. Exit");   
        int pick = xNum.nextInt();        
        x = true;    
        switch (pick){
            case 1: //creating new array               
                System.out.println("Insert 5 Names: ");    
                name = createNewArray(name);                                  
                break;
                
            case 2://inserting new value
                if(name.length<5){
                System.out.println("Current values: "+Arrays.toString(name)); 
                System.out.print("Insert a new Name: ");
                name = insertNewString(name);
                    }else{
                    System.out.print("Array is currently full [5]\n");
                    }
                break;
                
            case 3: //deleting array value
                System.out.println("Current values: "+Arrays.toString(name)); 
                name = findLocationDelete(name);
                System.out.println(Arrays.toString(name));   
                break;
                
            case 4: //traversing array
                System.out.println("These are the values you have inserted: "+Arrays.toString(name));        
                break;
                
            case 5://termination
                x = false;
                break;
                
            default:
                System.out.println("Invalid input");
    }
        
        } while(x);
                System.out.println("Done");
        
        
    }
    
}

