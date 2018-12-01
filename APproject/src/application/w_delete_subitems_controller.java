package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class w_delete_subitems_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.Button delcat;
@FXML private javafx.scene.control.Button delsubcat;
@FXML private javafx.scene.control.Button delitem;

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
	private void delete_button() throws IOException
	{
		ma.go_delete_button();
	}

}
