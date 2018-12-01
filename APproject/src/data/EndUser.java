package data;

public class EndUser{

private String LoginID,Password;

	EndUser(String id,String pass)
	{
		this.LoginID=id;
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
