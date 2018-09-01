package katalogpralki.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class checkform implements Initializable {

    @FXML
    private Label twojeimie;

    @FXML
    private Label twojenazwisk;

    @FXML
    private Label modelnazw;

    @FXML
    private Label pocztmail;

    @FXML
    private Label numertel;

    @FXML
    private Label lbl_imie;

    @FXML
    private Label lbl_nazwisko;

    @FXML
    private Label lbl_model;

    @FXML
    private Label lbl_email;

    @FXML
    private Label lbl_tel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void myFunction(String text) {
        lbl_imie.setText(text);
    }

    public void myFunction1(String text){
        lbl_nazwisko.setText(text);
    }

    public void myFunction2(String text){
        lbl_model.setText(text);
    }

    public void myFunction3(String text){
        lbl_email.setText(text);
    }

    public void myFunction4(String text){
        lbl_tel.setText(text);
    }
}



