package data;

import java.util.ArrayList;

public class Store extends Superstore {
	private StoreAdministrator Admin;
//	private String LinkedWare_string;
	private Warehouse LinkedWare_obj;
	private final int MaxItems;
	private String ID,Name;
	public static ArrayList<String> Storess;
	public static ArrayList<Store> Stores;
	ArrayList<Category> Categories;
	
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
	
	
//	String getware()
//	{	
//		return this.LinkedWare_string;
//	}
	
	int getmaxitems()
	{
		return this.MaxItems;
	}
	
	public String getname()
	{
		return this.Name;
	}
	public String getID()
	{
		return this.ID;
	}
	void setWarehouse(Warehouse w)
	{
		this.LinkedWare_obj=w;
	}
	
	void setAdmin(StoreAdministrator s) {
		this.Admin=s;
	}

	

}
