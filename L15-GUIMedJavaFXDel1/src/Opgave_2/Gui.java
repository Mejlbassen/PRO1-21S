package Opgave_2;

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
        stage.setTitle("Byt inhold");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFirst = new TextField();
    private final TextField txfLast = new TextField();

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

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfFirst, 1, 0, 2, 1);
        pane.add(txfLast, 1, 2, 2, 3);
   

        // add a button to the pane (at col=1, row=1)
        Button btnUpperCase = new Button("Swap");
        pane.add(btnUpperCase, 1, 6);
        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnUpperCase.setOnAction(event -> this.upperCaseAction());

    }

    // -------------------------------------------------------------------------

    private void upperCaseAction() {
        String nameFirst = txfFirst.getText().trim();
        String nameLast = txfLast.getText().trim();
        txfFirst.setText(nameLast);
        txfLast.setText(nameFirst);

    }

}
