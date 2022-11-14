import java.util.ArrayList;

public class groceryList {       //create arraylist
           private ArrayList <String> grocerylist = new ArrayList <String>();
 
public void addGroceryItem(String item) {
	        
	       grocerylist.add(item);
}
public void printGroceryItem() {
	       System.out.println("Your grocery list has "+grocerylist.size()+"items");
	       for(int i=0; i<grocerylist.size() ; i++) {
	       System.out.println((i+1)+ "." +grocerylist.get(i));
	       }
}
public void modifyGroceryList(int position, String item) {
	       
	       grocerylist.set(position, item);
	       System.out.println("your grocery list has been modified");
}
public void removeGroceryList(int position) {
	       grocerylist.remove(position);
	       System.out.println("Item at "+position+ "has been removed");
}
public String findItem(String searchItem) {
	      // Boolean exists = grocerylist.contains(searchItem);
	       
	       int value = grocerylist.indexOf(searchItem);
	       if (value >=0 ) {
	    	   return grocerylist.get(value);
	       }
	       return null;
}

}
