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
@FXML private javafx.scene.control.TextField cboxcat;
@FXML private javafx.scene.control.TextField catboxsub;
@FXML private javafx.scene.control.TextField subcatboxsub;
@FXML private javafx.scene.control.TextField catboxitem;
@FXML private javafx.scene.control.TextField subcatboxitem;
@FXML private javafx.scene.control.TextField itemcatboxitem;
@FXML private javafx.scene.control.TextField itemboxitem;


	

//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
//

	//To be changed
//	public void initialize() {
//		// TODO Auto-generated method stub
//		ArrayList<Category> cats=Main.W.getWare().Categories;
//		cats.sort(null);
//		
//		
//	}

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
		String cat=cboxcat.getText();
		if(Main.W.updateCat(cat,name))
		{
			ma.goeditingfrom_warehouse();
		}
		else
		{
			System.out.println("cat not found");
		}
	}
	

	@FXML 
	private void editsubcat() throws IOException
	{
		String name=tboxsub.getText();
		String cat=catboxsub.getText();
		String subcat=subcatboxsub.getText();
		
		if(Main.W.updateSubcat(cat, subcat, name))
			ma.goeditingfrom_warehouse();
		else
			System.out.println("subcat not found");
		
	}
	
	@FXML 
	private void edititem() throws IOException
	{
		String name=nameitem.getText();
		String cat=catboxitem.getText();
		String subcat=subcatboxitem.getText();
		String item=itemboxitem.getText();
		int cost=Integer.parseInt(costitem.getText());
		int quant=Integer.parseInt(quantitem.getText());
		if(Main.W.updateItem(cat, subcat, item, name, cost, quant))
			ma.goeditingfrom_warehouse();
		else
			System.out.println("item not found");
	}
	
	
	
	
	

}
