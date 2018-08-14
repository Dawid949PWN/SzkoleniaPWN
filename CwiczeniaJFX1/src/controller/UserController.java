package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController {

    @FXML
    private Label ibl_email;

    public void initialize() {
        ibl_email.setText(ibl_email.getText() + LoginController.email);
    }
}
