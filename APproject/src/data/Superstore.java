package data;

import java.util.ArrayList;

public abstract class Superstore {
	final String ID,Name;
	ArrayList<Category> Categories;
	
	Superstore(String id,String name)
	{
		this.ID=id;
		this.Name=name;
	}
	
}
