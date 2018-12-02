package data;

import java.util.ArrayList;



/**
 * @author shankarprakriya
 * 
 */
public class Store extends Superstore {
	/**
	 * Admin is a StoreAdministrator type object which represents teh Store Admin of the store
	 */
	private StoreAdministrator Admin;

	/**
	 * LinkedWare_obj is Warehouse type object representing the Warehouse that the STore is linked to
	 */
	private Warehouse LinkedWare_obj;
	/**
	 *  MaxItems is and integer representing the maximum number of items a store can hold 
	 */
	private final int MaxItems;
	/**
	 *  String type ID and Name of the Store
	 */
	private String ID,Name;

	/**
	 * Storess is a String type Arraylist holding Names of all the Stores made 
	 */
	public static ArrayList<String> Storess;
	/**
	 *  Stores is a Store type ArrayList holding store type references to all Stores made
	 */
	public static ArrayList<Store> Stores;
	/**
	 * Categories is an ArrayList of Category type objects which contains the entire database of Items that the store has
	 */

	ArrayList<Category> Categories;
	
	//Constructor
	Store(String id,String name,Warehouse w,int max){
		this.ID=id;
		this.Name=name;
		this.Admin=null;
		this.LinkedWare_obj=w;
//		this.LinkedWare_string=w.getname();
		this.MaxItems=max;
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
	

	
	/**
	 * @return Integer type number denoting the maximum number of Items a Store can contain
	 */
	int getmaxitems()
	{
		return this.MaxItems;
	}
	
	/**
	 * @return String type value denoting the Name of the Store
	 */
	public String getname()
	{
		return this.Name;
	}
	/**
	 * @return String type value denoting the ID of the Store
	 */
	public String getID()
	{
		return this.ID;
	}
	/**
	 * @param w denotes a Warehouse type object passed to set the Warehouse linked to the Store
	 */
	void setWarehouse(Warehouse w)
	{
		this.LinkedWare_obj=w;
	}
	
	/**
	 * @param s is a Store Administrator type object passed to set the Store Administrator linked to the Store
	 */
	void setAdmin(StoreAdministrator s) {
		this.Admin=s;
	}

	

}
