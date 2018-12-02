package application;
import java.io.IOException;

import data.StoreAdministrator;
import data.SuperUser;
import data.WarehouseAdministrator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;
	static WarehouseAdministrator W;
	static StoreAdministrator S;
	static SuperUser Su;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("Superstore");
		showMainView();
		
	}
	
	private void showMainView() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
		mainLayout = loader.load();
		Scene scene=new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	// all functions for welcome page
	
	
	
	public static void showsuperfromwelcome() throws IOException  // go to super user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("login_page.fxml"));
		//loader.setLocation(Main.class.getResource("super_user_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Super User");
		stage.setScene(new Scene(root1));
		stage.show();
		
		
		
	}
	
	public static void show_store_admin_from_welcome() throws IOException   // go to store admin base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("login_store_admin.fxml"));
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Store Manager");
		stage.setScene(new Scene(root1));
		stage.show();
		
		//loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
	}
	public static void show_warehouse_admin_from_welcome() throws IOException  // go to warehouse admin base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("login_warehouse_admin.fxml"));
		//loader.setLocation(Main.class.getResource("warehouse_manager_base.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Warehouse Manager");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	public static void show_end_user_from_welcome() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_actual_entry.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	// functions of super user (super user base)
	
//	public static void go_back_to_welcome() throws IOException   // for back, home and logout button to welcome page
//	{
//		FXMLLoader loader= new FXMLLoader(Main.class.getResource("Welcome_page.fxml"));
////		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//		
//		Stage stage=new Stage();
//		Parent root1=(Parent) loader.load();
//		stage.setTitle("Welcome page");
//		stage.setScene(new Scene(root1));
//		stage.show();
//		//stage.close();
//		
//	}
//	
	public static void show_create_store() throws IOException   // show create store page 
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_create_store.fxml"));
		//loader.setLocation(Main.class.getResource("s_create_store.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Create Store");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void show_create_warehouse() throws IOException   // show create warehouse page 
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_create_warehouse.fxml"));
		//loader.setLocation(Main.class.getResource("s_create_warehouse.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Create Warehouse");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void show_view_store() throws IOException   // show view store page     //not working
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_view_store.fxml"));
		//loader.setLocation(Main.class.getResource("s_view_store.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("View Store");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void show_view_warehouse() throws IOException  // show the view warehouse page
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_view_warehouse.fxml"));
		//loader.setLocation(Main.class.getResource("s_view_warehouse.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("View Warehouse");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void create_warehouse_admin() throws IOException  //shows the create warehouse admin page
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_create_warehouse_admin.fxml"));
		//loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Create warehouse Administrator");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
//	public static void create_store_admin() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("s_view_store.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	
	public static void link_store_warehouse() throws IOException   // show the link store to warhouse page for super user
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_link_sw.fxml"));
//		loader.setLocation(Main.class.getResource("s_link_sw.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Link Store to Warehouse");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	
	// functions of create store page of super user
	
	public static void back_of_s_create_store() throws IOException   // to go back from the create store page
	{
//		FXMLLoader loader= new FXMLLoader(Main.class.getResource("super_user_base.fxml"));
////		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//		Stage stage=new Stage();
//		Parent root1=(Parent) loader.load();
//		stage.setTitle("Super User");
//		stage.setScene(new Scene(root1));
//		stage.show();
	}
	
	public static void after_created() throws IOException     // after store is created where to goooooo
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_store_is_created.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_is_created.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Store is created!");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	// functions of after store is created page
//	public static void continue_creating() throws IOException     // to continue creating more stores
//	{
//		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_create_store.fxml"));
////		loader.setLocation(Main.class.getResource("s_create_store.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//		Stage stage=new Stage();
//		Parent root1=(Parent) loader.load();
//		stage.setTitle("Create Store");
//		stage.setScene(new Scene(root1));
//		stage.show();
//	}
//	
	// functions of create warehouse page of the super user
	public static void after_warehouse_created() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_created.fxml"));
		//loader.setLocation(Main.class.getResource("after_warehouse_created.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Warehouse is created!");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	// functions of after warehouse is created page
