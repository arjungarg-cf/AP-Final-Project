package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class store_admin_add_items_controller {
private Main ma;
@FXML private javafx.scene.control.Button BACK;
@FXML private javafx.scene.control.TextField dropbox2;
@FXML private javafx.scene.control.TextField dropbox3;
@FXML private javafx.scene.control.TextField category_Name;
@FXML private javafx.scene.control.TextField Name_Sub_category;
@FXML private javafx.scene.control.TextField dropbox4;
@FXML private javafx.scene.control.TextField Item_page_item;
@FXML private javafx.scene.control.TextField Item_page_Cost;
@FXML private javafx.scene.control.TextField Item_page_Quantity;
@FXML private javafx.scene.control.Button CREATE;
@FXML private javafx.scene.control.Button CREATE2;
@FXML private javafx.scene.control.Button CREATE3;


//@FXML private javafx.scene.control.TextField dropbox3;

//@FXML private javafx.scene.control.TextField dropbox4;

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) BACK.getScene().getWindow();
		stage.close();
	}
	//function for the first create. ie to create category
	@FXML
	private void createpart() throws IOException
	{
		String s=category_Name.getText();
		boolean ifcan_make_or_not=Main.S.addCat(s);
		
	}
	

}
