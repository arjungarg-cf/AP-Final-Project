package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import application.Main;


public class w_manage_EOQ_controller {
private Main ma;

@FXML private javafx.scene.control.Button Back;
@FXML private javafx.scene.control.TextField text1;
@FXML private javafx.scene.control.TextField text2;
@FXML private javafx.scene.control.TextField text3;
@FXML private javafx.scene.control.TextField items;
@FXML private javafx.scene.control.TextField CATEGORY;
@FXML private javafx.scene.control.TextField subCATEGORY;
@FXML private javafx.scene.control.TextField OUTPUT;
	

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
	private void lastbutton() throws IOException
	{
		String item= items.getText();
		String cate= CATEGORY.getText();
		String subcate=subCATEGORY.getText();
		
		int d= Integer.parseInt(text1.getText());
		//System.out.println(d);
		int h=Integer.parseInt(text2.getText());
		int k=Integer.parseInt(text3.getText());
		
		//System.out.println(d+h+k);
		float a= Main.S.manageEOQ(cate, subcate, item, d, h, k);
		//write a to the answer place
		System.out.println(a);
		OUTPUT.setText(Float.toString(a));
		//ma.continuelastbutton();
	}
	

}
