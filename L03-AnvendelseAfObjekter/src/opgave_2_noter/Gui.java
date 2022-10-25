package opgave_2_noter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
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

    int moveShape = 100;
Color farveGul = Color.YELLOW;

    private void drawShapes(Pane pane) {
        Circle circle = new Circle(70+moveShape, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(farveGul);
        circle.setStroke(Color.DARKMAGENTA);

        Line line = new Line(200+moveShape, 200, 250, 250);
        pane.getChildren().add(line);
        line.setStroke(farveGul);

        Rectangle rectangle = new Rectangle(150+moveShape, 150, 40, 40);
        pane.getChildren().add(rectangle);
        rectangle.setFill(farveGul);
        rectangle.setStroke(Color.BLUEVIOLET);
    }
}
