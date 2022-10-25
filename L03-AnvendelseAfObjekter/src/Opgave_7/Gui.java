package Opgave_7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {
	
	@Override
	public void start(Stage stage) {
		Pane root = initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Shapes");
		stage.setScene(scene);
		stage.show();

	}

	private Pane initContent() {
		Pane pane = new Pane();
		pane.setPrefSize(400, 400);
		drawShapes(pane);
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(Pane pane) {
		Circle circle = new Circle(250, 70, 30); // Circle centrum 70,70 and
		// radius 30
		pane.getChildren().add(circle);
		circle.setFill(Color.YELLOW);
		circle.setStroke(Color.BLACK);

		Line line = new Line(40, 300, 400, 300); // Line from (70,70) to (100,70)
		pane.getChildren().add(line);

		// Rectangle from (x,y) width 75 and height 25
		Rectangle rektangel = new Rectangle(70, 180, 120, 120);
		pane.getChildren().add(rektangel);
		rektangel.setFill(Color.RED);

		// Polygon with 3 points (x,y)(x,y)(x,y) (bottom left)(bottom right)(top)
		Polygon polygon = new Polygon(50, 180, 210, 180, 130, 80);
		pane.getChildren().add(polygon);
		polygon.setFill(Color.GREEN);

		// Rectangle Black, like my soul
		Rectangle rektangel2 = new Rectangle(90, 200, 40, 40);
		pane.getChildren().add(rektangel2);
		rektangel2.setFill(Color.BLACK);

		// Rectangle table legs
		Rectangle rektangel3 = new Rectangle(295, 280, 30, 20);
		pane.getChildren().add(rektangel3);
		rektangel3.setFill(Color.TRANSPARENT);
		rektangel3.setStroke(Color.BLACK);

		// Rectangle Black, like my soul
		Rectangle rektangel4 = new Rectangle(275, 280, 30, 20);
		pane.getChildren().add(rektangel4);
		rektangel4.setFill(Color.TRANSPARENT);
		rektangel4.setStroke(Color.BLACK);

		// Ellipse tabletop
		Ellipse ellipse = new Ellipse(300, 270, 30, 15);
		pane.getChildren().add(ellipse);
		ellipse.setFill(Color.CORNFLOWERBLUE);
		ellipse.setStroke(Color.BLACK);
		ellipse.setStrokeWidth(5);
	}

}
