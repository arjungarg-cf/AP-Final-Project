package data;

/**
 * @author shankarprakriya
 * This class is used to create and manipulate 'Item' which forms the basic element of the database
 */
/**
 * @author shankarprakriya
 *
 */
public class Item {

	/**
	 * Integer value for quantity present of the Item
	 */
	private int quantity;
	/**
	 * Float value for the cost of the Item
	 */
	private float cost;
	/**
	 * Sub Category type object 'sub' indicates the sub category to which Item belongs
	 */
	Sub_Category sub;
	/**
	 * String value for the name of the Item
	 */
	private	String name;
	/**
	 *  Integer values of d, h, k used for EOQ calculation of a particular Item
	 */
	private int d,h,k;
	
	
	Item(Sub_Category s,String n,int quan,float c)
	{
		this.sub=s;
		this.cost=c;
		this.quantity=quan;
		this.name=n;
		d=h=k=2;
	}
	
	//GETTER AND SETTERS
	
	/**
	 * @return returns quantity of the Item
	 */
	int getquantity(){
		return this.quantity;
		
	}
	
	/**
	 * @param a passed as argument to set the quantity of Item
	 */
	void setquantity(int a){
		this.quantity=a;
	}
	
	/**
	 * @return returns float type cost of the Item
	 */
	float getcost() {
		return this.cost;
	}
	
	/**
	 * @param a passed as argument to set the cost of the Item
	 */
	void setcost(float a){
		this.cost=a;
	}
	
	/**
	 * @return returns String type name of the Item
	 */
	String getname(){
		return this.name;
	}
	
	/**
	 * @param a String type argument passed to set name of the Item
	 */
	void setname(String a) {
		this.name=a;
	}
	/**
	 * @param a Integer type argument passed to set the value of d
	 */
	void setd(int a)
	{
		this.d=a;
	}

	/**
	 * @param a Integer type argument passed to set the value of h
	 */
	void seth(int a)
	{
		this.h=a;
	}

	/**
	 * @param a Integer type argument passed to set the value of k
	 */
	void setk(int a)
	{
		this.k=a;
	}
	/**
	 * @return returns Integer type value of k
	 */
	int getk() {
		return k;
	};
	/**
	 * @return returns Integer type value of h
	 */
	int geth() {
		return h;
	};
	/**
	 * @return returns Integer type value of d
	 */
	int getd() {
		return d;
	}
	
	/**
	 * @return returns float type EOQ value of the Item
	 */
	float getEOQ() {
		return (float) Math.sqrt(2*d*k/h);
	}
	
}
