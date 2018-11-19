package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class after_store_admin_updates_controller {
	private Main ma;
	@FXML
	private void gocontinueadding() throws IOException
	{
		ma.go_store_edits();
	}

	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}
	

}
