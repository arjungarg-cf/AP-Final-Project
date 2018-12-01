package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class super_link_store_to_warehouse_controller {
	
	//@FXML private javafx.scene.control.Button Home;
	@FXML private javafx.scene.control.Button Back;
	//@FXML private javafx.scene.control.Button Logout;

	private Main ma;
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void linkit() throws IOException
	{
		ma.linking();
	}
//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
}
