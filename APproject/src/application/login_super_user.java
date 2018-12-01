package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
public class login_super_user {
	private Main ma;
	@FXML private javafx.scene.control.Button Back;
	@FXML private javafx.scene.control.Button login;
	
	@FXML private javafx.scene.control.TextField TEXT1;
	@FXML private javafx.scene.control.TextField TEXT2;
	
	@FXML
	private void goback() throws IOException
	{
	Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	
	@FXML 
	private void tryingtologin() throws IOException
	{
		String x=TEXT1.getText();
		String y=TEXT2.getText();
		
		//CHECKS LOGIN
		
		ma.getlogin_tosuper();
		
		
	}
	

}
