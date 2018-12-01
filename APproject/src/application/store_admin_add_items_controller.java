package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class store_admin_add_items_controller {
private Main ma;
@FXML private javafx.scene.control.ChoiceBox Back;
@FXML private javafx.scene.control.ChoiceBox dropbox2;
@FXML private javafx.scene.control.ChoiceBox dropbox3;
@FXML private javafx.scene.control.TextField category_Name;
@FXML private javafx.scene.control.TextField Name_Sub_category;
@FXML private javafx.scene.control.ChoiceBox dropbox4;
@FXML private javafx.scene.control.TextField Item_page_item;
@FXML private javafx.scene.control.TextField Item_page_Cost;
@FXML private javafx.scene.control.TextField Item_page_Cost

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void delete_button_1() throws IOException
	{
		ma.go_add_subitems_store();
	}

}
