package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.Category;
public class w_delete_subitems_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.Button delcat;
@FXML private javafx.scene.control.Button delsubcat;
@FXML private javafx.scene.control.Button delitem;
@FXML private javafx.scene.control.TextField cboxcat;
@FXML private javafx.scene.control.TextField cboxsubcat;
@FXML private javafx.scene.control.TextField subboxsubcat;
@FXML private javafx.scene.control.TextField cboxitem;
@FXML private javafx.scene.control.TextField subboxitem;
@FXML private javafx.scene.control.TextField itemboxitem;
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
//	@FXML
//	private void delete_button() throws IOException
//	{
//		ma.go_delete_button();
//	}
	@FXML
	private void delcat()throws IOException
	{
		String cat=cboxcat.getText();
		if(Main.W.deleteCategory(cat))
		{
			ma.go_delete_button();
		}
		else {
			System.out.println("Cat not found");
		}
			
	}
	@FXML
	private void delsubcat() throws IOException
	{
		String cat=cboxsubcat.getText();
		String subcat=subboxsubcat.getText();
		if(Main.W.deleteSubCategory(cat, subcat))
		{
			ma.go_delete_button();
		}
		else {
			System.out.println("Subcat not found");
		}
	}
	
	@FXML
	private void delitem() throws IOException
	{
		String cat=cboxitem.getText();
		String subcat=subboxitem.getText();
		String item=itemboxitem.getText();
		if(Main.W.deleteItem(cat, subcat, item))
				{
			ma.go_delete_button();
				}
		else {
			System.out.println("Item not found");
		}
	}

}
