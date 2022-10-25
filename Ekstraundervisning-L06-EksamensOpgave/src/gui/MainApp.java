package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Facilitet;
import model.Gruppe;
import model.PersonChip;


public class MainApp extends Application {

    @Override
    public void init() {
        Controller.createSomeObjects();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Holiday Paradise");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfNr = new TextField();
    private final TextField txfPersonNr = new TextField();
    private final TextField txfNavn = new TextField();
    private final TextField txfAlder = new TextField();
    private final TextField txfMaxSaldo = new TextField();
    private final TextField txfGruppeNr = new TextField();

    private final ListView<PersonChip> lvwPersoner = new ListView<>();
    private final ListView<Facilitet> lvwFaciliteter = new ListView<>();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblGruppe = new Label("Gruppe:");
        pane.add(lblGruppe, 0, 0);

        Label lblNr = new Label("Nr:");
        pane.add(lblNr, 0, 1);

        pane.add(txfNr, 1, 1);
        txfNr.setPrefWidth(100);

        Button btnOpret = new Button("Opret gruppe");
        pane.add(btnOpret, 0, 2, 2, 1);
        btnOpret.setOnAction(event -> this.opretAction());

        Label lblPerson = new Label("Person:");
        pane.add(lblPerson, 0, 3);

        Label lblPersonNr = new Label("Nr:");
        pane.add(lblPersonNr,0,4);

        pane.add(txfPersonNr, 1, 4);
        txfPersonNr.setPrefWidth(100);

        Label lblNavn = new Label("Navn:");
        pane.add(lblNavn, 0, 5);

        pane.add(txfNavn, 1, 5);
        txfNavn.setPrefWidth(100);

        Label lblAlder = new Label("alder:");
        pane.add(lblAlder, 0, 6);

        pane.add(txfAlder, 1, 6);
        txfAlder.setPrefWidth(100);

        Label lblMaxSaldo = new Label("Max saldo:");
        pane.add(lblMaxSaldo, 0, 7);

        pane.add(txfMaxSaldo, 1, 7);
        txfMaxSaldo.setPrefWidth(100);

        Label lblGruppeNr = new Label("GruppeNr:");
        pane.add(lblGruppeNr,0,8);

        pane.add(txfGruppeNr, 1, 8);
        txfGruppeNr.setPrefWidth(100);

        Button btnAdd = new Button("Tilføj person til gruppe");
        pane.add(btnAdd, 0, 9, 2, 1);
        btnAdd.setOnAction(event -> this.addAction());

        Label lblPersoner = new Label("Personer:");
        pane.add(lblPersoner, 2, 0);

        pane.add(lvwPersoner, 2, 1, 1, 7);
        lvwPersoner.setPrefWidth(200);
        lvwPersoner.setPrefHeight(150);

        Label lblFaciliteter = new Label("Faciliteter:");
        pane.add(lblFaciliteter, 2, 8);

        pane.add(lvwFaciliteter, 2, 9);
        lvwFaciliteter.setPrefWidth(200);
        lvwFaciliteter.setPrefHeight(150);

        Button btnUse = new Button("Person bruger facilitet");
        pane.add(btnUse, 2, 11);
        btnUse.setOnAction(event -> this.useAction());

        this.fillTxaPersoner();
        this.fillTxaFaciliteter();
    }

    private void opretAction() {
        int nr = Integer.parseInt(txfNr.getText());
        Controller.opretGruppe(nr);

        // Test
        System.out.println("Oprettet: Gruppe " + nr);
    }

    private void fillTxaPersoner() {
        lvwPersoner.getItems().clear();
        lvwPersoner.getItems().setAll(Controller.getPersoner());
    }

    private void addAction() {
        int gruppeNr = Integer.parseInt(txfGruppeNr.getText().trim());
        Gruppe gruppe = Controller.findGruppe(gruppeNr);

        // int nr = Integer.parseInt(txfNr.getText().trim());
        String navn = txfNavn.getText().trim();
        int alder = Integer.parseInt(txfAlder.getText().trim());
        int maxSaldo = Integer.parseInt(txfMaxSaldo.getText().trim());

        Controller.opretPerson(10, navn, maxSaldo, alder, gruppe);

        this.fillTxaPersoner();

        // Test
        System.out.println("Personer: " + Controller.getPersoner());
    }

    private void fillTxaFaciliteter() {
        lvwFaciliteter.getItems().clear();
        lvwFaciliteter.getItems().setAll(Controller.getFaciliteter());
    }

    private void useAction() {
        PersonChip selectedPerson = lvwPersoner.getSelectionModel().getSelectedItem();
        Facilitet selectedFacilitet = lvwFaciliteter.getSelectionModel().getSelectedItem();
        if (selectedPerson != null && selectedFacilitet != null) {
            Controller.addPersonTilFacilitet(selectedPerson, selectedFacilitet);

            // Test
            System.out.println(selectedPerson.getNavn() + "'s faciliteter:");
            System.out.println("\t" + selectedPerson.getFaciliteter());
        }
    }
}
