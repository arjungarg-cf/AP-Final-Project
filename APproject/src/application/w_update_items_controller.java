package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class w_update_items_controller {
private Main ma;
	

	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}

	@FXML
	private void goback() throws IOException
	{
		ma.gobackfrom_w_updateitems();
	}
	
	

}
