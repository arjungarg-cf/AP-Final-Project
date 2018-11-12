package data;

import java.util.ArrayList;

public class Warehouse implements Superstore {
	private WarehouseAdministrator Admin;
	static ArrayList<Warehouse> Wares;
	
	
	//GETTERS and Setters
	WarehouseAdministrator getadmin()
	{
		return this.Admin;
	}
}
