
import java.util.Scanner;

public class DLLMain {

	public static void main(String[] args) {
		
		int choice, item;
		
		Scanner sc = new Scanner(System.in);
		
		DLLMethods dm = new DLLMethods();
		System.out.println("MENU");
		System.out.println("1. Insert at Beginning ");
		System.out.println("2. Insert at End ");
		System.out.println("3. Delete at the beginning ");
		System.out.println("4. Delete at the end ");
		System.out.println("5. Display ");
		
		do
		{
			System.out.println("\n Enter your Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			    case 1: 
			    	   System.out.println("Enter an item to insert ");
			    	   item = sc.nextInt();
			    	   dm.insertBeg(item);
			    	   break;
			    case 2:
			    		System.out.println("Enter an item to insert ");
			    	    item = sc.nextInt();
			    	    dm.insertEnd(item);
			    	    break;
			    case 3: 
			    	    dm.deleteFirst();
			    	    break;
			    case 4: 
			    	    dm.deleteLast();
			    	    break;
			    case 5: 
			    	   dm.display();
			    	   break;
			    default:
			    	   System.out.println("Invalid choice");
		 } // end of the switch
		}
		while(choice<6);
 } // end of the main method

} // end of the class
