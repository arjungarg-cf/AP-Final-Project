package data;


/**
 * @author shankarprakriya
 * This class describes Warehouse Admins
 */
public class WarehouseAdministrator extends Warehouse {
	
	/**
	 *  String type Login credentials
	 */
	private String LoginID,Password;
	
	/**
	 * Warehouse that the Warehosue administrator is linked to
	 */
	private Warehouse ownedware;
	WarehouseAdministrator(String name, String id,String lid,String pass) {
		super(name, id);	
		this.LoginID=lid;
		this.Password=pass;
		ownedware=null;
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param cat string name of Category
	 * @param subcat String name of the sub category
	 * @param item String name of the item
	 * @param d
	 * @param h
	 * @param k
	 * @return float EOQ of the Item
	 */
	float manageEOQ(String cat,String subcat,String item,int d,int h,int k)
	{
		Category s=null;
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
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
	
	//Addition Codes:
	/**
	 * @param name String name of the category which has to be added
	 * @return boolean value indiacting if the value can be added or not
	 */
	public boolean  addCat(String name)
	{
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(name.equals(this.ownedware.Categories.get(i).getname()))
			{

				return false;
			}
			
		}
		Category c=new Category(name);
		this.ownedware.Categories.add(c);
		return true;
		
	}
	
	public boolean addSubcat(String cat,String subcat)
	{
		Category s=null;
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
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
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
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
	public boolean updateCat(String cat,String name)
	{
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				this.ownedware.Categories.get(i).setname(name);
				return true;
				
			}
			
		}
		return false;
	}
	
	public boolean updateSubcat(String cat,String subcat,String name)
	{
		Category s=null;
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
				break;
			}
			
		}
		if(s==null)
			return false;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
			{
				s.subcat.get(i).setname(name);
				return true;
			}
				
		}
		return false;
		
	}
	
	public boolean updateItem(String cat,String subcat,String item,String name,int cost,int quant)
	{
		Category s=null;
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
				break;
			}
			
		}
		if(s==null)
			return false;
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				sub=s.subcat.get(i);
		}
		if(subcat==null)
			return false;
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
				return true;
			}
		}
		return false;
	}
	
	
	//Deletion Codes:
	/**
	 * @param c String name of the Category
	 * @return boolean 
	 */
	public boolean deleteCategory(String c)
	{
		
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(c.equals(this.ownedware.Categories.get(i).getname()))
			{
				this.ownedware.Categories.remove(i);
				return true;
				
			}
			
		}
		return false;
	}
	
	public boolean deleteSubCategory(String cat,String subcat)
	{
		Category s=null;
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
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
		for(int i=0;i<this.ownedware.Categories.size();i++)
		{
			if(cat.equals(this.ownedware.Categories.get(i).getname()))
			{
				s=this.ownedware.Categories.get(i);
				break;
			}
			
		}
		if(s==null)
			return false;
		Sub_Category sub=null;
		for(int i=0;i<s.subcat.size();i++)
		{
			if(subcat.equals(s.subcat.get(i).getname()))
				sub=s.subcat.get(i);
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
	
	void setWare(Warehouse w)
	{
		this.ownedware=w;
	}
	public Warehouse getWare()
	{
		return this.ownedware;
	}
	public String getid()
	{
		return this.LoginID;
	}
	
	public String getpass()
	{
		return this.Password;
	}


}
