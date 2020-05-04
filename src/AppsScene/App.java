package AppsScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application  {

    @Override
    public void start(Stage Stage) {

     try {
        Parent root = FXMLLoader.load(getClass().getResource("AppsFørsteScene.fxml"));
        Stage.setScene(new Scene(root));
        Stage.show();

    } catch (Exception e){
       e.printStackTrace();
     }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
