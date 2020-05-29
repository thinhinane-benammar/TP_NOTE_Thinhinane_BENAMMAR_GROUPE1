package application;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.scene.shape.RectangleBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

//import javafx.fxml.Initializable;
import application.Modele;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.canvas.GraphicsContext;

public class Controller implements Initializable{

	private EventHandler<ActionEvent> RectangleListener;
	private EventHandler<ActionEvent> SelectListener;
	private EventHandler<ActionEvent> LineListener;
	private EventHandler<ActionEvent> EllipseListener;
	private EventHandler<ActionEvent> buttonCloneListener;
	private EventHandler<ActionEvent> buttonDeleteListener;


	private Modele modele;

	@FXML 
	private Button Delete;

	@FXML 
	private Button Clone;

	@FXML
	private RadioButton Select;

	@FXML 
	private RadioButton Ellipse;

	@FXML 
	private RadioButton Rectangle;

	@FXML 
	private RadioButton Line;

	@FXML 
	private MenuButton Couleur;

	@FXML
	private Pane Canvas;

	//private Pane rectangle;

	@FXML 
	public void initialize1(URL location, ResourceBundle resources) {
		//this.modele = new Modele(this);

		//ici on permet d'avoir un seul RadioButton selectionne à la fois


		//peut se faire directement dans le sample.fxml
		//Couleur.getItems().addAll(new MenuItem("rouge"),new MenuItem("vert"),new MenuItem("bleu"),new MenuItem("jaune"));
		/*
		RectangleListener = new EventHandler<ActionEvent>()
				{
			@Override
			public void handle(ActionEvent event)
			{	

			}
				};
		}

	buttonResetListener = new EventHandler<ActionEvent>()
    {
        @Override
		public void handle(ActionEvent event) 
		{

		}*/



		final Rectangle rect;
		final Circle cercle;
		final Line ligne;
		final ToggleGroup group = new ToggleGroup();
		Select.setToggleGroup(group);
		Ellipse.setToggleGroup(group);
		Line.setToggleGroup(group);
		Rectangle.setToggleGroup(group);


		Ellipse.setOnAction(event -> Canvas.getChildren().add(new Circle(10,10,10)));
		Rectangle.setOnAction(event-> Canvas.getChildren().add(new Rectangle (90,90)));
		Line.setOnAction(event-> Canvas.getChildren().add(new Line(10,10,20,20)));
		Clone.setOnAction(event -> Canvas.getChildren().addAll((new Circle(10,10,10)),(new Line(10,10,20,20)),(new Rectangle(90,90))));	
	}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub

		}
}
		/*private void line(GraphicsContext gc) {
		gc.beginPath();
		gc.moveTo(100, 100);
		gc.lineTo(150.5, 30.5);
        gc.lineTo(150.5, 150.5);
        gc.lineTo(30.5, 30.5);
        gc.stroke();
	}


		//Clone.setOnAction(event -> Canvas.getChildren().add()...

		if (Select.isSelected()) { //efface tout si on appuie sur select et delete
			DeleteAll.setOnAction(event -> Canvas.getChildren().clear());   //supprime tous les elements du canvas...
		}


	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
public void CouleurModif() {
		String nouvelleCouleur = String.format("%02x%02x%02x", null);
		modifierCouleur(nouvelleCouleur);
		Couleur.setStyle("-fx-backround-color:#"+nouvelleCouleur+";");

	}

	private void modifierCouleur(String nouvelleCouleur) {
		// TODO Auto-generated method stub
		Couleur.setText(""+nouvelleCouleur);

	}


}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}*/