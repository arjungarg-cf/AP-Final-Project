package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class s_view_warehouse_controller {

	private Main ma;
	
	@FXML private javafx.scene.control.Button Back;
	
	@FXML
	private void goback() throws IOException
	{
//		ma.go_back_to_welcome();
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	
}
