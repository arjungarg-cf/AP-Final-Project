package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
public class login_store_admin_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button BACK;
	@FXML private javafx.scene.control.Button LOGIN;
	
	@FXML private javafx.scene.control.TextField TEXT1;
	@FXML private javafx.scene.control.TextField TEXT2;
	
	@FXML
	private void goback() throws IOException
	{
	Stage stage=(Stage) BACK.getScene().getWindow();
		stage.close();
	}
	
	@FXML 
	private void tryingtologin() throws IOException
	{
		String x=TEXT1.getText();
		String y=TEXT2.getText();
		
		
		ma.login_from_store_admin();
		
		
	}
	

}
