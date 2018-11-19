package data;

public class SuperUser extends SuperSuper {
	
	private String LoginID,Password;
	
	//GETTERS AND SETTERS
	String getloginid()
	{
		return this.LoginID;
	}
	
	String getpass()
	{
		return this.Password;
	}
	
	//other functions
	void CreateWarehouse(WarehouseAdministrator A,String name,String ID)
	{
		Warehouse W=new Warehouse(A,name,ID);
		W.Wares.add(W);
	}

	void CreateStore(StoreAdministrator s,Warehouse w,String n,int m) {
		Store S=new Store(s,w,n,m);
		Stores.add(S);
		
	}
}
