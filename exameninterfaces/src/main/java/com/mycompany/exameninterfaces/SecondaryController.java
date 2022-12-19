package com.mycompany.exameninterfaces;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class SecondaryController {

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

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}