//	public static void continue_creating_warehouses() throws IOException								//here
//	{
//		FXMLLoader loader= new FXMLLoader(Main.class.getResource("s_create_warehouse.fxml"));
////		loader.setLocation(Main.class.getResource("s_create_warehouse.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//		Stage stage=new Stage();
//		Parent root1=(Parent) loader.load();
//		
//		stage.setScene(new Scene(root1));
//		stage.show();
//	}
//	
	// functions of super link store and warehouse
	
	
//	public static void gotoprev() throws IOException														//here
//	{
////		FXMLLoader loader= new FXMLLoader(Main.class.getResource("super_user_base.fxml"));
//////		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
//////		BorderPane super1 = loader.load();
//////		mainLayout.setCenter(super1);
////		Stage stage=new Stage();
////		Parent root1=(Parent) loader.load();
////		stage.setTitle("Warehouse is created!");
////		stage.setScene(new Scene(root1));
////		stage.show();
//	}
	public static void linking() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_link_is_created.fxml"));
//		loader.setLocation(Main.class.getResource("after_link_is_created.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	
	//functions of after link is complete
//	public static void continue_linking() throws IOException										//here
//	{
////		FXMLLoader loader= new FXMLLoader();
////		loader.setLocation(Main.class.getResource("s_link_sw.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//	}
//	
	//functions of warehouse admin create
	
//	public static void gobackfromhere() throws IOException											//here
//	{
////		FXMLLoader loader= new FXMLLoader();
////		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//	}
	public static void create_warehouse_admin_after() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_admin_is_created.fxml"));
//		loader.setLocation(Main.class.getResource("after_warehouse_admin_is_created.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	
	//functions of afterwarehouse admin is created controller
	
//	public static void continue_creating_warehouse_admin() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
////		loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
////		BorderPane super1 = loader.load();
////		mainLayout.setCenter(super1);
//		Stage stage=new Stage();
//		Parent root1=(Parent) loader.load();
//		stage.setTitle("");
//		stage.setScene(new Scene(root1));
//		stage.show();
//	}
//	public static void gobackfromthisplace() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	
	// functions of warehouse manager:
	
	//public static void 
	
	public static void w_updateitems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("w_updateitems.fxml"));
//		loader.setLocation(Main.class.getResource("w_updateitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Update Items");
		stage.setScene(new Scene(root1));
		stage.show();
		
		
	}
	public static void w_manageEOQ() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("w_manageEOQ.fxml"));
//		loader.setLocation(Main.class.getResource("w_manageEOQ.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Manage EOQ");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	public static void w_delete_subitems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("w_deletesubitems.fxml"));
//		loader.setLocation(Main.class.getResource("w_deletesubitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Delete Sub-items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	public static void w_additems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("w_additems.fxml"));
//		loader.setLocation(Main.class.getResource("w_additems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Add Sub-items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
//	public static void gobackfromwarehousebase() throws IOException									here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	
	
	// functions of warehouse update items:
//	public static void gobackfrom_w_updateitems() throws IOException								here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("warehouse_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	public static void goeditingfrom_warehouse() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_Admin_edits.fxml"));
//		loader.setLocation(Main.class.getResource("after_warehouse_Admin_edits.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
	
	}
	//functions of warehouse administrator manage EOQ:
//	public static void gobackfrom_manage() throws IOException												here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("warehouse_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	public static void continuelastbutton() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_admin_edits_EOQ.fxml"));
//		loader.setLocation(Main.class.getResource("after_warehouse_admin_edits_EOQ.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	//functions of warehouse admin delete subitems:
//	public static void gobackfrom_delete() throws IOException												here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("warehouse_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	public static void go_delete_button() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_admin_deletes.fxml"));
//		loader.setLocation(Main.class.getResource("after_warehouse_admin_deletes.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	//functions of after warehouse deletes:
	
//	public static void go_continuedeleting() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("w_deletesubitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	
	
	//functions of warehouse adds new subitems:
	public static void go_add_subitems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_warehouse_admin_add_new_subitems.fxml"));
