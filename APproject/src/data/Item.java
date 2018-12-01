package data;
//Complete
public class Item {

	private int quantity;
	private float cost;
	Sub_Category sub;
	private	String name;
	private int d,h,k;
	//CONSTRUCTOR
	Item(Sub_Category s,String n,int quan,float c)
	{
		this.sub=s;
		this.cost=c;
		this.quantity=quan;
		this.name=n;
		d=h=k=2;
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
	void setd(int a)
	{
		this.d=a;
	}

	void seth(int a)
	{
		this.h=a;
	}

	void setk(int a)
	{
		this.k=a;
	}
	int getk() {
		return k;
	};
	int geth() {
		return h;
	};
	int getd() {
		return d;
	}
	
	float getEOQ() {
		return (float) Math.sqrt(2*d*k/h);
	}
	
}
