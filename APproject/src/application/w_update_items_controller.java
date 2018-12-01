package application;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import application.Main;
import data.Category;


public class w_update_items_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.Button editcat;
@FXML private javafx.scene.control.Button editsubcat;
@FXML private javafx.scene.control.Button edititem;
@FXML private javafx.scene.control.TextField tboxcat;
@FXML private javafx.scene.control.TextField tboxsub;
@FXML private javafx.scene.control.TextField  nameitem;
@FXML private javafx.scene.control.TextField costitem;
@FXML private javafx.scene.control.TextField quantitem;
@FXML private javafx.scene.control.ChoiceBox<String> cboxcat;
@FXML private javafx.scene.control.ChoiceBox<String> catboxsub;
@FXML private javafx.scene.control.ChoiceBox<String> subcatboxsub;
@FXML private javafx.scene.control.ChoiceBox<String> catboxitem;
@FXML private javafx.scene.control.ChoiceBox<String> subcatboxitem;
@FXML private javafx.scene.control.ChoiceBox<String> itemcatboxitem;
@FXML private javafx.scene.control.ChoiceBox<String> itemboxitem;


	

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//

	public void initialize() {
		// TODO Auto-generated method stub
		ArrayList<Category> cats=Main.W.getWare().Categories;
		
	}

	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void continueedits() throws IOException
	{
		ma.goeditingfrom_warehouse();
	}
	
	@FXML 
	private void editcat() throws IOException
	{
		String name=tboxcat.getText();
		String cat=cboxcat.getValue();
		Main.W.updateCat(cat,name);
	}
	

	@FXML 
	private void editsubcat() throws IOException
	{
		String name=tboxsub.getText();
		String cat=catboxsub.getValue();
		String subcat=subcatboxsub.getValue();
		Main.W.updateSubcat(cat, subcat, name);
	}
	
	@FXML 
	private void edititem() throws IOException
	{
		String name=nameitem.getText();
		String cat=catboxitem.getValue();
		String subcat=subcatboxitem.getValue();
		String item=itemboxitem.getValue();
		int cost=Integer.parseInt(costitem.getText());
		int quant=Integer.parseInt(quantitem.getText());
		Main.W.updateItem(cat, subcat, item, name, cost, quant);
	}
	
	
	
	
	

}
