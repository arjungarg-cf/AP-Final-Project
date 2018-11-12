package data;
//Complete mostlikely
import java.util.ArrayList;

public class Category {
	
	ArrayList<Sub_Category> subcat;
	private String name;
	//CONSTRUCTOR
	Category(String n){
		this.name=n;
		this.subcat=null;
	}
	
	//GETTER AND SETTER
	String getname()
	{
		return this.name;
	}
	
	//other
	void addsubcat(Sub_Category s) {
		this.subcat.add(s);
	}
	
	
	
}
