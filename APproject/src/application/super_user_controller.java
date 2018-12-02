package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.Store;

public class super_user_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button Home;
	@FXML private javafx.scene.control.Button Back;
	@FXML private javafx.scene.control.Button Logout;
	@FXML private javafx.scene.control.TextField waretext;
	@FXML private javafx.scene.control.TextField storetext;
	@FXML
	private void goback() throws IOException
	{
//		ma.go_back_to_welcome();
		Stage stage=(Stage) Home.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void goback1() throws IOException
	{
//		ma.go_back_to_welcome();
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void gocreatestore() throws IOException
	{
		ma.show_create_store();
	}
	@FXML
	private void gocreatewarehouse() throws IOException
	{
		ma.show_create_warehouse();
	}
	@FXML
	private void goviewstore() throws IOException
	{
		String store=storetext.getText();
		Store s=Main.Su.ViewStore(store);
		ma.show_view_store();
	}
	
	@FXML
	private void goviewwarehouse() throws IOException
	{
		ma.show_view_warehouse();
	}
	@FXML
	private void gocreatawarehouseadmin() throws IOException
	{
		ma.create_warehouse_admin();
	}
	//@FXML
//	private void gocreatestoreadmin() throws IOException
//	{
//		
//	}
	
	@FXML
	private void gocreatenewstore_admin() throws IOException
	{
		ma.open_create_new_store_admin();
	}
	@FXML
	private void golink() throws IOException
	{
		ma.link_store_warehouse();
	}
}
