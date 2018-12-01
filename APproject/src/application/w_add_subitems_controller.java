package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class w_add_subitems_controller {
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
//		ma.gobackfrom_delete();
//	}
	@FXML
	private void delete_button_1() throws IOException
	{
		ma.go_add_subitems();
	}

}
