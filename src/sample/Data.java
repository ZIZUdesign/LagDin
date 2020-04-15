package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class Data {

    private SimpleStringProperty navn;
    private SimpleDoubleProperty pris;
    private CheckBox velg;

    public Data(String fnavn, int newPris, CheckBox ch) {
        this.navn = new SimpleStringProperty(fnavn);
        this.pris = new SimpleDoubleProperty(newPris);
        this.velg= new CheckBox();

    }


    public String getNavn() {
        return navn.get();
    }



    public void setNavn(String navn) {
        this.navn.set(navn);
    }



    public double  getPris() {
        return pris.get();
    }

    public void setPris(double pris) {
        this.pris.set(pris);
    }

    public CheckBox getSelect() {
        return velg;
    }

    public void setSelect(CheckBox select) {
        this.velg = select;
    }


}
