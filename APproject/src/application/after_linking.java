package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class after_linking {
private Main ma;
	
	@FXML
	private void gocontinue() throws IOException
	{
		ma.continue_linking();
	}
	@FXML
	private void gobackhome() throws IOException
	{
		ma.go_back_to_welcome();
	}

}
