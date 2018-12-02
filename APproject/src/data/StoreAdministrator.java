package data;



/**
 * @author shankarprakriya
 * This class represents Store Administrator which extends the class Store
 *
 */
public class StoreAdministrator extends Store {
	/**
	 * String type LoginID and password to store the login credentials of the Store Administrator
	 */
	private String LoginID,Password;
	/**
	 *  Store type object represents the Store that the Store Administrator is linked to  
	 */
	private Store ownedstore;
	
	
	public StoreAdministrator(String lid,String pass) {
		super(null,null,null,0);
		this.LoginID=lid;
		this.Password=pass;
		this.ownedstore=null;
	}
	
	//function when storeadmin logs out
	void logout()
	{};
	
	/**
	 * @param cat is a String type (name) value representing the Category of the item whos EOQ is to be calculated
	 * @param subcat is a String type (name) value representing the Sub-Category of the item whos EOQ is to be calculated
	 * @param item is a String type (name) value represnting the items whos EOQ is to be calculated
	 * @param d is the Integer type value used for EOQ calculation
	 * @param h is the Integer type value used for EOQ calculation
	 * @param k is the Integer type value used for EOQ calculation
	 * @return
	 */
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
	/**
	 * @param name is a String value representing the name of the Category that is to be added  
	 * @return boolean value indicating if the Category can or cannot be added
	 */
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
	

	/**
	 * @param cat is a String type value represnting the name of the Category that under which Sub category is to be added
	 * @param subcat is a String type value represnting the name of the Sub-Category that is to be added
	 * @return a boolean value indicating if the Sub category can or cannot be added
	 */
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
	
	/**
	 * @param cat String type value representing the Category under which Item is to be added
	 * @param subcat String type value representing the Sub-Category under which Item is to be added
	 * @param name String type value of the name of the Item to be added 
	 * @param cost Float type cost of the item to be added
	 * @param quant Integer value of the quantity of the item to be added
	 * @return a boolean value indicating whether the Item can or cannot be added
	 */
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
	/**
	 * @param cat String type name of the Category that we wish to update
	 * @param name String type value of the new name of the category
	 */
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
	
	/**
	 * @param cat String type name of the category under which the sub-category we want to update is present
	 * @param subcat String type name of the sub-category we wish to update
	 * @param name String type value of the new name of the category
	 */
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
	
	/**
	 * @param cat String type name of the category under which the Item we want to update is present
	 * @param subcat String type name of the sub-category under which the Item we want to update is present
	 * @param item name String type value of the new name of the category
	 * @param name new name we wish to give the Item
	 * @param cost new Cost we wish to assign to the Item
	 * @param quant new Quantity we wish to assign to the Item
	 */
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
	/**
	 * @param c String type value of the name of the category we wish to delete
	 * @return returns a boolean value indicating if the deletion can or cannot be made
	 */
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
	
	/**
	 * @param cat String type value of the Category name under which the subcategory is present
	 * @param subcat String type value of the name of 
	 * 
	 * @return returns boolean type value indicating if sub category can be deletd or not
	 */
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
