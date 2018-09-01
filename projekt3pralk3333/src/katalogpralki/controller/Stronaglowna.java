package katalogpralki.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class Stronaglowna {

    @FXML
    private ImageView btn_uzytkown_wybj;

    @FXML
    private ImageView btn_uzytkown_wybj2;

    @FXML
    private ImageView btn_uzytkown_wybj3;

    @FXML
    private Button btn_usr_ord;

    @FXML
    public void uzytkown_Action1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/boschmod.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Model_Boscha");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();

    }
    @FXML
    public void uzytkown_Action2(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/elektroluxmod.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Model_Elektroluxa");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
        Stage stage = (Stage) btn_usr_ord.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void uzytkown_Action3(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/whirpoolmod.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Model_Whirpoolu");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
    @FXML
    public void btn_uzytkown_Acti(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/form.fxml"));

        Stage primaryStage = new Stage();

        primaryStage.setTitle("Formpage");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}