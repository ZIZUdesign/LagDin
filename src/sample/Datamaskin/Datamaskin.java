package sample.Datamaskin;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Datamaskin {

    public static ObservableList<Datamaskin> prosessorListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> prosessorPrisListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> skjermkortListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> skjermkortPrisListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> minneListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> minnePrisListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> harddiskListe= FXCollections.observableArrayList();
    public static ObservableList<Datamaskin> harrdiskListe= FXCollections.observableArrayList();




    private static SimpleStringProperty prosessor;
    private SimpleStringProperty skjermkort;
    private SimpleStringProperty minne;
    private SimpleStringProperty harddisk;






    public static ObservableList<Datamaskin> DataKomplett= FXCollections.observableArrayList();



}
