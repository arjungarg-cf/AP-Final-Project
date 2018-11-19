package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class store_admin_updates_items_controller
{
private Main ma;
	

	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}

	@FXML
	private void goback() throws IOException
	{
		ma.gobackfrom_store_admin_updateitems();
	}
	@FXML
	private void continueedits() throws IOException
	{
		ma.goeditingfrom_store();
	}
	
	

}
