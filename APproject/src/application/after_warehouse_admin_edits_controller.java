package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class after_warehouse_admin_edits_controller {
	private Main ma;
	@FXML
	private void gocontinueadding() throws IOException
	{
		ma.go_continueedits();
	}

	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}
	

}
