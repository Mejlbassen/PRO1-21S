package Exercise_3;

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

	private void drawShapes(GraphicsContext gc) {
//		int x1 = 100; // start point: (x1,y1)
//		int y1 = 200;
//		int y2 = 10;
//		gc.strokeLine(x1, y1, 20, y2);
//		gc.strokeLine(x1, y1, 60, y2);
//		gc.strokeLine(x1, y1, 100, y2);
//		gc.strokeLine(x1, y1, 140, y2);
//		gc.strokeLine(x1, y1, 180, y2);

//        int x1 = 10; // start point: (x1,y1)
//      int y1 = 10;
//    int y2 = 100;// end point: (x1,y2)
//  while (x1 <= 180) {
//    gc.strokeLine(x1, y1,x1, y2);
//  x1 = x1 + 40;

//		int x1 = 10; // start point: (x1,y1)
//		int x2 = 100;
//		int y1 = 10;// end point: (x1,y2)
//			gc.strokeLine(x1, y1,x2, y1);
//			y1 = y1 + 40;
//	}
		//Exercise 3
        int x1 = 80; // start point: (x1,y1)
		int x2 = 100;
		int y1 = 100;
		while (x2 <= 180) {
			gc.strokeLine(x1, y1, x2, y1);
			x1 = x1 - 20;
			x2 = x2 + 20;
			y1 = y1 + 20;
		}
	}
}
