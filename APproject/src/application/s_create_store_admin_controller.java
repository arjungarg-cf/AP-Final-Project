package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class s_create_store_admin_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button Back;
	@FXML private javafx.scene.control.TextField id;
	@FXML private javafx.scene.control.TextField pass;
	
	@FXML
	private void gocreate() throws IOException
	{
		String i=id.getText();
		String p=pass.getText();
		if(Main.Su.CreateStoreAdmin(i, p))
		ma.create_store_admin_after();
		else
			System.out.println("ID exists");
	}
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}

}
