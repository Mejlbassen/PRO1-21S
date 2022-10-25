package Exercise_4;

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
		//Exercise 4.1
	private void drawShapes(GraphicsContext gc) {
//		int x = 100;
//		int y = 100;
//		int w = 20;
//		int h = 20;
//		while (w <= 100){
//			gc.strokeOval(x, y, w, h);
//			w = w + 20;
//			h = h + 20;
//			x = x - 10;
//			y = y - 10;

		//Exercise 4.2
//		int x = 20;
//		int y = 100;
//		int w = 20;
//		while (w <= 100){
//			gc.strokeOval(x, y, w, w);
//			w = w + 10;
//			y = y - 5;
//		}

		//Exercise 4.3
		int x = 10;
		int y = 40;
		int	w = 180;
		int	h = 100;
		while (x <= 80){
			gc.strokeOval(x, y, w, h);
			w = w - 20;
			x = x + 10;
		}
	}
}
