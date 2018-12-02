package data;

import java.util.ArrayList;


/**
 * @author shankarprakriya
 * This class is for warehouses 
 */
public class Warehouse extends Superstore {
	/**
	 *  Warehouse administrator 
	 */
	private WarehouseAdministrator Admin;
	/**
	 *  String value of the login ID and Name of the Warehouse
	 */
	private String ID,Name;
	/**
	 *  ArrayList of Category type objects
	 */
	public ArrayList<Category> Categories;

	/**
	 *  ArrayList having String type name value of all warehouses
	 */
	public static ArrayList<String> Waress;
	/**
	 *  ArrayList having Warehosue type objects of all warehouses
	 */
	public static ArrayList<Warehouse> Wares;
	
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
	
	public String getname()
	{
		return this.Name;
	}
	
	public String getID()
	{
		return this.ID;
	}
	
	/**
	 * @param cat is String type name of the Category 
	 * @return returns Category type object reference of the Category whos name was passed as parameter
	 */
	public Category getCat(String cat)
	{
		for(Category i:Categories) {
			if(i.getname().equals(cat))
				return i;
		}
		return null;
	}


}
