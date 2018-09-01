package katalogpralki.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class form {

     @FXML
    private TextField lab_imie;

    @FXML
    private TextField lab_nazwsk;

    @FXML
    private TextField lab_mod;

    @FXML
    private TextField lab_email;

    @FXML
    private TextField lab_tel;

    @FXML
    public void openstg(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/katalogpralki/view/formcheck.fxml"));
            Parent root = (Parent) loader.load();

            checkform checkform = loader.getController();

            checkform.myFunction(lab_imie.getText());

            checkform.myFunction1(lab_nazwsk.getText());

            checkform.myFunction2(lab_mod.getText());

            checkform.myFunction3(lab_email.getText());

            checkform.myFunction4(lab_tel.getText());

            Stage stage = new Stage();

            stage.setScene(new Scene(root));

            stage.show();

        } catch (IOException e){

            e.printStackTrace();
        }
    }
}


