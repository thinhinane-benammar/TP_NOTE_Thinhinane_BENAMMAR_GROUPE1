package application;

import javafx.scene.Cursor;
import javafx.scene.Node;

import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import java.net.URL;
import java.util.ResourceBundle;


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


	@FXML
	private Button Delete;


	@Override
	public void initialize(URL location, ResourceBundle resources) {

		final ToggleGroup group = new ToggleGroup();
		Select.setToggleGroup(group);
		Ellipse.setToggleGroup(group);
		Line.setToggleGroup(group);
		Rectangle.setToggleGroup(group);


		MenuItem m1 = new MenuItem("violet");
		MenuItem m2 = new MenuItem("jaune");
		MenuItem m3 = new MenuItem("bleu");
		MenuItem m4 = new MenuItem("vert");
		Couleur.getItems().add(m1);
		Couleur.getItems().add(m2);
		Couleur.getItems().add(m3);
		Couleur.getItems().add(m4);

		final String color;
		Label colo = new Label("def");

		m1.setOnAction((e) -> {

			if (Select.isSelected()) {
				Canvas.setStyle("-fx-background-color: #ff00ff");
			}
			else 
			{System.out.println(false);}
		});
		m2.setOnAction((e) -> {
			if (Select.isSelected()) {
				Canvas.setStyle("-fx-background-color: #ffff00");
			}
			else 
			{System.out.println(false);}
		});

		m3.setOnAction((e) -> {
			if (Select.isSelected()) {
				Canvas.setStyle("-fx-background-color: #0000ff");
			}
			else 
			{System.out.println(false);}
		});
		m4.setOnAction((e) -> {
			if (Select.isSelected()) {
				Canvas.setStyle("-fx-background-color: #00ff00");
			}
			else 
			{System.out.println(false);}
		});



		double xLoc;
		double yLoc;

		Ellipse.setOnAction(event -> Canvas.getChildren().add(createCircle(10,10,30, Color.WHITE)));
		Rectangle.setOnAction(event-> Canvas.getChildren().add(createRectangle(200,200,Color.WHITE)));
		Line.setOnAction(event-> Canvas.getChildren().add(createLine(10,10,30,50,Color.WHITE)));


		Delete.setOnAction(event -> Canvas.getChildren().clear());  		 

	}

	//permet de bouger les figures dans tous le canvas
	double orgSceneX, orgSceneY;

	public Circle createCircle(double i, double j, double r, Color color) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(i, j, r, color);

		circle.setCursor(Cursor.HAND);


		circle.setOnMousePressed((t) -> {

			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();

			Circle c = (Circle) (t.getSource());
			c.toFront();


			c.setStroke(Color.RED);
		});

		circle.setOnMouseDragged((t) -> {
			double offsetX = t.getSceneX() - orgSceneX;
			double offsetY = t.getSceneY() - orgSceneY;

			Circle c = (Circle) (t.getSource());

			c.setCenterX(c.getCenterX() + offsetX);
			c.setCenterY(c.getCenterY() + offsetY);


			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();
		});

		//decolore le tour lorsque la souris est lachee
		circle.setOnMouseReleased((t) -> {
			Circle c = (Circle) (t.getSource());
			c.setStroke(null);
		});


		circle.getId();
		return circle;
	}

	private Rectangle createRectangle(double i, double j, Color color) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(i, j, color);

		rectangle.setCursor(Cursor.HAND);

		rectangle.setOnMousePressed((t) -> {
			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();

			Rectangle R = (Rectangle) (t.getSource());
			R.toFront();
			R.setStroke(Color.RED);
		});
		rectangle.setOnMouseDragged((t) -> {
			double offsetX = t.getSceneX() - orgSceneX;
			double offsetY = t.getSceneY() - orgSceneY;

			Rectangle R = (Rectangle) (t.getSource());

			R.setX(R.getX() + offsetX);
			R.setY(R.getY() + offsetY);

			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();
		});
		rectangle.setOnMouseReleased((t) -> {
			Rectangle R = (Rectangle) (t.getSource());
			R.setStroke(null);
		});


		return rectangle;
	}

	private Line createLine(double i, double j, double x, double y, Color color) {
		// TODO Auto-generated method stub
		Line line = new Line(i, j, x, y);

		line.setCursor(Cursor.HAND);

		line.setOnMousePressed((t) -> {


			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();

			Line l = (Line) (t.getSource());
			l.toFront();
			l.setStroke(Color.RED);
		});
		line.setOnMouseDragged((t) -> {
			double offsetX = t.getSceneX() - orgSceneX;
			double offsetY = t.getSceneY() - orgSceneY;

			Line l = (Line) (t.getSource());

			l.setEndX(l.getEndX() + offsetX);
			l.setEndY(l.getEndY() + offsetY);

			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();
		});

		return line;
	}



}