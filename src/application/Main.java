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
	//        primaryStage.show();
	        
	        
	        
	        Circle cercle = new Circle();
	        cercle.setCenterX(300);//réglage de la position, de la taille et de la couleur du cercle
	        cercle.setCenterY(200);
	        cercle.setRadius(100);
	       // cercle.setFill(Color.YELLOW);
	        //cercle.setStroke(Color.ORANGE);//réglage de la couleur de la bordure et de son épaisseur
	        cercle.setStrokeWidth(5);
	        
	        root.getChildrenUnmodifiable().add(cercle);//on ajoute le cercle au groupe root
	        primaryStage.show();
	        
	    }
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
