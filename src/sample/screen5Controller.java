package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class screen5Controller implements Initializable {

    @FXML
    private TableView<Data> tableView;
    @FXML
    private TableColumn<Data, String > navnColumn;
    @FXML
    private TableColumn<Data, Integer> prisColumn;
    @FXML
    private TableColumn<Data, CheckBox> velgColumn;







    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CheckBox ch= new CheckBox();
        navnColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("navn"));
        prisColumn.setCellValueFactory(new PropertyValueFactory<Data, Integer>("pris"));
        velgColumn.setCellValueFactory(new PropertyValueFactory<Data, CheckBox>("velg"));



        final ObservableList<Data> list = FXCollections.observableArrayList(
                new Data("AMD Athlon 3000G Prosessor", 599,ch),
                new Data("AMD Athlon 200GE Prosessor", 649,ch),
                new Data("Intel Celeron G4930 Prosessor", 499,ch),
                new Data("Intel Pentium G5420 Prosessor", 649,ch),
                new Data("Intel Xeon Platinum 8180 Prosessor", 146459,ch)
        );

        tableView.setItems(list);


    }
}
