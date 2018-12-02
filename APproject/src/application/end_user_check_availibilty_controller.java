package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class end_user_check_availibilty_controller {
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
	private void go_search() throws IOException
	{
		ma.gosearch_from_item();
	}

}
