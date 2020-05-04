package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.awt.event.ActionEvent;
import java.io.IOException;

import static sample.BytteAvScener.lastInnStage;

public class AppsFørsteSceneController {

    @FXML
    private BorderPane mainPane;

   /*public void bruker(javafx.event.ActionEvent actionEvent) throws IOException {

        lastInnStage(actionEvent, "sample.opprettBruker.fxml");

    }

    */

    public void bruker (javafx.event.ActionEvent actionEvent) throws IOException {

        lastInnStage(actionEvent, "opprettBruker.fxml");

    }


    @FXML
    private  void bruker (ActionEvent event) throws IOException {

        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("opprettBruker");
        mainPane.setCenter(view);
    }

    @FXML
    private  void LoggInn (ActionEvent event) throws IOException {

        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("LoggInn");
        mainPane.setCenter(view);
    }

    @FXML
    private  void Adminstrator (ActionEvent event) throws IOException {

        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("sample");
        mainPane.setCenter(view);
    }



}
