package application;
import java.io.IOException;
import javafx.fxml.FXML;
import application.Main;

public class store_admin_base_controller
{

private Main ma;
	
	@FXML
	private void goupdateitems() throws IOException
	{
		ma.s_updateitems();
	}
	@FXML
	private void manageEOQ() throws IOException
	{
		ma.s_manageEOQ();
	}
//	@FXML
//	private void gohome() throws IOException
//	{
//		ma.go_back_to_welcome();
//	}
	@FXML
	private void deletesubitems() throws IOException
	{
		ma.s_delete_subitems();
	}
	@FXML
	private void adddd() throws IOException
	{
		ma.s_additems();
	}
//	@FXML
//	private void goback() throws IOException
//	{
//		ma.gobackfromstoreadminbase();
//	}
	
	
	
}
