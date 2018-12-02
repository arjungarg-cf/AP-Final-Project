package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.UserData;
public class login_warehosue_Admin {
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
	private void tryingtologin_warehouse() throws IOException
	{
		String x=TEXT1.getText();
		String y=TEXT2.getText();
		boolean suc=false;
		for(int i=0;i<UserData.Wareadmin.size();i++)
		{
			if(UserData.Wareadmin.get(i).getid().equals(x) && UserData.Wareadmin.get(i).getpass().equals(y))
			{
				suc=true;
				Main.W=UserData.Wareadmin.get(i);
				break;
			}
		}
		if(suc)
			ma.login_from_warehosue_Admin();
		else
			System.out.println("ID and pass dont match");
		
		
		
		
	}
	

}
