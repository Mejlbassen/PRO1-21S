package Exercise_6;

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
    //Exercise 6
    private void drawShapes(GraphicsContext gc) {
        //Den lige streg
        gc.strokeLine(1, 100, 100, 100);

        //Arrowhead
        int x = 100;
        int y = 100;
        gc.strokeLine(x, y, x - 10, y + 5);
        gc.strokeLine(x, y, x - 10, y - 5);

        //For løkke der tegner 11 ens lodrette streger
//        int y1 = 95;
//        int y2 = 105;
//        for (int i = 1; i < 12; i++){
//        int x2 = 1 + i * 7;
//        gc.strokeLine(x2, y1, x2, y2);
//        }

        //For løkke der tegner 11 lodrette streger, hvor hver 5 streg har dobbelt længde
        int y1 = 95;
        int y2 = 105;
        for (int i = 0; i <= 10; i++) {
            int x2 = 1 + i * 7;
        if (i % 5 == 0){
            gc.strokeLine(x2, y1-5, x2, y2+5);}

        else{
            gc.strokeLine(x2, y1, x2, y2);
        }

        }

    }
}
