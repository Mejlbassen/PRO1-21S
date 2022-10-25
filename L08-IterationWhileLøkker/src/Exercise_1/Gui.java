package Exercise_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application
{
    
    @Override
    public void start(Stage stage)
    {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent()
    {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc)
    {
        // draw an arrowhead at (x,y)
        int x = 100;
        int y = 75;
        int z1 = y - 4;
        int z2 = y + 4;
        int x1 = x + 20;
        gc.strokeLine(x, y, x1, z1);
        gc.strokeLine(x, y, x1, z2);

        // draw an arrowhead at (x,y)
        x = 100;
        y = 125;
        gc.strokeLine(x, y, x + 20, y - 4);
        gc.strokeLine(x, y, x + 20, y + 4);

        // draw an arrowhead at (x,y)
        x = 20;
        y = 50;
        gc.strokeLine(x, y, x + 20, y - 4);
        gc.strokeLine(x, y, x + 20, y + 4);
    }

}
