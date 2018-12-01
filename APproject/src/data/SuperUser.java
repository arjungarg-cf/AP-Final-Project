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
		W.Waress.add(W.getname());
	}

	void CreateStore(StoreAdministrator s,String id,Warehouse w,String n,int m) {
		Store S=new Store(s, id, n, w, m);
		Stores.add(S);
		S.Stores.add(S);
		S.Storess.add(S.getname());
		
	}
	
	ArrayList<String> 
	
}
