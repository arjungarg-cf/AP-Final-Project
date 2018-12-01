package data;

public class StoreAdministrator extends Store {
	private String LoginID,Password;
	
	public StoreAdministrator(String storeid,String storename,Warehouse w,int max,String lid,String pass) {
		super(storeid,storename,w,max);
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
