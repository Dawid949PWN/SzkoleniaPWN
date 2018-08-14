package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import service.DBController;
import service.DialogWindow;
import service.Logcounter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public static String email;

    @FXML
    private TextField tf_login;

    @FXML
    private TextField tf_password;

    @FXML
    private PasswordField pf_password;

    @FXML
    private Label ibl_email;

    @FXML
    private CheckBox cb_show;

    @FXML
    private Button btn_login;

    String password;
    PreparedStatement ps;
    public static String Email;

    @FXML
    void keyloginAction(KeyEvent event) throws SQLException, IOException, ClassNotFoundException {
        if(event.getCode().equals(KeyCode.ENTER)) {
            System.out.println("Enter");
            myLoginAction();
        }
    }

    private void myLoginAction() throws SQLException, ClassNotFoundException, IOException {
        DBController db = new DBController();
        Connection conn = db.getconn();
        System.out.println(conn);
        if (cb_show.isSelected()){
            password = tf_password.getText();
        } else {
            password = pf_password.getText();
        }

    ps = conn.prepareStatement("SELECT Permission, email FROM users WHERE email = ? AND password = ?");
    ps.setString(1, tf_login.getText());
    ps.setString(2, password);
    ResultSet result = ps.executeQuery();

    if (result.next()) {
        String permission = result.getString("permission");
        email = result.getString("email");
            if (permission.equals("ADMIN")){
                System.out.println("Panel Administratora");
            }
             else {
                Stage userStags = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/new/userView.fxml"));
                userStags.setTitle("Hello World");
                userStags.setScene(new Scene(root));
                userStags.show();
            }
        } else {
                DialogWindow start = new DialogWindow(
                    Alert.AlertType.ERROR,
                    "Bład",
                    "Bład Logowania",
                    "Musisz podac prawidłowy login lub hasła: " + (Logcounter.count - 1)
                );
            }
        }

    @FXML
    void loginAction(MouseEvent event) throws SQLException, ClassNotFoundException, IOException {
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
