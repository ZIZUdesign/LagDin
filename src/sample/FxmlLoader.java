package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;



public class FxmlLoader {
    private Pane view ;

    public Pane getPage (String fileName ) throws IOException {





        view = new FXMLLoader().load(getClass().getResource(fileName +".fxml"));

        return view;

    }// getPage

}// FxmlLoader
