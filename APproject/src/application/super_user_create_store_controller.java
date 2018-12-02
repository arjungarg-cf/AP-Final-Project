package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class super_user_create_store_controller {
	private Main ma;
	@FXML private javafx.scene.control.Button Back;
	@FXML private javafx.scene.control.TextField name;
	@FXML private javafx.scene.control.TextField id;
	@FXML private javafx.scene.control.TextField warehouse;
	@FXML private javafx.scene.control.TextField admin;
	@FXML private javafx.scene.control.TextField maxitems;
	
	
	@FXML
	private void gobacktoprev() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	//@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
	@FXML
	private void create() throws IOException
	{
		
		String n=name.getText();
		String i=id.getText();
		String ware=warehouse.getText();
		String admins=admin.getText();
		int max=Integer.parseInt(maxitems.getText());
		if(Main.Su.CreateStore(admins, i, ware, n, max))
			ma.after_created();
		else
			System.out.println("Not created");
	}
}
