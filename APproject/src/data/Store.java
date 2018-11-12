package data;

public class Store implements Superstore {
	StoreAdministrator Admin;
	private String LinkedWare_string;
	Warehouse LinkedWare_obj;
	private final int MaxItems;
	
	String getware()
	{
		return this.LinkedWare_string;
	}
	
	int getmaxitems()
	{
		return this.MaxItems;
	}
	

}
