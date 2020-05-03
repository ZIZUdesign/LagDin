package sample.Administrator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import sample.ConvertersWithErrorHandling;
import sample.Data;
import sample.Dialogs;


import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;


public class screen1Controller implements Initializable {

        @FXML
        private TableView<Data> tableView;
        @FXML
        private TableColumn<Data, String > navnColumn;
        @FXML
        private TableColumn<Data, Integer> prisColumn;

    //These instance variables are used to create new Data objects
    @FXML private TextField navnTextField;
    @FXML private TextField prisTextField;

    private ConvertersWithErrorHandling.IntegerStringConverter intStrConverter
            = new ConvertersWithErrorHandling.IntegerStringConverter();




    /**
     * This method will allow the user to double click on a cell and update
     * the name of the prosessor
     */
    @FXML
    private void OppdaterNavn(TableColumn.CellEditEvent<Data, String> event) {
        try {
            event.getRowValue().setName(event.getNewValue());
        } catch (IllegalArgumentException e) {
            Dialogs.showErrorDialog("Ugyldig navn: " + e.getMessage());
        }

        tableView.refresh();
    }
    /**
     * This method will allow the user to double click on a cell and update
     * the pris  of the prosessor
     */



    /**
     * This method will remove the selected row(s) from the table
     */
    @FXML
    public void fjernProsessor ()
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

    /**
     * This method will create a new Data object and add it to the table
     */



        ObservableList<Data> list= FXCollections.observableArrayList();

        @Override
        public void initialize(URL location, ResourceBundle resources) {



            final ObservableList<Data> list = FXCollections.observableArrayList(
                new Data("AMD Athlon 3000G Prosessor", 599),
                new Data("AMD Athlon 200GE Prosessor", 649),
                new Data("Intel Celeron G4930 Prosessor", 499),
                new Data("Intel Pentium G5420 Prosessor", 649),
                new Data("Intel Xeon Platinum 8180 Prosessor", 146459)
        );



            tableView.setItems(list);

            navnColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("navn"));
            prisColumn.setCellValueFactory(new PropertyValueFactory<Data, Integer>("pris"));


            tableView.setEditable(true);
            navnColumn.setCellFactory(TextFieldTableCell.forTableColumn());
            prisColumn.setCellFactory(TextFieldTableCell.forTableColumn(intStrConverter));






        }
    }






