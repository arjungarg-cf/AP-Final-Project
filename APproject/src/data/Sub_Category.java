package data;
//Complete Mostlikely
import java.util.ArrayList;

public class Sub_Category {
	String name;
	Category Category;
	ArrayList<Item> Items;
	
	//CONSTRUCTOR
	Sub_Category(Category c,String n)
	{
		this.name=n;
		this.Category=c;
		this.Items=null;
	}
	
	//GETTERS AND SETTERS
	String getname()
	{
		return this.name;
	}
	
	//Other fucntions
	void additem(Item a) {
		this.Items.add(a);
	}
	
	

}
