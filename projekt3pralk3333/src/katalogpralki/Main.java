package katalogpralki;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void init() {
        System.out.println("METODA INIT ");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("METODA START");
        Parent root = FXMLLoader.load(getClass().getResource("/katalogpralki/view/projekt3.fxml"));
        primaryStage.setTitle("Katalogpralki");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.out.println("KONIEC METODY ");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
