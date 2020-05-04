package LoggInn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import Admin.FxmlLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogInnController implements Initializable {

    @FXML
    private BorderPane mainPane;


    @FXML
    private void EksisterendeBrukerButton(ActionEvent event) throws IOException {

        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("AppsScene");
        mainPane.setCenter(view);



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
