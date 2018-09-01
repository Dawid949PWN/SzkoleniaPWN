package katalogpralki.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Stronastartowa {

    @FXML
    private Button btn_panlUser;

    @FXML
    public void panelUsrAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/wyborpral.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Projektpralk");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
