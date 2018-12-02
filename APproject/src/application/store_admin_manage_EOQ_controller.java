package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;
import data.EndUser;
import data.Item;
import data.EndUser;
public class store_admin_manage_EOQ_controller {
private Main ma;
@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.TextField TEXT1;
@FXML private javafx.scene.control.TextField TEXT2;
@FXML private javafx.scene.control.TextField TEXT3;
@FXML private javafx.scene.control.TextField dropbox1;
@FXML private javafx.scene.control.TextField CATEGORY;
@FXML private javafx.scene.control.TextField subCATEGORY;
@FXML private javafx.scene.control.TextField OUTPUT;

//@FXML
//	public void initialize() throws IOException
//	{
//		String store=Main.S.getStore().getname();
//		ArrayList<Item> it=EndUser.searchItem(store,String cat,String sub);
//	}
	@FXML
	private void goback() throws IOException
	{
	Stage stage=(Stage) Back.getScene().getWindow();
		stage.close();
	}
	@FXML
	private void EOQ() throws IOException
	{
		String items= dropbox1.getText();
		String cate= CATEGORY.getText();
		String subcate=subCATEGORY.getText();
		
		int d= Integer.parseInt(TEXT1.getText());
		//System.out.println(d);
		int h=Integer.parseInt(TEXT2.getText());
		int k=Integer.parseInt(TEXT3.getText());
		
		//System.out.println(d+h+k);
		float a= Main.S.manageEOQ(cate, subcate, items, d, h, k);
		//write a to the answer place
		System.out.println(a);
		OUTPUT.setText(Float.toString(a));
		
		
		
		
	}
	
	
	
	

}
