package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import service.DialogWindow;

import java.util.Arrays;


public class LoginController {

    @FXML
    private TextField tf_login;

    @FXML
    private TextField tf_password;

    @FXML
    private PasswordField pf_password;

    @FXML
    private CheckBox cb_show;

    @FXML
    private Button btn_login;

    @FXML
    void keyloginAction(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)) {
            System.out.println("Enter");
            myLoginAction();
        }
    }

    private void myLoginAction() {
        if (tf_login.getText().equals("adm")
                && (tf_password.getText().equals("adm") || pf_password.getText().equals("adm"))) {
            System.out.println("LOGOWANIE ADMINA");

        } else if (tf_login.getText().equals("arek")
                && (tf_password.getText().equals("arek") || pf_password.getText().equals("a"))) {
            System.out.println("LOGOWANIA UZYTKOWNIKA");
        } else {
            DialogWindow alert = new DialogWindow(Alert.AlertType.ERROR,
                    "Bład",
                    "Bład logowania",
                    "Prosze poprawny hasło i login podac");
            }
        }

    @FXML
    void loginAction(MouseEvent event) {
myLoginAction();
    }


    @FXML
    void showPasswordAction(MouseEvent event) {
        if (cb_show.isSelected()){
            tf_password.setVisible(true);
            pf_password.setVisible(false);
            String password = pf_password.getText();
            tf_password.setText(password);
        } else{
            tf_password.setVisible(false);
            pf_password.setVisible(true);
            tf_password.setText(pf_password.getText());
        }
    }
}
