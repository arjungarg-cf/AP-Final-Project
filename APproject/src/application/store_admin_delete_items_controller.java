package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class store_admin_delete_items_controller {
private Main ma;
	

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//
//	@FXML
//	private void goback() throws IOException
//	{
//		ma.gobackfrom_delete_store_admin();
//	}
	@FXML
	private void delete_button() throws IOException
	{
		ma.go_delete_button_store();
	}

}
