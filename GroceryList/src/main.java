import java.util.Scanner;

public class main {
	private static Scanner scanner = new Scanner(System.in);
	private static groceryList grocerylist = new groceryList();
	
	public static void main(String[] args) {
	Boolean quit = false;
	int choice =0;
	printInstruction();
	while(!quit) {
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		scanner.nextLine();
		switch(choice) {
		case 0:
			printInstruction();
			break;
		case 1:
			grocerylist.printGroceryItem();
			break;
		case 2:
			addItem();
			break;
		case 3:
			modifyItem();
			break;
		case 4:
			removeItem();
			break;
		case 5:
			searchForItem();
			break;
		case 6:
			quit=true;
			break;
			
		}
	}
	}
public static void printInstruction() {
	    System.out.println("\nPress");
	    System.out.println("\t 0 - To enter your choice");
	    System.out.println("\t 1 - To print your grocery list");
	    System.out.println("\t 2 - To add an item in your grocery list");
	    System.out.println("\t 3 - To modify your grocery list");
	    System.out.println("\t 4 - To remove an item from your grocery list");
	    System.out.println("\t 5 - To search for an item in your grocery list");
}
public static void addItem() {
	    System.out.println("Please enter an item to add to your grocery list");
		grocerylist.addGroceryItem(scanner.nextLine());
	}
public static void modifyItem() {
	   System.out.println("Please enter item number to modify");
	   int itemNo =scanner.nextInt();
	   scanner.nextLine();
	   System.out.println("Enter replacement item");
	   String newItem = scanner.nextLine();
	   grocerylist.modifyGroceryList(itemNo - 1, newItem);

}
public static void removeItem() {
	   System.out.println("Please enter an item number to remove");
	   int itemNo = scanner.nextInt();
	   scanner.nextLine();
	   grocerylist.removeGroceryList(itemNo);
}
public static void searchForItem() {
	   System.out.println("Enter an item to search");
	   String item = scanner.nextLine();
	   if (grocerylist.findItem(item) != null) {
		   System.out.println("The item "+item+ "has been found in your grocery list");
	   }
	   else {
		   System.out.println("Item not found");
	   }
	   
}
}
