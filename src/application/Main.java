package application;
	
import java.awt.Color;
import java.security.acl.Group;

import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;

public class Main extends Application {
	
	final Pane rectangle = new Pane();
	

	//private static final 
	@Override
		public void start(Stage primaryStage) throws Exception{
	        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	        primaryStage.setTitle("Graphique Editor");
	        primaryStage.setScene(new Scene(root, 800, 500));
	        primaryStage.show();
	        
	        
	    
	        
	    }
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
