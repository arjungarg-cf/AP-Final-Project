package data;

public class WarehouseAdministrator extends Warehouse {
	private String LoginID,Password;
	
	WarehouseAdministrator(String name, String id,String lid,String pass) {
		super(name, id);	
		this.LoginID=lid;
		this.Password=pass;
		
		// TODO Auto-generated constructor stub
	}
	
	String getloginid()
	{
		return this.LoginID;
	}
	
	String getpass()
	{
		return this.Password;
	}
//additems daaliyo

}
