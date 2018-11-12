package application;

import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class super_user_controller {
	private Main ma;
	@FXML
	private void goback() throws IOException
	{
		ma.go_back_to_welcome();
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
	private void golink() throws IOException
	{
		ma.link_store_warehouse();
	}
}
