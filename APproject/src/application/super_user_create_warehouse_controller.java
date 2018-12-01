package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class super_user_create_warehouse_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button Back;
	@FXML
	private void gobacktoprev() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
	@FXML
	private void create() throws IOException
	{
		ma.after_warehouse_created();
	}

}
