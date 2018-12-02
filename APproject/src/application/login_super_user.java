package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.UserData;
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
		boolean suc=false;
		for(int i=0;i<UserData.Superusers.size();i++)
		{
			if(UserData.Superusers.get(i).getid().equals(x) && UserData.Superusers.get(i).getpass().equals(y))
			{
				suc=true;
				Main.Su=UserData.Superusers.get(i);
				break;
			}
		}
		if(suc)

			ma.getlogin_tosuper();
			
		else
			System.out.println("ID and pass dont match");
		
		//CHECKS LOGIN
		
		
	}
	

}
