package data;

public class EndUser extends Store{

private String LoginID,Password;

	EndUser(String id,String pass)
	{
		super(null,null,null,null,null);
		
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
