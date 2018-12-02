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

	boolean ifcan_make_or_not=false;
	boolean ifcan_make_or_not2=false;
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) BACK.getScene().getWindow();
		stage.close();
	}
	//function for the first create. ie to create category
	@FXML
	private void create_cat() throws IOException
	{
		String s=category_Name.getText();
		ifcan_make_or_not=Main.S.addCat(s);
		if(ifcan_make_or_not==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems_store();
	}
	@FXML
	private void create_sub() throws IOException
	{
		String s=dropbox2.getText();
		String s2=Name_Sub_category.getText();
		ifcan_make_or_not=Main.S.addSubcat(s, s2);
		if(ifcan_make_or_not2==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems_store();
	}
	@FXML
	private void create_item() throws IOException
	{
		String s=dropbox3.getText();
		String s2=dropbox4.getText();
		String s3=Item_page_item.getText();
		float cost=Float.valueOf(Item_page_Cost.getText());
		int quantity=Integer.parseInt(Item_page_Quantity.getText());
		ifcan_make_or_not2=Main.S.addItem(s, s2, s3, cost, quantity );
		if(ifcan_make_or_not2==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems_store();
	}
	
	
	

}
