import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init(){
        System.out.println("metod initialize");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("metod start");
        Parent root = FXMLLoader.load(getClass().getResource("new/loginnew.fxml"));
        primaryStage.setTitle("Logowania");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void stop(){
        System.out.println("metod stop");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
