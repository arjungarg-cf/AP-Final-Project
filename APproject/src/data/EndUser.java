package data;

import java.util.ArrayList;

public class EndUser{
//
//private String LoginID,Password;	
//
//	EndUser(String id,String pass)
//	{
//		this.LoginID=id;
//		this.Password=pass;
//		
//	}
//	
	public static ArrayList<Category> searchCat(String store)
	{
		Store s=null;
		for(int i=0;i<Store.Stores.size();i++)
		{
			if(store.equals(Store.Stores.get(i).getname()))
			{
				s=Store.Stores.get(i);
				break;
			}
		}
		if(s!=null)
			return s.Categories;
		else 
			return null;
	
	}
	
	public static ArrayList<Sub_Category> searchSubcat(String store,String cat)
	{
		Store s=null;
		for(int i=0;i<Store.Stores.size();i++)
		{
			if(store.equals(Store.Stores.get(i).getname()))
			{
				s=Store.Stores.get(i);
				break;
			}
		}
		Category c=null;
		for(int i=0;i<s.Categories.size();i++)
		{
			if(s.Categories.get(i).getname().equals(cat))
			{
				c=s.Categories.get(i);
				break;
			}		
		}
		if(c!=null)
			return c.subcat;
		else
			return null;
		
	}
	
	public static ArrayList<Item> searchItem(String store,String cat,String sub)
	{
		Store s=null;
		for(int i=0;i<Store.Stores.size();i++)
		{
			if(store.equals(Store.Stores.get(i).getname()))
			{
				s=Store.Stores.get(i);
				break;
			}
		}
		Category c=null;
		for(int i=0;i<s.Categories.size();i++)
		{
			if(s.Categories.get(i).getname().equals(cat))
			{
				c=s.Categories.get(i);
				break;
			}		
		}
		Sub_Category sc=null;
		for(int i=0;i<c.subcat.size();i++)
		{
			if(c.subcat.get(i).getname().equals(sub))
			{	sc=c.subcat.get(i);
				break;
			}
		}
		if(sc!=null)
			return sc.Items;
		else
			return null;
	}
	
	public ArrayList<String> getAllItems(){
		ArrayList<String> r=new ArrayList<String>();
		for(int i=0;i<Store.Stores.size();i++)
		{
			Store s=Store.Stores.get(i);
			for(int j=0;j<s.Categories.size();j++)
			{
				Category c=s.Categories.get(j);
				for(int k=0;k<c.subcat.size();k++)
				{
					Sub_Category sub=c.subcat.get(k);
					for(int l=0;l<sub.Items.size();l++)
					{
						if(r.contains(sub.Items.get(l).getname()))
							r.add(sub.Items.get(l).getname());
							
					}
				}
			}
		}
		r.sort(null);
		return r;
	}
	
	public ArrayList<String> SearchItem(String name)
	{
		ArrayList<String> r=this.getAllItems();
		ArrayList<String> r1=new ArrayList<String>();
		for(int i=0;i<r.size();i++)
		{
			if(r.get(i).contains(name))
				r1.add(r.get(i));
		}
		return r1;
	}
	
//	String getloginid()
//	{
//		return this.LoginID;
//	}
//	
//	String getpass()
//	{
//		return this.Password;
//	}
}
