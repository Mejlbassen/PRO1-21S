package Gui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {
  
    @Override
    public void start(Stage stage) {
        stage.setTitle("Udlejning");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private TextField txfName;
    private ListView<String> lvwNames;
    private ListView<String> lvwKunde;
    private ArrayList<String> names;
    private ArrayList<String> kunder;
    private final Label lblTxt = new Label("Bil Klasse");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        this.initNames();
        this.initKunder();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a HBox (horizontal box) to the pane (at col=0, row=0)
        HBox box = new HBox();
        pane.add(box, 2, 3);

        String[] colorStrings = { "A", "B", "C", "Lig" };
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK };

        // add 4 radio buttons to the box
        for (int i = 0; i < colors.length; i++) {
            RadioButton rb = new RadioButton();
            box.getChildren().add(rb);
            rb.setText(colorStrings[i]);
            // make the radio button remember its own color
            rb.setUserData(colors[i]);
            // ensure that only one radio button is in selected state
            rb.setToggleGroup(group);
            // set the method to execute when a radio button is selected
            rb.setOnAction(event -> this.setLabelColor());
        }

        // add a centered label to the pane (at col=0, row=1)
        pane.add(lblTxt, 1, 3);
        GridPane.setHalignment(lblTxt, HPos.CENTER);

        // select first radio button and update color of lblText
        RadioButton rb0 = (RadioButton) group.getToggles().get(0);
        rb0.setSelected(true);
        lblTxt.setTextFill(colors[0]);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Udlejning:");
        pane.add(lblName, 1, 0);

        // add a label to the pane (at col=0, row=1)
        Label lblNames = new Label("Udlejninger:");
        pane.add(lblNames, 1, 1);
        GridPane.setValignment(lblNames, VPos.TOP);

        // add a text field to the pane (at col=1, row=0)
        txfName = new TextField();
        pane.add(txfName, 2, 0);


        // add a listView to the pane(at col=1, row=1)
        lvwNames = new ListView<String>();
        pane.add(lvwNames, 2, 1);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.getItems().setAll(this.initNames());

        lvwKunde = new ListView<String>();
        pane.add(lvwKunde, 4, 1);
        lvwKunde.setPrefWidth(200);
        lvwKunde.setPrefHeight(200);
        lvwKunde.getItems().setAll()


        ChangeListener<String> listener = (ov, oldString, newString) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwNames.getSelectionModel().clearSelection();

        // add a button to the pane (at col=4, row=0)
        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 0, 0);

        Button btnRediger = new Button("Rediger");
        pane.add(btnRediger, 0, 1);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());

        // add a button to the pane (at col=4, row=1)
        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 0, 2);

        // connect a method to the button
        btnDelete.setOnAction(event -> this.deleteAction());

    }

    // -------------------------------------------------------------------------

    private ArrayList<String> initNames() {
        names = new ArrayList<String>();
        names.add("Ford XT");
        names.add("Opel Cadet");
        names.add("Peugeot 406");
        return names;
    }

    private ArrayList<String> initKunder(){
        kunder = new ArrayList<String>();
        kunder.add("Clara Jensen");
        kunder.add("Thomas Langvad");
        return kunder;
    }

    // -------------------------------------------------------------------------
    // Selection changed actions

    private void selectionChanged() {
        String selected = lvwNames.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected);
        } else {
            txfName.clear();
        }
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            names.add(name);
            lvwNames.getItems().setAll(names);
        }
    }

    private void deleteAction() {
        int index = lvwNames.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            names.remove(index);
            txfName.clear();
            lvwNames.getItems().setAll(names);
        }

        // RadioButton action
    }

    private void setLabelColor() {
        RadioButton rb = (RadioButton) group.getSelectedToggle();
        Color color = (Color) rb.getUserData();
        lblTxt.setTextFill(color);
    }
}
