package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class store_admin_updates_items_controller
{
private Main ma;
@FXML private javafx.scene.control.Button Back;

@FXML private javafx.scene.control.TextField Name_category;
@FXML private javafx.scene.control.TextField name_subcategory;
@FXML private javafx.scene.control.TextField item_new_cost;
@FXML private javafx.scene.control.TextField Item_new_name;

	

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
	private void continueedits() throws IOException
	{
		ma.goeditingfrom_store();
	}
	
	

}
