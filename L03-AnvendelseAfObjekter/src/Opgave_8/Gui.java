package Opgave_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
		// Linje på jorden
		Line line = new Line(10, 500, 400, 500);
		pane.getChildren().add(line);

		// Gavl bund firkant
		Rectangle gavlBund = new Rectangle(30, 380, 160, 120);
		pane.getChildren().add(gavlBund);
		gavlBund.setFill(Color.DARKBLUE);

		// Gavl top trekant
		Polygon gavlTop = new Polygon(30, 380, 190, 380, 110, 320);
		pane.getChildren().add(gavlTop);
		gavlTop.setFill(Color.DARKSLATEGRAY);

		// Facade bund trekant
		Polygon facadeBund = new Polygon(190, 380, 190, 500, 400, 330);
		pane.getChildren().add(facadeBund);
		facadeBund.setFill(Color.BLUE);

		// Facade top trekant
		Polygon facadeTop = new Polygon(190, 380, 400, 330, 400, 230);
		pane.getChildren().add(facadeTop);
		facadeTop.setFill(Color.BLUE);

		// Tag solside bund trekant
		Polygon tagBund = new Polygon(190, 380, 330, 190, 400, 230);
		pane.getChildren().add(tagBund);
		tagBund.setFill(Color.RED);

		// Tag solside top trekant
		Polygon tagTop = new Polygon(190, 380, 330, 190, 110, 320);
		pane.getChildren().add(tagTop);
		tagTop.setFill(Color.RED);

		// Tag skyggeside trekant
		Polygon tagTopSkygge = new Polygon(250, 200, 330, 190, 30, 380);
		pane.getChildren().add(tagTopSkygge);
		tagTopSkygge.setFill(Color.DARKRED);

		// Vindue bund firkant
		Rectangle vindueBund = new Rectangle(60, 400, 100, 50);
		pane.getChildren().add(vindueBund);
		vindueBund.setFill(Color.NAVAJOWHITE);
		vindueBund.setStroke(Color.BLACK);

		// Vindue top cirkel
		Circle vindueTop = new Circle(110, 355, 12);
		pane.getChildren().add(vindueTop);
		vindueTop.setFill(Color.NAVAJOWHITE);
		vindueTop.setStroke(Color.BLACK);

		// Sol
		Circle sol = new Circle(600, 100, 30);
		pane.getChildren().add(sol);
		sol.setFill(Color.YELLOW);
		sol.setStroke(Color.ORANGE);
	}

}
