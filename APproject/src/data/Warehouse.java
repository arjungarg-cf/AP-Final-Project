package data;

import java.util.ArrayList;

public class Warehouse implements Superstore {
	private WarehouseAdministrator Admin;
	private String ID,Name;
	ArrayList<Category> Categories;

	static ArrayList<String> Waress;
	static ArrayList<Warehouse> Wares;
	
	//CONSTRUCTOR
	Warehouse(String name,String id)
	{
		this.ID=id;
		this.Name=name;
		this.Admin=null;
		Waress.add(name);
		
	}
	
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CostCalculation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EOQCalculation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckEOQ() {
		// TODO Auto-generated method stub
		
	}
	
	//GETTERS and Setters
	WarehouseAdministrator getadmin()
	{
		return this.Admin;
	}
	void setAdmin(WarehouseAdministrator a) {
		this.Admin=a;
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
