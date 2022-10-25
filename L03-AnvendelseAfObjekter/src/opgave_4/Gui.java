package opgave_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        Circle circle = new Circle(400, 400, 300);
        pane.getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(35);

        Circle circle2 = new Circle(400, 400, 200);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(35);

        Circle circle3 = new Circle(400, 400, 100);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.BLACK);


    }
}
