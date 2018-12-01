package data;

import java.util.ArrayList;

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
		Warehouse W=new Warehouse(name,ID);
		W.setAdmin(A);
		W.Wares.add(W);
		W.Waress.add(W.getname());
	}

	void CreateStore(StoreAdministrator s,String id,Warehouse w,String n,int m) {
		Store S=new Store(id, n, w, m);
		S.setAdmin(s);
		Stores.add(S);
		S.Stores.add(S);
		S.Storess.add(S.getname());
		
	}
	
	Store ViewStore(String store) {
		for(int i=0;i<Store.Storess.size();i++)
		{
			if(store.equals(Store.Stores.get(i).getname()))
				return Store.Stores.get(i);
		}
		return null;
		
	}
	
	Warehouse ViewWarehouse(String ware)
	{
		for(int i=0;i<Warehouse.Wares.size();i++)
		{
			if(ware.equals(Warehouse.Wares.get(i).getname()))
				return Warehouse.Wares.get(i);
		}
		return null;
	}
	
	void LinkStoW(String s,String w)
	{
		Store st=null;
		for(int i=0;i<Store.Storess.size();i++)
		{
			if(s.equals(Store.Stores.get(i).getname()))
				st=Store.Stores.get(i);
		}
		Warehouse wa=null;
		for(int i=0;i<Warehouse.Wares.size();i++)
		{
			if(w.equals(Warehouse.Wares.get(i).getname()))
				wa=Warehouse.Wares.get(i);
		}
		if(wa!=null && st!=null)
			st.setWarehouse(wa);
			
	}
	
	void CreateWarehouseadmin(String storename, String storeid,String lid,String pass) {
		WarehouseAdministrator W=new WarehouseAdministrator(storename, storeid, lid, pass);
		UserData.Wareadmin.add(W);
		
	}
	
	void CreateStoreAdmin(String storeid,String storename,Warehouse w,int max,String lid,String pass)
	{
		StoreAdministrator s=new StoreAdministrator(storeid, storename, w, max, lid, pass);
		UserData.Storeadmin.add(s);
	}
	
}
