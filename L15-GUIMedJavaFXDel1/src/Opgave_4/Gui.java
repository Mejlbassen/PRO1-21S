package Opgave_4;

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
        stage.setTitle("Plus og minus");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfNumber = new TextField("50");
    private final TextField txfNumberPlus = new TextField();
    private final TextField txfNumberMinus = new TextField();

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
        Label lblNumber = new Label("Number:");
        pane.add(lblNumber, 0, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfNumber, 1, 0, 2, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnNumberPlus = new Button("+");
        Button btnNumberMinus = new Button("-");
        pane.add(btnNumberPlus, 5, 0);
        pane.add(btnNumberMinus, 5, 1);
        GridPane.setMargin(btnNumberPlus, new Insets(10, 30, 0, 10));
        GridPane.setMargin(btnNumberMinus, new Insets(10, 30, 0, 10));


        // connect a method to the button
        btnNumberPlus.setOnAction(event -> this.numberPlusAction());
        btnNumberMinus.setOnAction(event -> this.numberMinusAction());

    }

    // -------------------------------------------------------------------------
    private void numberPlusAction(){
        int tal = Integer.parseInt(txfNumber.getText());
       txfNumber.setText(String.valueOf(tal + 1));
    }

    private void numberMinusAction(){
        int tal = Integer.parseInt(txfNumber.getText());
        txfNumber.setText(String.valueOf(tal - 1));
    }


}
