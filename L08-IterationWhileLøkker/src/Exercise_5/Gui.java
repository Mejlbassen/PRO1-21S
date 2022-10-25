package Exercise_5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------
		//Exercise 5
	private void drawShapes(GraphicsContext gc) {
		int y = 20;
		int i = 1;
		String str = "Datamatiker";						//Jeg kalder variablen str
		while(i <= str.length()){						//Når i er mindre eller lig med length på str = Datamatiker
			gc.fillText(str.substring(0, i), 20, y);	//Substring starter ved 0 og skriver indtil i. Y er linjeafstand
			y = y + 15;
			i++;
		}
	}

}
