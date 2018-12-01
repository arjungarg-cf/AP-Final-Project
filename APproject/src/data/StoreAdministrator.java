package data;

public class StoreAdministrator extends Store {
	private String LoginID,Password;
	
	public StoreAdministrator(StoreAdministrator sa,String id,String name,Warehouse w,int max,String lid,String pass) {
		super(sa,id,name,w,max);
		this.LoginID=lid;
		this.Password=pass;
	}
	
	String getloginid()
	{
		return this.LoginID;
	}
	
	String getpass()
	{
		return this.Password;
	}

}
