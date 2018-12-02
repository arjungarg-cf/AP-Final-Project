package application;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

import application.Main;
public class end_user_actual_entry_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button Back;
	@FXML
	private void goback() throws IOException
	{
//		ma.go_back_to_welcome();
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	//this is the availability finction
	@FXML
	private void go_search_from_end_user() throws IOException
	{
		ma.go_searching_from_end();
	}
	
	@FXML
	private void gobrowse() throws IOException
	{
		ma.load_browse1();
	}
	
}



