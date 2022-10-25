package Opgave_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

  
    @Override
    public void start(Stage stage) {
        stage.setTitle("Grader C/F");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfCelsius = new TextField();
    private final TextField txfFahrenheit = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblGrader = new Label("Grader C:");
        pane.add(lblGrader, 0, 0);
        Label lblFahrenheit = new Label("Grader F:");
        pane.add(lblFahrenheit, 0, 1);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfCelsius, 1, 0, 2, 1);
        pane.add(txfFahrenheit, 1, 1, 2, 2);
   

        // add a button to the pane (at col=1, row=1)
        Button btnCelsius = new Button("Celsius");
        pane.add(btnCelsius, 1, 3);
        GridPane.setMargin(btnCelsius, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnCelsius.setOnAction(event -> this.celsiusAction());

        // add a button to the pane (at col=2, row=1)
        Button btnFahrenheit = new Button("Fahrenheit");
        pane.add(btnFahrenheit, 2, 3);
        GridPane.setMargin(btnFahrenheit, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnFahrenheit.setOnAction(event -> this.fahrenheitAction());
    }

    // -------------------------------------------------------------------------

    private void celsiusAction() {
        double tal = Integer.parseInt(txfCelsius.getText());
        txfCelsius.setText(String.valueOf((tal-32)*5.0/9));
    }

    private void fahrenheitAction() {
        double tal = Integer.parseInt(txfFahrenheit.getText());
        txfFahrenheit.setText(String.valueOf((tal*9/5.0)+32));
    }
}
