package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class w_add_subitems_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
		
	}
	@FXML
	private void delete_button_1() throws IOException
	{
		ma.go_add_subitems();
	}

}
