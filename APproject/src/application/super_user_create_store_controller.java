package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;


public class super_user_create_store_controller {
	private Main ma;
	@FXML
	private void gobacktoprev() throws IOException
	{
		ma.back_of_s_create_store();
	}
	@FXML
	private void gohome() throws IOException
	{
		ma.go_back_to_welcome();
	}
	@FXML
	private void create() throws IOException
	{
		ma.after_created();
	}
}
