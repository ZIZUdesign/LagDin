package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;


import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;
import static javafx.scene.control.cell.TextFieldTableCell.*;


public class screen1Controller implements Initializable  {

        @FXML
        private TableView<Data> tableView;
        @FXML
        private TableColumn<Data, String > navnColumn;
        @FXML
        private TableColumn<Data, Integer> prisColumn;

    //These instance variables are used to create new Data objects
    @FXML private TextField navnTextField;
    @FXML private TextField prisTextField;


    /**
     * This method will allow the user to double click on a cell and update
     * the name of the prosessor
     */
        public void OppdaterNavn( TableColumn.CellEditEvent edditedCell){
            Data rowSelected = (Data) tableView.getSelectionModel().getSelectedItems();
            rowSelected.setNavn(edditedCell.getNewValue().toString());
        }

    /**
     * This method will allow the user to double click on a cell and update
     * the name of the prosessor
     */
    public void OppdaterPris( TableColumn.CellEditEvent edditedCell){
        Data rowSelected = (Data) tableView.getSelectionModel().getSelectedItems();
        rowSelected.setPris(Double.parseDouble(edditedCell.getNewValue().toString()));
    }

    @FXML
    protected void addProsesser(ActionEvent event) {

            try {
                ObservableList<Data> data = tableView.getItems();
                data.add(new Data(navnColumn.getText(), Integer.parseInt(prisColumn.getText())));
                tableView.setItems(data);

                //navnColumn.setText("");
                //prisColumn.setText("");
            }
            catch (NumberFormatException e){
                throw new IllegalArgumentException(" Prisen må være tall "+e);
            }
        }

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
     * This method will create a new Person object and add it to the table
     */
    @FXML
    public void newPersonButtonPushed()
    {
        Data newData = new Data(navnColumn.getText(), Double.parseDouble(prisColumn.getText()));
                //tableView.getItems().add(newData);
    }


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
            //velgColumn.setCellValueFactory(new PropertyValueFactory<Data,CheckBox>("velg"));

            tableView.setEditable(true);
            navnColumn.setCellFactory(TextFieldTableCell.forTableColumn());
            //prisColumn.setCellFactory(Double.parseDouble(TextFieldTableCell.forTableColumn());






        }
    }






