package data;

public class Store extends Superstore {
	private StoreAdministrator Admin;
//	private String LinkedWare_string;
	private Warehouse LinkedWare_obj;
	private final int MaxItems;
	Store(StoreAdministrator sa,String id,String name,Warehouse w,int max){
		super(id,name);
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
	
	String getname()
	{
		return this.Name;
	}
	

}
