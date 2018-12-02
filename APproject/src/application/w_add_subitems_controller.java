package application;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;

public class w_add_subitems_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.TextField name_category;
@FXML private javafx.scene.control.TextField page2_cate;
@FXML private javafx.scene.control.TextField page2_subcate;
@FXML private javafx.scene.control.TextField page3_subcate;
@FXML private javafx.scene.control.TextField page3_category;
@FXML private javafx.scene.control.TextField page3_item;
@FXML private javafx.scene.control.TextField page3_cost;
@FXML private javafx.scene.control.TextField page3_quantity;
@FXML private javafx.scene.control.Button create1;
@FXML private javafx.scene.control.Button create2;
@FXML private javafx.scene.control.Button create3;





//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}

boolean ifcan_make_or_not=false;
boolean ifcan_make_or_not2=false;
//
	@FXML
	private void goback() throws IOException
	{
		Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
		
	}
	@FXML
	private void create_cat() throws IOException
	{
		String s=name_category.getText();
		ifcan_make_or_not=Main.W.addCat(s);
		if(ifcan_make_or_not==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems();
	}
	@FXML
	private void create_sub() throws IOException
	{
		String s=page2_cate.getText();
		String s2=page2_subcate.getText();
		ifcan_make_or_not=Main.W.addSubcat(s, s2);
		if(ifcan_make_or_not2==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems();
	}
	@FXML
	private void create_item() throws IOException
	{
		String s=page3_category.getText();
		String s2=page3_subcate.getText();
		String s3=page3_item.getText();
		float cost=Float.valueOf(page3_cost.getText());
		int quantity=Integer.parseInt(page3_quantity.getText());
		ifcan_make_or_not2=Main.S.addItem(s, s2, s3, cost, quantity );
		if(ifcan_make_or_not2==false)
			System.out.println("Cannot make");
		else
			ma.go_add_subitems_store();
	}
	
	

}
