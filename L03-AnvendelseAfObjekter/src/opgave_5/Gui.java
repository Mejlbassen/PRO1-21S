package opgave_5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle circle = new Circle(150, 150, 100);
        pane.getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(10);

        Circle circle2 = new Circle(350, 150, 100);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(10);

        Circle circle3 = new Circle(550, 150, 100);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.RED);
        circle3.setStrokeWidth(10);

        Circle circle4 = new Circle(250, 250, 100);
        pane.getChildren().add(circle4);
        circle4.setFill(Color.TRANSPARENT);
        circle4.setStroke(Color.YELLOW);
        circle4.setStrokeWidth(10);

        Circle circle5 = new Circle(450, 250, 100);
        pane.getChildren().add(circle5);
        circle5.setFill(Color.TRANSPARENT);
        circle5.setStroke(Color.GREEN);
        circle5.setStrokeWidth(10);
    }
}
