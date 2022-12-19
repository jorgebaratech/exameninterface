package com.mycompany.exameninterfaces;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button Bañadirtabla;
    @FXML
    private ChoiceBox<?> lsexo;
    @FXML
    private ChoiceBox<?> lactividad;
    @FXML
    private TextField lnombre;
    @FXML
    private Spinner<?> ledad;
    @FXML
    private Spinner<?> lpeso;
    @FXML
    private Spinner<?> laltura;
    @FXML
    private Label idinformacion;
    @FXML
    private TableColumn<?, ?> tnombre;
    @FXML
    private TableColumn<?, ?> tsexo;
    @FXML
    private TableColumn<?, ?> tedad;
    @FXML
    private TableColumn<?, ?> tpeso;
    @FXML
    private TableColumn<?, ?> taltura;
    @FXML
    private TableColumn<?, ?> tactividad;
    @FXML
    private TableColumn<?, ?> tger;
    @FXML
    private TableColumn<?, ?> tget;

    private void Bañadirtabla() throws IOException {
        App.setRoot("secondary");
    }
}
