package opgave_2;

import javafx.application.Application;
import javafx.css.Size;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        Rectangle rectangle = new Rectangle(20, 20, 550, 300);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.BLUE);

        Text text = new Text(100, 200, "Magnus");
        pane.getChildren().add(text);
        text.setFill(Color.RED);
        text.setFont(new Font(100));
    }
}
