package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.UserData;
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
		boolean suc=false;
		for(int i=0;i<UserData.Storeadmin.size();i++)
		{
			if(UserData.Storeadmin.get(i).getloginid().equals(x) && UserData.Storeadmin.get(i).getpass().equals(y))
			{
				suc=true;
				Main.S=UserData.Storeadmin.get(i);
				break;
			}
		}
		if(suc)
			ma.login_from_store_admin();
		else
			System.out.println("ID and pass dont match");
		
	}
	

}
