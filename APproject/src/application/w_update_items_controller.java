package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class w_update_items_controller {
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
	private void continueedits() throws IOException
	{
		ma.goeditingfrom_warehouse();
	}
	
	

}
