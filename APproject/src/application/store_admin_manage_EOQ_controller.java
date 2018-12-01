package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class store_admin_manage_EOQ_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.TextField TEXT1;
@FXML private javafx.scene.control.TextField TEXT2;
@FXML private javafx.scene.control.TextField TEXT3;
@FXML private javafx.scene.control.ChoiceBox<String> dropbox1;
	
@FXML
	void initialize() throws IOException
	{
	
	}
	@FXML
	private void goback() throws IOException
	{
	Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void EOQ() throws IOException
	{
		String items= dropbox1.getValue();
		int d= Integer.parseInt(TEXT1.getText());
		//System.out.println(d);
		int h=Integer.parseInt(TEXT2.getText());
		int k=Integer.parseInt(TEXT3.getText());
		
		//System.out.println(d+h+k);
		float a= manageEOQ(cat, subcat, item, d, h, k);
		//write a to the answer place
		
		
		
	}
	
	
	
	

}
