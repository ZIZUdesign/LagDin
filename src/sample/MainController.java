package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private BorderPane mainPane;




    @FXML
    private void  velgProsessorButton (ActionEvent event) throws IOException {
        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen1");
        mainPane.setCenter(view);

    }// prosessorButtonPresserd

    @FXML
    private void  velgSkjermkortButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen2");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgMinneButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen3");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgHarddiskButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen4");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgTastaturButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen5");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgMusButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen6");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgSkjermButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("screen7");
        mainPane.setCenter(view);

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {











    }
}
