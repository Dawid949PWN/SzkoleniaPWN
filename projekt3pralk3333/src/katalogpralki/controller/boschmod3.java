package katalogpralki.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class boschmod3 {


    @FXML
    private Button btn_user_back;


    @FXML
    public void userBackAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/wyborpral.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }

    @FXML
    public void panel_UserActi3(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/form.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Form");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
