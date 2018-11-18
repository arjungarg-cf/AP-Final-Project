package application;
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;
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
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
		
	}
	
	public static void show_store_admin_from_welcome() throws IOException   // go to store admin base
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("store_manager_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	public static void show_warehouse_admin_from_welcome() throws IOException  // go to warehouse admin base
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("warehouse_manager_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	public static void show_end_user_from_welcome() throws IOException    // go to end user base
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("end_user_entry.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	// functions of super user (super user base)
	
	public static void go_back_to_welcome() throws IOException   // for back, home and logout button to welcome page
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void show_create_store() throws IOException   // show create store page 
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_store.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void show_create_warehouse() throws IOException   // show create warehouse page 
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_warehouse.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void show_view_store() throws IOException   // show view store page     //not working
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_view_store.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void show_view_warehouse() throws IOException  // show the view warehouse page
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_view_warehouse.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void create_warehouse_admin() throws IOException  //shows the create warehouse admin page
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
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
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_link_sw.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	
	// functions of create store page of super user
	
	public static void back_of_s_create_store() throws IOException   // to go back from the create store page
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void after_created() throws IOException     // after store is created where to goooooo
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("after_store_is_created.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	// functions of after store is created page
	public static void continue_creating() throws IOException     // to continue creating more stores
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_store.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	// functions of create warehouse page of the super user
	public static void after_warehouse_created() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("after_warehouse_created.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	// functions of after warehouse is created page
	public static void continue_creating_warehouses() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_warehouse.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	// functions of super link store and warehouse
	
	public static void gotoprev() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	public static void linking() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("after_link_is_created.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	//functions of after link is complete
	public static void continue_linking() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_link_sw.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	//functions of warehouse admin create
	
	public static void gobackfromhere() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	public static void create_warehouse_admin_after() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("after_warehouse_admin_is_created.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	//functions of afterwarehouse admin is created controller
	
	public static void continue_creating_warehouse_admin() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	public static void gobackfromthisplace() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("s_create_warehouse_admin.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
