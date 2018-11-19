package application;

import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class store_admin_manage_EOQ_controller {
private Main ma;
	

	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}

	@FXML
	private void goback() throws IOException
	{
		ma.gobackfrom_store_manager();
	}
	
	

}
