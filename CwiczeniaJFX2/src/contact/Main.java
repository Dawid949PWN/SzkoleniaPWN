package contact;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init(){
        System.out.println("metod init");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("metod start");
        Parent root = FXMLLoader.load(getClass().getResource("contactbook.fxml"));
        primaryStage.setTitle("Contact Panel");
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Contactbook");
        primaryStage.setWidth(650);
        primaryStage.setHeight(700);
        primaryStage.show();
    }

    @Override
    public void stop(){
        System.out.println("metod stop");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