//		loader.setLocation(Main.class.getResource("after_warehouse_admin_add_new_subitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	
	//functions of after adding subitems for warehouse administrator:
	
//	public static void go_continueadding() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("w_additems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
//	
	//functions of after warehouse admin edits items:
	
	public static void go_continueedits() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("w_updateitems.fxml"));
//		loader.setLocation(Main.class.getResource("w_updateitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Edit Items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	//functions of after warhouse admin checks EOQ:
	
//	public static void go_continuechecking() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("w_manageEOQ.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	
	//functions of store manager base page:
	
	public static void s_updateitems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("store_admin_update_items.fxml"));
//		loader.setLocation(Main.class.getResource("store_admin_update_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Update Items");
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	public static void s_manageEOQ() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("store_admin_manageEOQ.fxml"));
//		loader.setLocation(Main.class.getResource("store_admin_manageEOQ.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Update Items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	public static void s_delete_subitems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("store_admin_deletesubitems.fxml"));
//		loader.setLocation(Main.class.getResource("store_admin_deletesubitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Delete Items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	public static void s_additems() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("store_admin_additems.fxml"));
//		loader.setLocation(Main.class.getResource("store_admin_additems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("Add Items");
		stage.setScene(new Scene(root1));
		stage.show();
	}
//	public static void gobackfromstoreadminbase() throws IOException								HERE
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
//	
	//functions of store manager updates items:
//	public static void gobackfrom_store_admin_updateitems() throws IOException							here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	}
	public static void goeditingfrom_store() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_store_Admin_edits.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_Admin_edits.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
//	
	}
	
	//fucntions of after stroe admin updates:
	
//	public static void go_store_edits() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_admin_update_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
	//functions of manage EOQ for store:
//	public static void gobackfrom_store_manager() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
	
	
	//functions of store manager delete subitems:
//	public static void gobackfrom_delete_store_admin() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
	public static void go_delete_button_store() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_store_admin_deletes_subitem.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_admin_deletes_subitem.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	
	//functions of after store admin deletes subitem:
//	public static void go_continuedeleting_store() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_admin_deletesubitems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
//	
	//functions of store admin additems:
//	public static void gobackfrom_delete_store() throws IOException										here
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
	
	public static void go_add_subitems_store() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("after_store_admin_adds_items.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_admin_adds_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
//	
	}
	//functions of after store admin adds 
//	public static void go_continueadding_storee() throws IOException
//	{
//		FXMLLoader loader= new FXMLLoader();
//		loader.setLocation(Main.class.getResource("store_admin_additems.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
//	
//	}
//	
	
	
	//functions of end user:
	
	public static void go_search_store_end_user() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_search.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_admin_adds_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
//	
	}
	
	
	public static void go_search_from_category() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_subcategory_avail.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_admin_adds_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
//	
	}
	public static void go_search_from_sub() throws IOException
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_search_from_category.fxml"));
//		loader.setLocation(Main.class.getResource("after_store_admin_adds_items.fxml"));
//		BorderPane super1 = loader.load();
//		mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("");
		stage.setScene(new Scene(root1));
		stage.show();
//	
	}
	public static void go_search_from_item() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_check_availability.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	
	public static void go_searching_from_end() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_entry.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	
	public static void go_end_user_availability() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_search.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}

	
	
	//functions of login
	
	//super user:
	public static void getlogin_tosuper() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("super_user_base.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	//warehosue admin:
	
	public static void login_from_warehosue_Admin() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("warehouse_manager_base.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	//store admin:
	public static void login_from_store_admin() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("warehouse_manager_base.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	
	
	//end user another addn
	public static void load_browse1() throws IOException    
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("browse_store.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void load_browse2() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("end_user_browse.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void load_browse3() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("browse_subcate.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	public static void load_browse4() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("browse_items.fxml"));
		//loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		//BorderPane super1 = loader.load();
		//mainLayout.setCenter(super1);
		Stage stage=new Stage();
		Parent root1=(Parent) loader.load();
		stage.setTitle("End User");
		stage.setScene(new Scene(root1));
		stage.show();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
