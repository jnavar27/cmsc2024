


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application 
{

	public static void main(String[] args) 
	{
		launch(args);   
	}
		   
	public void start(Stage stage) throws IOException 
	{
		FXMainPane root = new FXMainPane();
		
		Scene scene = new Scene(root, 400, 300);
		
		stage.setTitle("Hello World GUI");
		stage.setScene(scene);
		stage.show();

	}
}
