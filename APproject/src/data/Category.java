package data;
//Complete mostlikely
import java.util.ArrayList;
import java.util.Comparator;

public class Category implements Comparable<Category> {
	
	ArrayList<Sub_Category> subcat;
	private String name;
	//CONSTRUCTOR
	Category(String n){
		this.name=n;
		this.subcat=null;
	}
	
	@Override
	public int compareTo(Category o)
	{
		if(this.name.compareTo(o.getname())>1)
			return 1;
		else if(this.name.equals(o.getname()))
			return 0;
		else
			return -1;
	}
	
	//GETTER AND SETTER
	String getname()
	{
		return this.name;
	}
	void setname(String s)
	{
		this.name=s;
	}
	
	//other
	void addsubcat(Sub_Category s) {
		this.subcat.add(s);
	}
	
	
	
}
