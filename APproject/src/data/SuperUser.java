package data;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public class SuperUser extends SuperSuper {
	
	private String LoginID,Password;
	
	
	//GETTERS AND SETTERS
	public String getloginid()
	{
		return this.LoginID;
	}
	
	public String getpass()
	{
		return this.Password;
	}
	
	//other functions
	public void CreateWarehouse(WarehouseAdministrator A,String name,String ID)
	{
		Warehouse W=new Warehouse(name,ID);
		Wares.add(W);
		Warehouse.Wares.add(W);
		Warehouse.Waress.add(W.getname());
		A.setWare(W);
		A.setAdmin(A);
	}

	public boolean CreateStore(String b,String id,Warehouse w,String n,int m) {
		StoreAdministrator A=null;
		for(int i=0;i<UserData.Storeadmin.size();i++)
		{
			if(UserData.Storeadmin.get(i).getname().equals(b))
				A=UserData.Storeadmin.get(i);
		}
		if(A==null)
			return false;
		Store S=new Store(id, n, w, m);
		A.setAdmin(A);
		A.setStore(S);
		Stores.add(S);
		Store.Stores.add(S);
		Store.Storess.add(S.getname());
		return true;
		
	}
	
	public Store ViewStore(String store) {
		for(int i=0;i<Store.Storess.size();i++)
		{
			if(store.equals(Store.Stores.get(i).getname()))
				return Store.Stores.get(i);
		}
		return null;
		
	}
	
	public Warehouse ViewWarehouse(String ware)
	{
		for(int i=0;i<Warehouse.Wares.size();i++)
		{
			if(ware.equals(Warehouse.Wares.get(i).getname()))
				return Warehouse.Wares.get(i);
		}
		return null;
	}
	
	public void LinkStoW(String s,String w)
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
	
	public void CreateWarehouseadmin(String lid,String pass) {
		WarehouseAdministrator W=new WarehouseAdministrator(null, null, lid, pass);
		UserData.Wareadmin.add(W);
		
	}
	
	
	
	public void CreateStoreAdmin(Warehouse w,int max,String lid,String pass)
	{
		StoreAdministrator s=new StoreAdministrator(null, null, w, max, lid, pass);
		UserData.Storeadmin.add(s);
	}
	
}
