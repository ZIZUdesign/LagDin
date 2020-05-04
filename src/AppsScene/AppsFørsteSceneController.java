package AppsScene;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

import static AppsScene.BytteAvScener.lastInnStage;

public class AppsFørsteSceneController {

    @FXML
    private BorderPane mainPane;

   public void bruker(javafx.event.ActionEvent actionEvent) throws Exception {

        lastInnStage(actionEvent, "AppsScene/opprettBruker.fxml");

    }


    public void Adminstrator(javafx.event.ActionEvent actionEvent) throws Exception {
        lastInnStage(actionEvent, "AppsScene/fxml");
    }




    public void LoggInn(javafx.event.ActionEvent actionEvent) throws Exception {

        lastInnStage(actionEvent, "AppsScene/LoggInn.fxml");
    }
}
