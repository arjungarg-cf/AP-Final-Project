package data;
//Complete
public class Item {

	private int quantity;
	private float cost;
	Sub_Category sub;
	private	String name;
	
	//CONSTRUCTOR
	Item(Sub_Category s,String n,int quan,float c)
	{
		this.sub=s;
		this.cost=c;
		this.quantity=quan;
		this.name=n;
	}
	
	//GETTER AND SETTERS
	int getquantity(){
		return this.quantity;
		
	}
	
	void setquantity(int a){
		this.quantity=a;
	}
	
	float getcost() {
		return this.cost;
	}
	
	void setcost(float a){
		this.cost=a;
	}
	
	String getname(){
		return this.name;
	}
	
	void setname(String a) {
		this.name=a;
	}
}
