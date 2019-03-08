package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
		Scene scene = new Scene (root);
		stage.setTitle("Smiley Faces nwn");
		stage.setScene(scene);
		stage.show();
		
	}
}
