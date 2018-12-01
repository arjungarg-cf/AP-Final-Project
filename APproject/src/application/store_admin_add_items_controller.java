package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class store_admin_add_items_controller {
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
//		ma.gobackfrom_delete_store();
//	}
	@FXML
	private void delete_button_1() throws IOException
	{
		ma.go_add_subitems_store();
	}

}
