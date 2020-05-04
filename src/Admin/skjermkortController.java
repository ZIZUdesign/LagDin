package Admin;

import Data.Data;
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

public class skjermkortController implements Initializable {

    @FXML
    private TableView<Data> tableView;
    @FXML
    private TableColumn<Data, String > nameColumn;
    @FXML
    private TableColumn<Data, Integer> priceColumn;
    @FXML
    private TableColumn<Data, CheckBox> selectColumn;

    @FXML
    private void OppdaterSkjerm(TableColumn.CellEditEvent<Data, String> event) {
        try {
            event.getRowValue().setName(event.getNewValue());
        } catch (IllegalArgumentException e) {
            Dialogs.showErrorDialog("Ugyldig navn: " + e.getMessage());
        }

        tableView.refresh();
    }
    /**
     * This method will remove the selected row(s) from the table
     */
    @FXML
    public void fjernSkjerm ()
    {
        ObservableList<Data> selectedRows, allData;
        allData = tableView.getItems();

        //this gives us the rows that were selected
        selectedRows = tableView.getSelectionModel().getSelectedItems();

        //loop over the selected rows and remove the Person objects from the table
        for (Data data: selectedRows)
        {
            allData.remove(data);
        }
    }//fjernProsessor


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        CheckBox ch= new CheckBox();

        nameColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("navn"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Data, Integer>("pris"));
        selectColumn.setCellValueFactory(new PropertyValueFactory<Data, CheckBox>("velg"));



        final ObservableList<Data> list = FXCollections.observableArrayList(
                new Data("AMD Athlon 3000G Prosessor", 599),
                new Data("AMD Athlon 200GE Prosessor", 649),
                new Data("Intel Celeron G4930 Prosessor", 499),
                new Data("Intel Pentium G5420 Prosessor", 649),
                new Data("Intel Xeon Platinum 8180 Prosessor", 146459)
        );

        tableView.setItems(list);


    }
}
