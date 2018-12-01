package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

//end user entry controller
public class end_user_base_controller {
	private Main ma;
	
	@FXML private javafx.scene.control.Button Back;
	
	
	@FXML
	private void goback() throws IOException
	{
//		ma.go_back_to_welcome();
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void gosearch() throws IOException
	{
		ma.go_search_store_end_user();
	}
	
}
