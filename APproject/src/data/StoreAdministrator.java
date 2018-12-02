package data;

public class StoreAdministrator extends Store {
	private String LoginID,Password;
	private Store ownedstore;
	
	public StoreAdministrator(String storeid,String storename,Warehouse w,int max,String lid,String pass) {
		super(storeid,storename,w,max);
		this.LoginID=lid;
		this.Password=pass;
		this.ownedstore=null;
	}
	
	//function when storeadmin logs out
	void logout()
	{};
	public float manageEOQ(String cat,String subcat,String item,int d,int h,int k)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				sub=s.subcat.get(i);
		}
		
		for(int i=0;i<sub.Items.size();i++)
		{
			if(item.equals(sub.Items.get(i).getname()))
			{
				if(d!=-1)
				sub.Items.get(i).setd(d);
				if(h!=-1)
				sub.Items.get(i).seth(h);
				if(k!=-1)
				sub.Items.get(i).setk(k);
				return sub.Items.get(i).getEOQ();
			}
		}
		return -1f;
	}
	
	
	//Addition codes all copied from warehouse might want to check
	public boolean  addCat(String name)
	{
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(name.equals(this.ownedstore.Categories.get(i).getname()))
			{
				return false;
			}
			
		}
		Category c=new Category(name);
		this.ownedstore.Categories.add(c);
		return true;
		
	}
	

	public boolean addSubcat(String cat,String subcat)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				return false;
		}
		Sub_Category sub=new Sub_Category(s,subcat);
		s.addsubcat(sub);
		return true;
	}
	
	public boolean addItem(String cat,String subcat,String name,float cost,int quant)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				sub=s.subcat.get(i);
		}
		
		for(int i=0;i<sub.Items.size();i++)
		{
			if(name.equals(sub.Items.get(i).getname()))
				return false;
		}
		Item i=new Item(sub, name, quant, cost);
		sub.additem(i);
		return true;
	}
	

	//Updating Codes:
	public void updateCat(String cat,String name)
	{
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{

				this.ownedstore.Categories.get(i).setname(name);
				break;
			}
			
		}
	}
	
	public void updateSubcat(String cat,String subcat,String name)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				s.subcat.get(i).setname(name);
		}
		
	}
	
	public void updateItem(String cat,String subcat,String item,String name,int cost,int quant)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				sub=s.subcat.get(i);
		}
		
		for(int i=0;i<sub.Items.size();i++)
		{
			if(item.equals(sub.Items.get(i).getname()))
			{
				if(!name.equals("-1"))
					sub.Items.get(i).setname(name);
				if(cost!=-1)
					sub.Items.get(i).setcost(cost);
				if(quant!=-1)
					sub.Items.get(i).setquantity(quant);
			}
		}
	}
	

	//Deletion Codes:
	public boolean deleteCategory(String c)
	{
		
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(c.equals(this.ownedstore.Categories.get(i).getname()))
			{
				this.ownedstore.Categories.remove(i);
				return true;
				
			}
			
		}
		return false;
	}
	
	public boolean deleteSubCategory(String cat,String subcat)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		if(s==null)
			return false;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
			{
				s.subcat.remove(i);
				return true;
			}
		}
		return false;
		
	}
	
	public boolean deleteItem(String cat,String subcat,String item)
	{
		Category s=null;
		for(int i=0;i<this.ownedstore.Categories.size();i++)
		{
			if(cat.equals(this.ownedstore.Categories.get(i).getname()))
			{
				s=this.ownedstore.Categories.get(i);
				break;
			}
			
		}
		if(s==null)
			return false;
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
			{	sub=s.subcat.get(i);
				break;
			}
		}
		if(sub==null)
			return false;
		for(int i=0;i<sub.Items.size();i++)
		{
			if(item.equals(sub.Items.get(i).getname()))
			{	sub.Items.remove(i);
				return true;
			}
		}
		return false;
	}

	
	
	public void setStore(Store s)
	{
		this.ownedstore=s;
	}
	public String getloginid()
	{
		return this.LoginID;
	}
	
	public String getpass()
	{
		return this.Password;
	}
	
	public Store getStore()
	{
		return this.ownedstore;
	}

}
