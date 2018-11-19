package data;

public class Store implements Superstore {
	private StoreAdministrator Admin;
//	private String LinkedWare_string;
	private Warehouse LinkedWare_obj;
	private final int MaxItems;
	static ArrayList<>
	//CONSTRUCTOR
	Store(StoreAdministrator sa,Warehouse w,String s,int max){
		this.Admin=sa;
		this.LinkedWare_obj=w;
//		this.LinkedWare_string=w.getname();
		this.MaxItems=max;
		this.name=s;
	}
	
//	String getware()
//	{	
//		return this.LinkedWare_string;
//	}
	
	int getmaxitems()
	{
		return this.MaxItems;
	}
	
	String getname()
	{
		return this.name;
	}
	

}
