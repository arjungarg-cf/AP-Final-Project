package data;

public class Store implements Superstore {
	StoreAdministrator Admin;
//	private String LinkedWare_string;
	Warehouse LinkedWare_obj;
	private final int MaxItems;
	
	//CONSTRUCTOR
	Store(StoreAdministrator sa,Warehouse w,int max){
		this.Admin=sa;
		this.LinkedWare_obj=w;
//		this.LinkedWare_string=w.getname();
		this.MaxItems=max;
	}
	
//	String getware()
//	{
//		return this.LinkedWare_string;
//	}
	
	int getmaxitems()
	{
		return this.MaxItems;
	}
	

}
