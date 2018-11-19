package data;

import java.util.ArrayList;

public class Warehouse extends Superstore {
	private WarehouseAdministrator Admin;

	static ArrayList<String> Waress;
	static ArrayList<Warehouse> Wares;
	
	//CONSTRUCTOR
	Warehouse(WarehouseAdministrator a,String name,String id)
	{
		super(id,name);
		this.Admin=a;
		Waress.add(name);
		
	}
	
	//GETTERS and Setters
	WarehouseAdministrator getadmin()
	{
		return this.Admin;
	}
	
	String getname()
	{
		return this.Name;
	}
	
	String getID()
	{
		return this.ID;
	}
}
