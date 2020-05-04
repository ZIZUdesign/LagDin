package Admin;

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
        Pane view = object.getPage("Prosessor");
        mainPane.setCenter(view);

    }// prosessorButtonPresserd

    @FXML
    private void  velgSkjermkortButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Skjermkort");
        mainPane.setCenter(view);

    }

    @FXML
    private void  velgMinneButton (ActionEvent event) throws IOException {

        System.out.println("You cliked me ");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Minne");
        mainPane.setCenter(view);

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {











    }
}
