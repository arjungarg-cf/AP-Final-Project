package data;

import java.util.ArrayList;
import java.util.Comparator;



/**
 * This class contains an ArrayList of sub-category type objects
 * @author shankarprakriya
 *
 */
public class Category implements Comparable<Category> {
	
	/**
	 * This is an ArrayList of sub category type objects that are under category
	 */
	ArrayList<Sub_Category> subcat;
	/**
	 * String value holding the name of the category
	 */
	private String name;
	//CONSTRUCTOR
	Category(String n){
		this.name=n;
		this.subcat=null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
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
	
	
	/**
	 * @return returns String  type name of the Category
	 */
	String getname()
	{
		return this.name;
	}
	/**
	 * @param s is a String type object used to set name of the Category
	 */
	void setname(String s)
	{
		this.name=s;
	}
	
	
	/**
	 * @param s is a Sub_Category type object passed to add sub category to this category 
	 */
	void addsubcat(Sub_Category s) {
		this.subcat.add(s);
	}
	
	
	
}
