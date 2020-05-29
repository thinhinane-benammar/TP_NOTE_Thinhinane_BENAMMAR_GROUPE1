package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	final Pane rectangle = new Pane();
	//private static final 
	@Override
		public void start(Stage primaryStage) throws Exception{
	        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	        primaryStage.setTitle("Graphic Editor");
	        primaryStage.setScene(new Scene(root, 800, 500));
	        primaryStage.show();
	    }
	
	
	public static void main(String[] args) {
		launch(args);
	}
}