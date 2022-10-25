package Opgave_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

  
    @Override
    public void start(Stage stage) {
        stage.setTitle("Kombiner navne");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFirstName = new TextField();
    private final TextField txfLastName = new TextField();
    private final TextField txfFullName = new TextField();

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
        Label lblName = new Label("First Name:");
        pane.add(lblName, 0, 2);
        Label lblLastName = new Label("Last Name:");
        pane.add(lblLastName, 3, 2);
        Label lblFullName = new Label("Full Name:");
        pane.add(lblFullName, 0, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfFirstName, 1, 2, 2, 1);
        pane.add(txfLastName, 4, 2, 5, 1);
        pane.add(txfFullName, 1, 0, 2, 2);
   

        // add a button to the pane (at col=1, row=1)
        Button btnUpperCase = new Button("Split");
        pane.add(btnUpperCase, 1, 3);
        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnUpperCase.setOnAction(event -> this.upperCaseAction());

    }

    // -------------------------------------------------------------------------

    private void upperCaseAction() {
        String name = txfFullName.getText().trim();
        int index = name.indexOf(" ");
        String nameFirst = name.substring(0, index);
        String nameLast = name.substring(index, name.length());
        txfFirstName.setText(nameFirst);
        txfLastName.setText(nameLast);

    }

}
