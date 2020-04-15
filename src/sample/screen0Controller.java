package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.awt.event.ActionEvent;
import java.io.IOException;

import static sample.BytteAvScener.lastInnStage;

public class screen0Controller  {

    @FXML
    private BorderPane mainPane;

   /*public void bruker(javafx.event.ActionEvent actionEvent) throws IOException {

        lastInnStage(actionEvent, "sample.opprettBruker.fxml");

    }

    */

    public void bruker (javafx.event.ActionEvent actionEvent) throws IOException {

        lastInnStage(actionEvent, "sample.fxml");

    }


    @FXML
    private  void bruker (ActionEvent event) throws IOException {

        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("sample0");
        mainPane.setCenter(view);
    }

}
