package application;

import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class create_warehouse_admin_controller {
	private Main ma;
	
	@FXML
	private void gocreate() throws IOException
	{
		ma.create_warehouse_admin_after();
	}
	@FXML
	private void goback() throws IOException
	{
		ma.gobackfromhere();
	}
	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}

}
