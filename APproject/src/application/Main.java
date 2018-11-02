package application;
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException{
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("Superstore");
		showMainView();
		showsuperfromwelcome();
	}
	
	private void showMainView() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("Welcome_page.fxml"));
		mainLayout = loader.load();
		Scene scene=new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showsuperfromwelcome() throws IOException
	{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("super_user_base.fxml"));
		BorderPane super1 = loader.load();
		mainLayout.setCenter(super1);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
