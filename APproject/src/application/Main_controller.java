package application;

import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;
public class Main_controller {
	
	private Main ma;
	
	@FXML
	private void gosuper() throws IOException
	{
		ma.showsuperfromwelcome();
	}
	@FXML
	private void gostore() throws IOException
	{
		ma.show_store_admin_from_welcome();
	}
	@FXML
	private void gowarehouse() throws IOException
	{
		ma.show_warehouse_admin_from_welcome();
	}
	@FXML
	private void goenduser() throws IOException
	{
		ma.show_end_user_from_welcome();
	}


}
