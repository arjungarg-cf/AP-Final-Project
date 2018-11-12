package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class after_store_is_created_controller {
	private Main ma;
	
	@FXML
	private void gocontinue() throws IOException
	{
		ma.continue_creating();
	}
	@FXML
	private void gobackhome() throws IOException
	{
		ma.go_back_to_welcome();
	}

}
